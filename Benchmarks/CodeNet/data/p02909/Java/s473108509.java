import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		//System.out.println(S);
		if (S.equals("Sunny")) {
			System.out.println("Cloudy");
		} else if (S.equals("Rainy")) {
			System.out.println("Sunny");
		} else {
			System.out.println("Rainy");
		}
	}
}
