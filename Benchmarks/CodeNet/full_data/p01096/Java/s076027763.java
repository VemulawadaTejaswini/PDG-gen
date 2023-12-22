import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] w = new int[n + 1];
			for(int i = 1; i <= n; i++) {
				w[i] = sc.nextInt();
			}
			int[][] dp = new int[n + 1][n + 1];
			for(int i = 1; i < n; i++) {
				dp[i][i + 1] = Math.abs(w[i] - w[i + 1]) <= 1 ? 2 : 0;
			}
			for(int j = 2; j < n; j++) {
				for(int i = 1; i + j <= n; i++) {
					if(dp[i + 1][i + j - 1] == j - 1 && Math.abs(w[i] - w[i + j]) <= 1) {
						dp[i][i + j] = j - 1 + 2;
					}
					for(int k = 0; k < j; k++) {
						dp[i][i + j] = Math.max(dp[i][i + k] + dp[i + k + 1][i + j], dp[i][i + j]);
					}
				}
			}
			System.out.println(dp[1][n]);
		}
	}
}

