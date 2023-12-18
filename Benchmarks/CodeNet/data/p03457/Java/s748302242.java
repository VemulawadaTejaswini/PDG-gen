
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numA = 0;
		int numB = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			if (numA * numB % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		String numA = "";
		String numB = "";

		try {
			scanner = new Scanner(System.in);
			numA = scanner.next();
			numB = scanner.next();

			double wkNum = Double.parseDouble(numA + numB);
			int wk = (int) Math.sqrt(wkNum);
			if (Math.pow(wk, 2) == wkNum) {
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
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			int[] t = new int[numN];
			int[] x = new int[numN];
			int[] y = new int[numN];

			for (int i = 0; i < t.length; i++) {
				t[i] = scanner.nextInt();
				x[i] = scanner.nextInt();
				y[i] = scanner.nextInt();
			}

			int cT = 0;
			int cX = 0;
			int cY = 0;
			for (int i = 0; i < numN; i++) {

				boolean wkB = (t[i] % 2 == 0);
				boolean wkB2 = ((x[i] + y[i]) % 2 == 0);

				if (wkB != wkB2) {
					System.out.println("No");
					return;
				}

				if (t[i] - cT < Math.abs(Math.abs(cX + cY) - Math.abs(x[i] + y[i]))) {
					System.out.println("No");
					return;
				} else {
				}
				cT = t[i];
				cX = x[i];
				cY = y[i];
			}

			System.out.println("Yes");

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