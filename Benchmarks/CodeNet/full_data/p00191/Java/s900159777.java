import java.util.*;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();//肥料の種類
			int m = stdIn.nextInt();//肥料を与える回数
			if(n == 0 && m == 0) break;

			double[][] table = new double[n][n];
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					table[r][c] = stdIn.nextDouble();
				}
			}
			double[][] dp = new double[m][n];
			Arrays.fill(dp[0], 1);//最初は効果がない
			for(int k = 1; k < m; k++) {
				for(int r = 0; r < n; r++) {
					for(int c = 0; c < m; c++) {
						dp[k][c] = Math.max(dp[k][c], dp[k - 1][r] * table[r][c]);
					}
				}
			}
			double ans = -1;
			for(int r = 0; r < dp[dp.length - 1].length; r++) {
				ans = Math.max(ans, dp[dp.length - 1][r]);
			}
			System.out.printf("%.2f\n", ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}