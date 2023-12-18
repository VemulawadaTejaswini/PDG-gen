import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
	
		if (S == "Sunny") {
			System.out.println("Cloudy");
		} else if (S == "Rainy") {
			System.out.println("Sunny");
		} else {
			System.out.println("Rainy");
		}
	}
}
