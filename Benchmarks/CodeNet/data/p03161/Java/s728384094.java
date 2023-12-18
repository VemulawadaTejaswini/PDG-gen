import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//B	Frog 2
public class Main {

	static void chMin(int[] dp, int i, int v) {
		if (dp[i] > v) {
			dp[i] = v;
		}
	}

	static void chMax(int[] dp, int i, int v) {
		if (dp[i] < v) {
			dp[i] = v;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		final int DP_SIZE = 100000 + K + 10;

		int[] hArr = new int[DP_SIZE];
		for (int i = 0; i < N; i++) {
			hArr[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int[] dp = new int[DP_SIZE];
		for (int i = 0; i < DP_SIZE; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		dp[0] = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= K; j++) {
				chMin(dp, i + j, dp[i] + Math.abs(hArr[i] - hArr[i + j]));
			}
		}

		System.out.println(dp[N - 1]);
	}

}
