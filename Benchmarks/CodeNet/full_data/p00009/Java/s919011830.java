import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			int n = input();
			int count;

			if (n <= 1) {

				count = 0;

			} else if (n == 2) {

				count = 1;

			} else {

				count =2;

				for (int i = 3; i <= n; i += 2) {

					for (int j = 3; j <= i; j++) {

						if (i % j == 0) {

							break;

						} else {

							count++;
							break;

						}
					}
				}

				System.out.println(count);

			}
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