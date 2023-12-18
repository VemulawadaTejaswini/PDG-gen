import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int E = sc.nextInt();
		int T = sc.nextInt();
		int[] x = new int[N+1];
		x[0] = 0;
		for(int i=0; i<N; i++)
			x[i+1] = sc.nextInt();
		
		long[] dp = new long[N+1];
		for(int i=1; i<=N; i++) {
			dp[i] = Long.MAX_VALUE;
			for(int j=0; j<i; j++) {
				dp[i] = Math.min(dp[i], dp[j]+x[i]-x[j]+Math.max(T, 2*(x[i]-x[j+1])));
			}
		}
		
		System.out.println(dp[N]+E-x[N]);
		sc.close();
	}
}
