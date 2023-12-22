import java.util.Scanner;

public class Main {

	/**
	 * Digit Number
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			System.out.println(calcNumberDigit(a, b));
		}
	}

	private static int calcNumberDigit(int a, int b) {
		int target = a + b;
		int result = 1;
		int divide = 10;

		while (true) {
			if (target / divide < 1) {
				return result;
			}
			result++;
			divide *= 10;
		}
	}
}