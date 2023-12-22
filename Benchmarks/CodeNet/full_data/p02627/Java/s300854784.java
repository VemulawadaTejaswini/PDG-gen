package comp;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		String output = "a";
		char validate;

		Scanner sc = new Scanner(System.in);

		output = sc.next();
		validate = output.charAt(0);

		if(Character.isUpperCase(validate)){
			output = "A";
		}
		
		System.out.println(output);
	}
}