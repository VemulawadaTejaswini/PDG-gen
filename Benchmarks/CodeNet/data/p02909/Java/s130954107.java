import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String n ="";
		
		switch (s) {
			case "Sunny":
				n = "Cloudy";
				break;
			case "Cloudy":
				n = "Rainy";
				break;
			case "Rainy":
				n = "Sunny";
				break;
		}
		
		System.out.println(n);
		
		sc.close();	
	}
}