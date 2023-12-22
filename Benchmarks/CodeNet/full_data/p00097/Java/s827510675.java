import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, s;
	static long dp[][][];

	public static long f(int cnt, int k, int sum) {
		if (0 <= dp[cnt][k][sum]) {
			return dp[cnt][k][sum];
		}
		if (cnt == n - 1) {
			if (sum + k == s) {
				return dp[cnt][k][sum] = 1;
			} else {
				return dp[cnt][k][sum] = 0;
			}
		} else {
			if (s < sum + k) {
				return dp[cnt][k][sum] = 0;
			}
			long x = 0;
			for (int i = k + 1; i <= 100; i++) {
				x += f(cnt + 1, i, sum + k);
			}
			return dp[cnt][k][sum] = x;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			s = sc.nextInt();
			if ((n | s) == 0) {
				break;
			}
			dp = new long[n][110][1100];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 110; j++) {
					Arrays.fill(dp[i][j], -1);
				}
			}

			long sum = 0;
			for (int i = 0; i <= 100; i++) {
				sum += f(0, i, 0);
			}
			System.out.println(sum);
		}
	}
}