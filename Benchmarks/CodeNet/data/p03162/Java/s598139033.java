import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//C	Vacation
public class Main {

	static void chMin(int[][] dp, int i, int j, int v) {
		if (dp[i][j] > v) {
			dp[i][j] = v;
		}
	}

	static void chMax(int[][] dp, int i, int j, int v) {
		if (dp[i][j] < v) {
			dp[i][j] = v;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		final int DP_SIZE = 100000 + 10;

		int[][] abcArr = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				abcArr[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();

		int[][] dp = new int[DP_SIZE][3];
		for (int i = 0; i < DP_SIZE; i++) {
			for (int j = 0; j < 3; j++) {
				dp[i][j] = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j == k) {
						continue;
					}
					chMax(dp, i + 1, k, dp[i][j] + abcArr[i][k]);
				}
			}
		}

		int ans = 0;
		for (int j = 0; j < 3; j++) {
			ans = Math.max(ans, dp[N][j]);
		}
		System.out.println(ans);
	}

}
