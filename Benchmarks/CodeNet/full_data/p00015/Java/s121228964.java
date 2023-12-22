import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = Integer.parseInt(input());

		for (int i = 0; i < N; i++) {

			String num1 = input();
			String num2 = input();

			if (80 < num1.length() || 80 < num2.length()) {

				System.out.println("overflow");

			} else {

				BigInteger bigNum1 = new BigInteger(num1);
				BigInteger bigNum2 = new BigInteger(num2);
				String result = bigNum1.add(bigNum2).toString();

				if (80 < result.toString().length()) {

					System.out.println("overflow");

				} else {

					System.out.println(result.toString());

				}
			}
		}

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}