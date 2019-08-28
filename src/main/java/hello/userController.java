package hello;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class userController {
	private static List<User>users = new ArrayList<User>(); 
	@GetMapping
	public List<User> loadallEmployees(){
		return users;
	}
}
