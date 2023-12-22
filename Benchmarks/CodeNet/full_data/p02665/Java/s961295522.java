import java.util.*;
public class Main {

	public static void main(String[] args) {
		long INF = 100_000_000_000_000L;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+1];
		Arrays.setAll(A, i -> sc.nextLong());
		long ans = 0;
		long[] dp = new long[N+1];
		dp[0] = 1;
		for(int i = 0; i < N; i++) {
			if(dp[i] < INF)
				dp[i+1] = (dp[i] - A[i]) * 2;
			else
				dp[i+1] = INF;
			if(dp[i+1] < A[i]) {
				System.out.println(-1);
				return;
			}
		}
		if(dp[N] < A[N]) {
			System.out.println(-1);
			return;
		}			
		long[] S = new long[N+1];
		S[0] = A[N];
		for(int i = 1; i <= N; i++)
			S[i] = S[i-1] + A[N-i];
		for(int i = 0; i <= N; i++)
			ans += Math.min(S[N-i], dp[i]);
		System.out.println(ans);
	}

}
