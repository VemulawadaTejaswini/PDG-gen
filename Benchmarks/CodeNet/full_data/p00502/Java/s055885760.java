import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int D = sc.nextInt();
		int N = sc.nextInt();
		int[] T = new int[D];
		for (int i = 0; i < D; ++i) {
			T[i] = sc.nextInt();
		}
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		int[][] dp = new int[D][N];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		for (int i = 0; i < N; ++i) {
			if (A[i] <= T[0] && T[0] <= B[i]) dp[0][i] = 0;
		}
		for (int i = 1; i < D; ++i) {
			for (int j = 0; j < N; ++j) {
				if (A[j] <= T[i] && T[i] <= B[j]) {
					for (int k = 0; k < N; ++k) {
						if (dp[i - 1][k] < 0) continue;
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + Math.abs(C[j] - C[k]));
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			ans = Math.max(ans, dp[D - 1][i]);
		}
		System.out.println(ans);
	}

}