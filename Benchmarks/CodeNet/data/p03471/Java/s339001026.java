import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int y;
		try (Scanner scanner = new Scanner(System.in)) {
			n = scanner.nextInt();
			y = scanner.nextInt();
		}

		int a = y / 10000;
		int b = y % 10000 >= 5000 ? 1 : 0;
		int c = y % 10000 >= 5000 ? y % 10000 / 1000 - 5 : y % 10000 / 1000;

		if (n > y / 1000) {
			Main.printFailed();
			return;
		}
		if (n < a + b + c) {
			Main.printFailed();
			return;
		}

		while (true) {
			if (a < 0 || b < 0 || c < 0) {
				Main.printFailed();
				break;
			} else if (n >= a + b + c + 9) {
				a -= 1;
				c += 10;
			} else if (n >= a + b + c + 4) {
				b -= 1;
				c += 5;
			} else if (n >= a + b + c + 1) {
				a -= 1;
				b += 2;
			} else if (n == a + b + c) {
				Main.printSuccseeded(a, b, c);
				break;
			} else {
				Main.printFailed();
				break;
			}
		}
	}

	public static void printFailed() {
		System.out.println("-1 -1 -1");
	}

	public static void printSuccseeded(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}