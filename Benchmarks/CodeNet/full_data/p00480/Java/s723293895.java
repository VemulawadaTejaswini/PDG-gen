import java.util.Scanner;

public class Main {
	static int num[];
	static long dp[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		dp = new long[N][21];
		System.out.println(DP(N));
	}
	private static long DP(int N) {
		dp[0][num[0]] = 1;
		for (int i = 1; i < N - 1; i++) {
			for (int j = 0; j <= 20; j++) {
				if (dp[i-1][j] > 0) {
					int plus = j + num[i];
					if (plus >=0 && plus <= 20) {
						dp[i][plus] += dp[i-1][j];
					}
					int minus = j - num[i];
					if (minus >=0 && minus <= 20) {
						dp[i][minus] += dp[i-1][j];
					}
				}
			}
		}
		return dp[N-2][num[N-1]];
	}
}