import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.next());
		int w = Integer.valueOf(sc.next());

		int[][] table = new int[n][2];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = Integer.valueOf(sc.next());
			}
		}

		long[][] dp = new long[n][(int) Math.pow(10, 3) * 100 + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				dp[i][j] = Long.MAX_VALUE;
			}
		}
		for (int i = 0; i <= table[0][1]; i++) {
			dp[0][i] = table[0][0];
		}
		dp[0][0] = 0;

		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length && dp[i - 1][Integer.max(j - table[i][1], 0)] != Long.MAX_VALUE; j++) {
				dp[i][j] = Long.min(dp[i - 1][j], dp[i - 1][Integer.max(j - table[i][1], 0)] + table[i][0]);
			}
		}

		for (int i = dp[dp.length - 1].length - 1; i >= 0; i--) {
			if (dp[dp.length - 1][i] <= w) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}

}
