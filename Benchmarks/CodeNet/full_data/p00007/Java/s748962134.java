import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = input();
		double dept = 100000;

		for (int i = 0; i < n; i++) {

			dept *= 1.05;

			if (dept % 1000 != 0) {

				dept = (Math.ceil(dept / 1000)) * 1000;

			}
		}

		System.out.println((int)dept);

		close();

	}

	public static int input() {

		return scanner.nextInt();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}