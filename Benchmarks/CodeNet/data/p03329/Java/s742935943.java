
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		//		new Main().solveCX();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			if (numN > 999) {
				System.out.println("ABD");
			} else {
				System.out.println("ABC");
			}

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

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();

			int wk = numB - numA;

			int res = 0;
			for (int i = 1; i < wk; i++) {
				res += i;
			}

			System.out.println(res - numA);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int checkCash(int powC, int currentI, int currentCash) {

		if (currentCash < powC || currentI < 1) {
			return currentCash;
		}

		int res = 0;
		int wk = (int) Math.pow(powC, currentI);

		if (wk <= currentCash) {
			currentCash -= wk;
			cntC++;
		}
		int val1 = checkCash(9, currentI - 1, currentCash);
		int val2 = checkCash(6, currentI - 1, currentCash);
		res = Math.min(val1, val2);
		return res;
	}

	private int cntC = 0;

	/**
	 * dp[0] = 0
	 * N = cash/yen
	 * dp[N] = 1 + dp[N-1]
	 *       = 1 + dp[N-6]
	 *       = 1 + dp[N-6^2]
	 *       = 1 + dp[N-6^3]
	 *
	 *       = 1 + dp[N-9^1]
	 */
	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {

			int numN = scanner.nextInt();

			/*
			 * 1
			 * 6 , 6^2 , 6^3 , 6^4
			 * 9 , 9^2 , 9^3 , 9^4
			 * dp[N]
			 * dp[i] ----- dp[N-1]
			 * 1円を使うパターン
			 * dp[N]= 1 + dp[N-1]
			 *     　  = 1 + dp[N-6]
			 *       　= 1 + dp[N-6^2]
			 *       　= 1 + dp[N-6^3]
			 *
			 *　       = 1 + dp[N-9^1]
			 * 上記最小値
			 *
			 */

			/*
			 * N<=100000　なので、dp[N]は100000以上で取っておく
			 */
			int[] dp = new int[100010];

			/*
			 * dp[N]を求めていく。
			 * minを求めるので大きな値で初期化
			 */
			Arrays.fill(dp, 999999999);

			/*
			 * dpN円引き出すのに必要な操作回数
			 * 0-5は1円での操作
			 * 埋めておく
			 */
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 3;
			dp[4] = 4;
			dp[5] = 5;
			/*
			 * 6円からN円までの操作回数最小
			 */
			for (int dpN = 6; dpN <= numN; dpN++) {

				/*
				 * 6べきのDP
				 */
				int power = 6;
				while (power <= dpN) {
					/*
					 * dpN円とdpN-power(6^?乗)円の比較
					 * dpN：初期値はINFで埋まっている
					 * dp[dpN - power] + 1とは、(dpN-power)円のときの"操作回数"に+1をしたのが今回の操作回数の予定という意味
					 */
					dp[dpN] = Math.min(dp[dpN], dp[dpN - power] + 1);
					power *= 6;
				}

				/*
				 * 9べきのDP
				 */
				power = 9;
				while (power <= dpN) {
					/*
					 * dpN円とdpN-power(9^?乗)円の比較
					 * dpN：初期値はINFまたは6^?での操作回数で埋まっている
					 * dp[dpN - power] + 1とは、(dpN-power)円のときの"操作回数"に+1をしたのが今回の操作回数の予定という意味
					 * 例：dpN=6の場合、現在の6円の操作回数と、(6-6^1)円の操作回数+1との比較
					 * なぜなら、6円とは0円+6^1円で表せるため、0円の時の操作回数に+1をすると6円の時の操作回数になる
					 *
					 */
					dp[dpN] = Math.min(dp[dpN], dp[dpN - power] + 1);
					power *= 9;
				}
			}

			System.out.println(dp[numN]);

		}

	}
	//
	//	ほかの方のサンプルソース
	//	private void solveCX() {
	//
	//		Scanner scanner = new Scanner(System.in);
	//		int n = scanner.nextInt();
	//		//dp[i]はi円引き出すのに必要な操作回数の最小値
	//		int[] dp = new int[100100];
	//		for (int i = 0; i <= 100000; i++) {
	//			dp[i] = Integer.MAX_VALUE;
	//		}
	//		dp[0] = 0;
	//		dp[1] = 1;
	//		int l = 6;
	//		while (l <= 100000) {
	//			dp[l] = 1;
	//			l *= 6;
	//		}
	//		int k = 9;
	//		while (k <= 100000) {
	//			dp[k] = 1;
	//			k *= 9;
	//		}
	//		for (int i = 0; i <= 100000; i++) {
	//			int power1 = 1;
	//			while (power1 <= i) {
	//				dp[i] = Math.min(dp[i], dp[i - power1] + 1);
	//				power1 *= 6;
	//			}
	//			int power2 = 1;
	//			while (power2 <= i) {
	//				dp[i] = Math.min(dp[i], dp[i - power2] + 1);
	//				power2 *= 9;
	//			}
	//		}
	//		System.out.println(dp[n]);
	//
	//	}

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