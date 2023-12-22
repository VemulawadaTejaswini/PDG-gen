import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		StringBuilder output = new StringBuilder();

		while (true) {

			int number1 = input();
			int number2 = input();

			if (number1 < number2) {

				output.append(number1 + " " + number2);

			} else if (number2 < number1) {

				output.append(number2 + " " + number1);

			} else if (number1 ==0 && number2 == 0) {

				output.delete(output.length() -1, output.length());
				break;

			} else if (number1 == number2){

				output.append(number1 + " " + number2);

			}

			output.append("\n");

		}

		System.out.println(output);

		close();

	}

	public static int input() {

		return Integer.parseInt(scanner.next());

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}