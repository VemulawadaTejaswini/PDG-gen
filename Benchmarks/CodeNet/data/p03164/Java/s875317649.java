import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//E	Knapsack 2
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
		final int V_MAX = 101000;

		long[] wArr = new long[N];
		int[] vArr = new int[N];
		for (int i = 0; i < N; i++) {
			wArr[i] = Long.parseLong(sc.next());
			vArr[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		long[][] dp = new long[DP_SIZE][V_MAX];

		// 初期化
		for (int i = 0; i < DP_SIZE; i++) {
			for (int sumV = 0; sumV < V_MAX; sumV++) {
				dp[i][sumV] = 1000000000000000000l;
			}
		}

		// 初期条件
		dp[0][0] = 0;

		// DPループ
		for (int i = 0; i < N; i++) {
			for (int sumV = 0; sumV < V_MAX; sumV++) {
				// 採用する場合
				if (sumV >= vArr[i]) {
					chMin(dp, i + 1, sumV, dp[i][sumV - vArr[i]] + wArr[i]);
				}

				// 採用しない場合
				chMin(dp, i + 1, sumV, dp[i][sumV]);
			}
		}

		long ans = 0;
		for (int i = 0; i < V_MAX; i++) {
			if (dp[N][i] <= W) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
