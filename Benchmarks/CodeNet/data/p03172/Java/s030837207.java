import java.util.Scanner;

public class Main {

	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), k = in.nextInt();
		int a[] = new int[N + 1];
		int capa[] = new int[N + 1];
		for ( int i = 1; i <= N; i++ ) {
			a[i] = in.nextInt();
			capa[i] += a[i] + capa[i - 1];
		}
		in.close();

		if ( capa[N] < k ) {
			System.out.println(0);
			return;
		}

		long dp[][] = new long[N + 1][k + 1];
		for ( int n = 0; n <= N; n++ ) {
			dp[n][0] = 1;
		}

		for ( int n = 1; n <= N; n++ ) {
			for ( int c = 1; c <= k; c++ ) {
				if ( a[n] == 0 ) {
					dp[n][c] = dp[n - 1][c];
					continue;
				}

				if ( c <= capa[n] / 2 ) {
					dp[n][c] = (dp[n][c - 1] + dp[n - 1][c]) % mod;
				} else if ( c <= capa[n] ) {
					dp[n][c] = dp[n][capa[n] - c] % mod;
				} else {
					break;
				}
			}
		}
		System.out.println(dp[N][k]);
	}
}
