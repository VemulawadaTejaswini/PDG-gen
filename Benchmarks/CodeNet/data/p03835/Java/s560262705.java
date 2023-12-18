import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int[][] dp = new int[3][S + 1];
		for (int j = 0; j < 3; j++) {
			dp[j][0] = 1;
		}
		for (int j = 0; j < S + 1; j++) {
			if (j <= K * 3) {
				dp[0][j] = 1;
			}
		}
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < S + 1; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j > 0 && j <= K) {
					dp[i][j] += dp[i][j - 1];
				}
			}
		}
		System.out.println(dp[2][S]);
	}
}