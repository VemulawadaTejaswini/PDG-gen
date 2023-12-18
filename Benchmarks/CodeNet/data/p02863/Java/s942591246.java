import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for ( int i = 0 ; i < N ; i++ ) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		sc.close();

		int[][] dp = new int[2][T + 1];
		int[][] dpo = new int[2][T + 1];
		Arrays.fill(dp[N % 2], 0);
		Arrays.fill(dpo[N % 2], 0);
		for ( int i = N - 1 ; i >= 0 ; i-- ) {
			for ( int t = 0 ; t <= T ; t++ ) {
				if ( t < A[i] ) {
					dp[i % 2][t] = dp[(i+1) % 2][t];
					dpo[i % 2][t] = Math.max(dpo[(i+1) % 2][t], dp[(i+1) % 2][t] + B[i]);
				} else {
					dp[i % 2][t] = Math.max(dp[(i+1) % 2][t], dp[(i+1) % 2][t - A[i]] + B[i]);
					dpo[i % 2][t] = Math.max(Math.max(dpo[(i+1) % 2][t], dp[(i+1) % 2][t] + B[i]),
							dpo[(i+1) % 2][t - A[i]] + B[i]);
				}
			}
		}
		System.out.println(Math.max(dp[0][T], dpo[0][T - 1]));
	}
}
