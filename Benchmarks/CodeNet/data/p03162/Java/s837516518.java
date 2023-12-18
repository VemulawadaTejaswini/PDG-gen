import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] h = new int[n + 1][3];
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < 3; j++) {
				h[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[n + 1][3];
		dp[1][0] = h[1][0];
		dp[1][1] = h[1][1];
		dp[1][2] = h[1][2];
		
		for(int i = 2; i <= n; i++) {
			dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + h[i][0];
			dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + h[i][1];
			dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + h[i][2];
		}
		System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
	}

}
