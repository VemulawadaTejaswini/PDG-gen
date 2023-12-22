import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] A;

	public static void main(String[] arg) {
		N = sc.nextInt();
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		final long INF = (long) 1e16;
		long[][] dp = new long[N][N + 1];
		int[][] prev = new int[N][N + 1];
		for (long[] a : dp) {
			Arrays.fill(a, INF);
		}
		dp[0][1] = A[0];
		for (int i = 1; i < N; ++i) {
			long sum = A[i];
			for (int j = i; j > 0; --j) {
				for (int k = i; k > 0; --k) {
					if (dp[j - 1][k] != INF && dp[j - 1][k] < sum && sum < dp[i][k + 1]) {
						dp[i][k + 1] = sum;
						prev[i][k + 1] = j;
						break;
					}
				}
				sum += A[j - 1];
			}
			dp[i][1] = sum;
		}
		for (int i = N; i > 0; --i) {
			if (dp[N - 1][i] == INF) continue;
			System.out.println(i);
			int[] part = new int[i - 1];
			int pos = prev[N - 1][i--];
			while (i > 0) {
				part[i - 1] = pos;
				pos = prev[pos - 1][i--];
			}
			for (int j = 0; j < part.length - 1; ++j) {
				System.out.print(part[j] + " ");
			}
			if (part.length == 0) {
				System.out.println();
			} else {
				System.out.println(part[part.length - 1]);
			}
			break;
		}
	}

}