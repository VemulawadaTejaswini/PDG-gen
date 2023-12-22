import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		StringBuilder output = new StringBuilder();

		while (true) {

			int a = Integer.parseInt(input());
			String op = input();
			int b = Integer.parseInt(input());

			if (op.equals("+")) {

				output.append(a + b);

			} else if (op.equals("-")) {

				output.append(a - b);

			} else if (op.equals("*")) {

				output.append(a * b);

			}else if (op.equals("/")) {

				output.append(a / b);

			} else if (op.equals("?")) {

				output.delete(output.length() - 1, output.length());
				break;

			}

			output.append("\n");

		}

		System.out.println(output);
		close();

	}

	public static String input() {

		return scanner.next();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}