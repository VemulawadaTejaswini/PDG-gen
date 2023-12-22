
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			System.out.println(slove(a, b));
		}
	}


	private static String slove(double a, double b) {
		if (a < 35.5 && b < 71)
			return "AAA";
		else if (a < 37.5 && b < 77)
			return "AA";
		else if (a < 40 && b < 83)
			return "A";
		else if (a < 43 && b < 89)
			return "B";
		else if (a < 50 && b < 105)
			return "C";
		else if (a < 55 && b < 116)
			return "D";
		else if (a < 70 && b < 148)
			return "E";
		else
			return "NA";
	}
}