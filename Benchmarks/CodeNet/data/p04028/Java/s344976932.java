import java.util.*;

public class Main {
	final static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.next().length();

		long[][] dp = new long[N+1][N+1];
		dp[0][0] = 1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]*2)%MOD;
				dp[i+1][Math.max(0, j-1)] = (dp[i+1][Math.max(0, j-1)] + dp[i][j])%MOD;
			}
		}
		for(int i=0; i<=N; i++) {
			for(int j=0; j<(N-i-M)/2; j++)
				dp[i][0] = (dp[i][0]*2)%MOD;
			for(int j=1; j<=N; j++)
				dp[i][j] = 0;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j])%MOD;
				if(j-1>0)
					dp[i+1][j-1] = (dp[i+1][j-1] + dp[i][j])%MOD;
			}
		}
		
		System.out.println(dp[N][M]);
		
		sc.close();
	}
	
}
