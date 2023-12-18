
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numM = 0;

		try {
			scanner = new Scanner(System.in);
			numM = scanner.nextInt();

			System.out.println(24 + 24 - numM);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numA = 0;
		int numB = 0;
		String s = "";

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			s = scanner.next();
			try {
				String wkA = s.substring(0, numA);
				String wkB = s.substring(numA + 1, s.length());
				Integer.parseInt(wkA);
				Integer.parseInt(wkB);

				if (numA + numB + 1 == s.length()) {
					String wk = s.substring(numA, numA + 1);
					if (wk.equals("-")) {
						System.out.println("Yes");
						return;
					}
				}
			} catch (NumberFormatException e) {
				//				e.printStackTrace();
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("No");
	}

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}