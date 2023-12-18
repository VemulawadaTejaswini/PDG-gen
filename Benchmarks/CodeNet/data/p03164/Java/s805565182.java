
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt(), w[] = new int[N], v[] = new int[N];
		long dp[][] = new long[N][W + 1];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < W + 1; j++) {
				long temp = (i > 0 && j >= w[i]) ? dp[i - 1][j - w[i]] : 0;
				long temp2 = (i > 0) ? dp[i - 1][j] : 0;
				if (j >= w[i])
					dp[i][j] = Long.max(temp + v[i], temp2);
				else
					dp[i][j] = temp2;
			}
		}
		sc.close();
		System.out.println(dp[N - 1][W]);
	}
}
