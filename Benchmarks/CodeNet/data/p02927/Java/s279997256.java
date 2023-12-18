import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();

		int D = scanner.nextInt();

		int count = 0;

		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= D; j++) {
				if (i == ((j / 10) * (j % 10))
						&& (j / 10) != 1
						&& (j % 10) != 1) {
					count++;
				}
			}
		}

		log(count);

	}

	private static void log(String str) {
		System.out.println(str);
	}

	private static void log(int str) {
		System.out.println(str);
	}

	private static void log(double str) {
		System.out.println(str);
	}

}