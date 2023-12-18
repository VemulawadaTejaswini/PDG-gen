import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n);
	}

	private static void solve(int n) {
		int[][] dp = new int[n + 1][n + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j >= i) {
					dp[i][j] = dp[i - 1][j - i] + dp[i - 1][j - 1];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
				if (dp[i][n] >= 1) {
					while(true){
						if(dp[i-1][n] == 0) {
							System.out.println(i);
							n= n-i;
							i--;
						}else {
							while(true) {
								i--;
								if(dp[i-1][n] == 0) {
									System.out.println(i);
									n= n-i;
									i--;
									break;
								}
							}
						}
						if(n == 0) {
							break;
						}
					}
					break;
				}
			}
		}
	}
}