import java.util.Scanner;

public class Main {

	static long mod = 1_000_000_007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), K = in.nextInt();
		int a[] = new int[N + 1];
		for ( int i = 1; i <= N; i++ ) {
			a[i] = in.nextInt();
		}
		in.close();

		long dp[][] = new long[N + 1][K + 1];
		for ( int n = 0; n <= N; n++ ) {
			dp[n][0] = 1;
		}

		for ( int n = 1; n <= N; n++ ) {
			for ( int k = 1; k <= K; k++ ) {
				dp[n][k] = (dp[n][k - 1] + dp[n - 1][k]);
				if ( a[n] < k ) {
					dp[n][k] -= dp[n - 1][k - a[n] - 1];
				}
				dp[n][k] %= mod;
			}
		}
		System.out.println((dp[N][K] + mod) % mod);
	}
}
