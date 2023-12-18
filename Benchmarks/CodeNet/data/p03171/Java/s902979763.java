import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		long[][] dp = new long[N + 1][N + 1];
		for (int l = 1; l <= N; l++) {
			for (int i = 0; i + l <= N; i++) {
				int j = i + l;
				boolean first = (N - l) % 2 == 0;
				if (first) {
					dp[i][j] = dp[i + 1][j] + A[i];
					dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + A[j - 1]);
				} else {
					dp[i][j] = dp[i + 1][j] - A[i];
					dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] - A[j - 1]);
				}
			}
		}
		System.out.println(dp[0][N]);
	}
}