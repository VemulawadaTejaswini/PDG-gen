
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		//		new Main().solveC2();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			if (numN % 2 == 0) {
				System.out.println(numN);
			} else {
				System.out.println(numN * 2);
			}

			System.out.println("");

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

			System.out.println(wk[wk.length - 1] - wk[0]);

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int getCry(int b, int currentI, int maxI, int[] wk) {
		if (currentI == maxI) {
			return 0;
		}

		return getCry(b, currentI + 1, maxI, wk) + Math.abs(wk[currentI] - (b + currentI + 1));
	}

	private void solveC2() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt() - (i + 1);
		}
		sc.close();
		Arrays.sort(A);
		int med = N % 2 == 0 ? N / 2 - 1 : N / 2;
		int b = A[med];
		long ans = 0;
		for (int a : A) {
			ans += Math.abs(a - b);
		}

		System.out.println(ans);
	}

	/**
	 * ⅰ)abs(xi-a)の総和(aとの距離の総和)を最小にするのは中央値で、
	 * ⅱ)(xi-a)^2の総和を最小にするのは平均値
	 */
	private void solveC() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			//			int[] resArray = new int[numN];

			//			for (int i = 0; i < numN; i++) {
			//				resArray[i] = scanner.nextInt();
			//			}

			int[] wk = new int[numN];
			for (int i = 0; i < numN; i++) {
				wk[i] = scanner.nextInt() - (i + 1);
			}
			Arrays.sort(wk);

			//			int b = 0;
			//			if (numN % 2 == 0) {
			//				b = wk[(numN / 2) - 1];
			//			} else {
			//				b = wk[numN / 2];
			//			}

			int med = numN % 2 == 0 ? numN / 2 - 1 : numN / 2;
			int b = wk[med];

			int res = 0;

			for (int a : wk) {
				res += Math.abs(a - b);
			}
			System.out.println(res);

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