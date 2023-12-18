import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int[] w = new int[N + 10];
		int[] v = new int[N + 10];
		long[][] dp = new long[N + 10][100010];

		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		for (int i = 0; i < N + 10; i++) {
			for (int j = 0; j < 100010; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}

		dp[0][0] = 0;

		for (int i = 0; i < N; i++) {
			for (int sum_v = 0; sum_v < 100010; sum_v++) {

				if (sum_v - v[i] >= 0) {
					dp[i + 1][sum_v] = Math.min(dp[i + 1][sum_v], dp[i][sum_v - v[i]] + w[i]);
				}

				dp[i + 1][sum_v] = Math.min(dp[i + 1][sum_v], dp[i][sum_v]);

			}
		}

		long ans = 0l;
		for (int sum_v = 0; sum_v < 100010; sum_v++) {
			if (dp[N][sum_v] <= W) {
				ans = sum_v;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}