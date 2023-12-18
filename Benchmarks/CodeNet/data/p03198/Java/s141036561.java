import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextLong();
		
		int[][] dp = new int[2][N+1];
		
		dp[0][N] = 0;
		long last = Long.MAX_VALUE;
		for(int i=N-1; i>=0; i--) {
			dp[0][i] = dp[0][i+1];
			while(A[i]>last) {
				last*=4;
				dp[0][i]+=2*(N-i-1);
			}
			last = A[i];
		}
		
		dp[1][0] = 0;
		last = Long.MIN_VALUE;
		for(int i=1; i<=N; i++) {
			dp[1][i] = dp[1][i-1]+1;
			while(A[i-1]<last) {
				last*=4;
				dp[1][i]+=2*(i-1);
			}
			last = A[i-1];
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<=N; i++)
			ans = Math.min(ans, dp[0][i]+dp[1][i]);
		
		System.out.println(ans);
		sc.close();
	}
	
}