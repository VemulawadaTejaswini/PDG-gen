import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int x[] = new int[N];
		int max_x = 0;
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			max_x = Math.max(x[i], max_x);
		}
		
		long dp[][][] = new long[N + 1][N + 1][max_x * N + 1];
		dp[0][0][0] = 1;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k <= max_x * N; k++) {
					if(dp[i][j][k] != 0) {
						dp[i + 1][j + 1][k + x[i]] += dp[i][j][k];
						dp[i + 1][j][k] += dp[i][j][k];
					}
				}
			}
		}
		
		long ans = 0;
		for(int i = 1; i <= N; i++) {
			ans += dp[N][i][i * A];
		}
		
		System.out.println(ans);
	}
}
