import java.util.Scanner;

public class Main {
	public static final long mod = (long)1e9+7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int ans = 0;
		long dp[][][][] = new long[n+1][4][4][4];
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
				for (int l = 0; l < 4; l++) {
					dp[1][j][k][l] = 1;
					dp[2][j][k][l] = 1;
					dp[3][j][k][l] = 1;
				}
			}
		}
		dp[3][0][1][2] = 0; dp[3][1][0][2] = 0; dp[3][0][2][1] = 0;
		for (int i = 3; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						if(k!=0||l!=2) {
							dp[i+1][k][l][1] += dp[i][j][k][l];
						}
						if((k!=0||l!=1)&&(k!=1||l!=0)&&(j!=0||l!=1)&&(j!=0||k!=1)){
							dp[i+1][k][l][2] += dp[i][j][k][l];
						}
						dp[i+1][k][l][0] += dp[i][j][k][l];
						dp[i+1][k][l][3] += dp[i][j][k][l];
						for (int m = 0; m < 4; m++) dp[i+1][k][l][m] %= mod;
					}
				}
			}
		}
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
				for (int l = 0; l < 4; l++) {
					ans += dp[n][j][k][l];
					ans %= mod;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}