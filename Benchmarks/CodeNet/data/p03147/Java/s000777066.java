
import java.util.Arrays;
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
		int n = 0;
		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			int[] wk = new int[n];
			for (int i = 0; i < n; i++) {
				wk[i] = scanner.nextInt();
			}
			Arrays.sort(wk);

			int count = 0;
			for (int i = 0; i < wk.length - 1; i++) {
				count += wk[i];
			}

			System.out.println(count <= wk[wk.length - 1] ? "No" : "Yes");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void mizu() {

		for (int i = 0; i < wkH.length; i++) {

			if (wkH[i] == 0) {
				continue;
			} else if (wkH[i] > 0) {
				wkH[i]--;
				if (i + 1 < wkH.length && wkH[i + 1] == 0) {
					return;
				}
			}

		}
	}

	boolean isExit = false;
	int res = 0;
	int[] wk;
	int[] wkH;
	int n = 0;

	private void solveB() {
		Scanner scanner = null;
		n = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			wk = new int[n];
			for (int i = 0; i < n; i++) {
				wk[i] = scanner.nextInt();
			}
			wkH = wk;

			while (!isExit()) {
				res++;
				mizu();
			}

			System.out.println(res);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private boolean isExit() {
		boolean res = true;

		for (int i = 0; i < wkH.length; i++) {
			if (wkH[i] != 0) {
				res = false;
			}
		}
		return res;
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