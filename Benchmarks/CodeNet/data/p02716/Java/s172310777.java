import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long MIN = (long)-1e16;
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}

		long[][][] dp = new long[N+1][3][2];
		for(int i=0; i<=N; i++)
			for(int j=0; j<3; j++)
				dp[i][j][0] = dp[i][j][1] = MIN;
		if(N%2==0) {
			dp[0][1][0] = 0;
		} else {
			dp[0][2][0] = 0;
		}
		
		for(int i=0; i<N; i++) {
			dp[i+1][0][0] = Math.max(dp[i+1][0][0], dp[i][1][0]);
			dp[i+1][1][0] = Math.max(dp[i+1][1][0], dp[i][2][0]);
			dp[i+1][0][0] = Math.max(dp[i+1][0][0], dp[i][0][1]);
			dp[i+1][1][0] = Math.max(dp[i+1][1][0], dp[i][1][1]);
			dp[i+1][2][0] = Math.max(dp[i+1][2][0], dp[i][2][1]);

			dp[i+1][0][1] = Math.max(dp[i+1][0][1], dp[i][0][0] + a[i]);
			dp[i+1][1][1] = Math.max(dp[i+1][1][1], dp[i][1][0] + a[i]);
			dp[i+1][2][1] = Math.max(dp[i+1][2][1], dp[i][2][0] + a[i]);
		}
		long ans = MIN;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				ans = Math.max(ans, dp[N][i][j]);
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}
