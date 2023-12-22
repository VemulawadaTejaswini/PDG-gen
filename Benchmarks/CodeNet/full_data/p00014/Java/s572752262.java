import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			int d = input();
			int sumArea = 0;

			for (int i = 0; i < 600; i += d) {

				sumArea += i * i* d;

			}

			System.out.println(sumArea);

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