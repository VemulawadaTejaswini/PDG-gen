import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inputA = new int[N];
		int[] inputB = new int[N];
		int[] inputC = new int[N];
		for (int i = 0; i < N; i++) {
			inputA[i] = sc.nextInt();
			inputB[i] = sc.nextInt();
			inputC[i] = sc.nextInt();
		}
		long[][] dp = new long[3][N];
		dp[0][0] = inputA[0];
		dp[1][0] = inputB[0];
		dp[2][0] = inputC[0];
		for (int i = 1; i < N; i++) {
			dp[0][i] = Math.max(dp[1][i - 1] + inputA[i], dp[2][i - 1] + inputA[i]);
			dp[1][i] = Math.max(dp[0][i - 1] + inputB[i], dp[2][i - 1] + inputB[i]);
			dp[2][i] = Math.max(dp[0][i - 1] + inputC[i], dp[1][i - 1] + inputC[i]);
		}
		System.out.print(Math.max(Math.max(dp[0][N - 1], dp[1][N - 1]), dp[2][N - 1]));
	}
}