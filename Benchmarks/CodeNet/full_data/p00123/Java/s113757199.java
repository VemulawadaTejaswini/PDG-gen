
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			int c = slove(a);
			int d = slove2(b);
			int max = Math.max(c, d);
			System.out.println(slove3(max));
		}
	}

	private static String slove3(int max) {
		switch (max) {
		case 1:
			return"AAA";
		case 2:
			return "AA";
		case 3:
			return "A";
		case 4:
			return "B";
		case 5:
			return "C";
		case 6:
			return "D";
		case 7:
			return "E";
		default:
			return "NA";
		}
	}

	private static int slove2(double b) {
		if (b < 71)
			return 1;
		else if (b < 77)
			return 2;
		else if (b < 83)
			return 3;
		else if (b < 89)
			return 4;
		else if (b < 105)
			return 5;
		else if (b < 116)
			return 6;
		else if (b < 148)
			return 7;
		else
			return 8;
	}

	private static int slove(double a) {
		if (a < 35.5)
			return 1;
		else if (a < 37.5)
			return 2;
		else if (a < 40.0)
			return 3;
		else if (a < 43.0)
			return 4;
		else if (a < 50)
			return 5;
		else if (a < 55)
			return 6;
		else if (a < 70)
			return 7;
		else
			return 8;
	}
}