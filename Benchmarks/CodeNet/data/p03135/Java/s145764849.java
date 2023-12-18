
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}

	public void solve() {
		solveA();
		//		solveB();
		//		solveC();
		//		solveD();
	}

	private void solveA() {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = 0;
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

		}
	}

	boolean isExit = false;
	int res = 0;
	int[] wk;
	int[] wkH;
	int n = 0;

	private void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
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

	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {
			a		int numN = 0;
			int numM = 0;
			numN = scanner.nextInt();
			numM = scanner.nextInt();

			int[] wk = new int[numM];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			Arrays.sort(wk);

			int[] distArray = new int[numM - 1];

			for (int i = 0; i < distArray.length; i++) {
				distArray[i] = wk[i + 1] - wk[i];
			}

			Arrays.sort(distArray);

			int res = 0;
			for (int i = 0; i < numM - numN; i++) {
				res += distArray[i];
			}

			System.out.println(res);

		}
	}

	private void solveD() {

		try (Scanner scanner = new Scanner(System.in)) {
			int lineAB = 0;
			int lineBC = 0;
			int lineCA = 0;
			lineAB = scanner.nextInt();

			System.out.println("");

		}
	}
}