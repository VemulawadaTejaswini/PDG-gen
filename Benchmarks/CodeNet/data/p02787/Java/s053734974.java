import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[][] input = new int[N][2];
		double cospa = 0;
		for (int i = 0; i < N; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
			if (input[i][0] / (double) input[i][1] > cospa) {
				cospa = input[i][0] / (double) input[i][1];
			}
		}
		int size = (int) (H / cospa) + 100;
		long[][] dp = new long[N + 1][size];
		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = 0;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (j < input[i - 1][1]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(Math.max(dp[i - 1][j], dp[i - 1][j - input[i - 1][1]] + input[i - 1][0]),
							dp[i][j - input[i - 1][1]] + input[i - 1][0]);
				}
			}
		}
		for (int i = 0; i < dp[0].length; i++) {
			if (dp[N][i] >= H) {
				System.out.print(i);
				break;
			}
		}
	}
}