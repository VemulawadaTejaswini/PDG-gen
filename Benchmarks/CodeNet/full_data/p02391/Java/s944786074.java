import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number1 = input();
		int number2 = input();

		if (number1 < number2) {

			System.out.println(number1 + "<" + number2);

		} else if (number2 < number1) {

			System.out.println(number1 + ">" +  number1);

		} else {

			System.out.println(number1 + "==" +  number1);

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