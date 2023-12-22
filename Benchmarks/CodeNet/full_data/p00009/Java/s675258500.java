import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			int n = input();
			int count = 0;

			for (int i = 1; i <= n; i++) {

				if (n % i == 0) {

					count++;

				}
			}

			System.out.println(count);

		}

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