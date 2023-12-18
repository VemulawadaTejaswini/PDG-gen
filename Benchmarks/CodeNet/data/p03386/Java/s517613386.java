
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String s = "";

		try {
			scanner = new Scanner(System.in);
			s = scanner.next();

			char[] wk = s.toCharArray();

			int cntA = 0;
			int cntB = 0;
			int cntC = 0;

			for (int i = 0; i < wk.length; i++) {
				char c = wk[i];
				if (c == 'a' && cntA == 0) {
					cntA++;
				} else if (c == 'b' && cntB == 0) {
					cntB++;
				} else if (c == 'c' && cntC == 0) {
					cntC++;
				}
			}

			System.out.println((cntA + cntB + cntC) == 3 ? "Yes" : "No");

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
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numK = scanner.nextInt();

			int wkK = Math.min(numK, numB);
			Set<Integer> wk = new HashSet<Integer>();
			for (int i = numA; i <= wkK; i++) {
				wk.add(i);
			}
			wkK = Math.max(numK, numA);
			for (int i = wkK; i <= numB; i++) {
				wk.add(i);
			}

			Integer[] wkL = new Integer[wk.size()];
			wk.toArray(wkL);
			for (int i = 0; i < wkL.length; i++) {
				System.out.println(wkL[i]);
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