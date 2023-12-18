import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//D	Knapsack 1
public class Main {

	static void chMin(long[][] dp, int i, int j, long v) {
		if (dp[i][j] > v) {
			dp[i][j] = v;
		}
	}

	static void chMax(long[][] dp, int i, int j, long v) {
		if (dp[i][j] < v) {
			dp[i][j] = v;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());

		final int DP_SIZE = 100 + 10;

		int[] wArr = new int[N];
		long[] vArr = new long[N];
		for (int i = 0; i < N; i++) {
			wArr[i] = Integer.parseInt(sc.next());
			vArr[i] = Long.parseLong(sc.next());
		}
		sc.close();

		long[][] dp = new long[DP_SIZE][1000];

		for (int i = 0; i < N; i++) {
			for (int sumW = 0; sumW <= W; sumW++) {
				// 採用する場合
				if (sumW >= wArr[i]) {
					chMax(dp, i + 1, sumW, dp[i][sumW - wArr[i]] + vArr[i]);
				}

				// 採用しない場合
				chMax(dp, i + 1, sumW, dp[i][sumW]);
			}
		}

		long ans = dp[N][W];
		System.out.println(ans);
	}
}
