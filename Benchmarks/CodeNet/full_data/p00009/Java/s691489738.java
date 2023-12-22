import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			int n = input();
			int count = 0;
			boolean[] flag = new boolean[n + 1];

			for (int i = 2; i <= n; i++) {

				if (! flag[i]) {

					count++;

					for (int j = 2; i * j <= n; j++) {

						flag[i * j] = true;

					}
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