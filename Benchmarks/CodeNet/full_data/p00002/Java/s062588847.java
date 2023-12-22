import java.util.Scanner;

public class Main {

	static final String DELIMITER = " |\\r\\n|\\z";

	/**
	 * Digit Number
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useDelimiter(DELIMITER);

		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			System.out.println(String.valueOf(a + b).length());
		}
	}
}