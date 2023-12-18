
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
		int numA = 0;
		int numB = 0;
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numX = scanner.nextInt();

			if (numX - numA <= numB && numA <= numX) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;
		int numX = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			numX = scanner.nextInt();

			Set<Integer> wk = new HashSet<Integer>();

			for (int i = 0; i < numM; i++) {
				wk.add(scanner.nextInt());
			}
			int res1 = 0;
			for (int i = numX; i <= numN; i++) {
				if (wk.contains(i)) {
					res1++;
				}

			}
			int res2 = 0;
			for (int i = 0; i <= numX; i++) {
				if (wk.contains(i)) {
					res2++;
				}

			}

			System.out.println(Math.min(res1, res2));

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