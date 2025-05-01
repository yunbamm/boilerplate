package com.bangbang.boilerplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "BANGBANG Boilerplate API",
				version = "1.0",
				description = "Boilerplate project"
		)
)
@Slf4j
@SpringBootApplication
public class BoilerplateApplication {

	public static void main(String[] args){
		log.info("[BANGBANG] start application");
		SpringApplication.run(BoilerplateApplication.class, args);
	}

}
