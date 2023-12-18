import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0; i < N; i++) x[i] = sc.nextInt();
		int[][][] dp = new int[N + 1][N + 1][2501];
		dp[0][0][0] = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N + 1; j++) {
				for(int k = 0; k < 2501; k++) {
					if(j + 1 < N + 1 && k + x[i] < 2501) dp[i + 1][j + 1][k + x[i]] += dp[i][j][k];
					dp[i + 1][j][k] += dp[i][j][k];
				}
			}
		}
		long ans = 0;
		for(int k = 1; k <= N; k++) {
			ans += (long)dp[N][k][A * k];
		}
		System.out.println(ans);
	}
}