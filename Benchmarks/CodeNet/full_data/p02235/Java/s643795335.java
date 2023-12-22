import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for (int t = 0; t < q; t++) {
			char[] x = scan.next().toCharArray();
			char[] y = scan.next().toCharArray();

			int[][] dp = new int[x.length][y.length];

			dp[0][0] = x[0] == y[0] ? 1 : 0;
			for (int i = 1; i < x.length; i++)
				dp[i][0] = Math.max((x[i] == y[0]) ? 1 : 0, dp[i - 1][0]);
			for (int i = 1; i < y.length; i++)
				dp[0][i] = Math.max((x[0] == y[i]) ? 1 : 0, dp[0][i - 1]);
			
			for (int i = 1; i < x.length; i++) {
				for (int j = 1; j < y.length; j++) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					if (x[i] == y[j])
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
				}
			}
			int ans = 0;
			for (int i = 0; i < y.length; i++)
				ans = Math.max(ans, dp[x.length - 1][i]);
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

