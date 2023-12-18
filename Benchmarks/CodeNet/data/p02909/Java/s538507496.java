package beginner141.problem1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		String output;
		
		switch(input) {
		case "Sunny":
			output = "Cloudy";
			break;
		case "Cloudy":
			output = "Rainy";
			break;
		case "Rainy":
			output = "Sunny";
			break;
		default:
			output = "Error";
			break;
		}
		
		System.out.println(output);
	}
}