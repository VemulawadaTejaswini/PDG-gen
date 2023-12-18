
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
		//		new Main().solveE();
		//		new Main().solveF();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;
		int numA = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numA = scanner.nextInt();

			int res = numN % 500;

			System.out.println(res <= numA ? "Yes" : "No");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int[] wk = new int[numN];
			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			Arrays.sort(wk);

			int alice = 0;
			int bob = 0;
			boolean convert = true;
			for (int i = wk.length - 1; i >= 0; i--) {
				if (convert) {
					alice += wk[i];
				} else {
					bob += wk[i];
				}
				convert = !convert;
			}

			System.out.println(alice - bob);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
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

	private void solveE() {
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

	private void solveF() {
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