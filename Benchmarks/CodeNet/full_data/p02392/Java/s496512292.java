import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] number = new int[3];

		for (int i = 0; i < 3;i++) {

			number[i] = input();

		}

		if (number[0] < number[1] && number[1] < number[2]) {

			System.out.println("Yes");

		} else {

			System.out.println("No");

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