
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveB();
		//		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;
		int numA = 0;
		int numB = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			System.out.println(Math.min(numA * numN, numB));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int addAllDigit(int num) {
		if (num < 10) {
			return num;
		}
		return addAllDigit(num / 10) + num % 10;
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int res = addAllDigit(numN);

			if (numN % res == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");

			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}