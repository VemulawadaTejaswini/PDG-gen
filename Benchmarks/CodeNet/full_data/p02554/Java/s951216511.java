import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long MOD = 1000000007;
		int N = sc.nextInt();
		
		long[][][] dp = new long[2][2][N+1];
		dp[0][0][0] = 1;
		for(int i=0; i<N; i++) {
			dp[0][0][i+1] = (dp[0][0][i+1] + dp[0][0][i]*8)%MOD;
			dp[0][1][i+1] = (dp[0][1][i+1] + dp[0][1][i]*9)%MOD;
			dp[1][0][i+1] = (dp[1][0][i+1] + dp[1][0][i]*9)%MOD;
			dp[1][1][i+1] = (dp[1][1][i+1] + dp[1][1][i]*10)%MOD;
			
			dp[1][0][i+1] = (dp[1][0][i+1] + dp[0][0][i])%MOD;
			dp[0][1][i+1] = (dp[0][1][i+1] + dp[0][0][i])%MOD;
			dp[1][1][i+1] = (dp[1][1][i+1] + dp[1][0][i] + dp[0][1][i])%MOD;
		}

		System.out.println(dp[1][1][N]);

		sc.close();
	}
}
