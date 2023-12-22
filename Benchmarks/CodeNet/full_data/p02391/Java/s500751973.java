import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int a = input();
		int b = input();

		if (a < b) {

			System.out.println("a" + " < " + "b");

		} else if (b < a) {

			System.out.println("a" + " > " + "b");

		} else {

			System.out.println("a" + " == " + "b");

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