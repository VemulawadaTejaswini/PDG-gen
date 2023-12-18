import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		if (n.charAt(0) == 'S') {
			System.out.print("Cloudy");

		} else if (n.charAt(0) == 'C') {
			System.out.print("Rainy");

		} else {
			System.out.print("Sunny");
		}

	}
}