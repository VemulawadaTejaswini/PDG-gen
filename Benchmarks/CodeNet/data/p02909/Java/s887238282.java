
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		
		switch(S) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		case "Rainy":
			System.out.println("Sunny");
			break;
		}
	}
}
		
	