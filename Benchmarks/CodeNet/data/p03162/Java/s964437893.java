import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		long[][] dp = new long[N + 1][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j == k) continue;
					dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][k]);
				}
			}
		}

		long res = 0;
		for (int i = 0; i < 3; i++) res = Math.max(res, dp[N][i]);
		System.out.println(res);
	}
}