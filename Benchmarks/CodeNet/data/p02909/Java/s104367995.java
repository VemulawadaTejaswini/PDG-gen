import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力受付
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String tomorrow = null;
		switch (s) {
		case "Sunny":
			tomorrow = "Cloudy";
			break;
		case "Cloudy":
			tomorrow = "Rainy";
			break;
		case "Rainy":
			tomorrow = "Sunny";
			break;
		}

		System.out.println(tomorrow);
	}
}
