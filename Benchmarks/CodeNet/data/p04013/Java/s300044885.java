import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arg[] = br.readLine().split(" ");
		int n = Integer.parseInt(arg[0]);
		int a = Integer.parseInt(arg[1]);
		Solver s = new Solver();
		arg = br.readLine().split(" ");
		int inp[] = new int[n + 1];
		for (int i = 0; i < arg.length; i++) {
			inp[i + 1] = Integer.parseInt(arg[i]);
		}

		System.out.println(s.solve(inp, a));
	}

}

class Solver {

	long solve(int[] n, int a) {

		int[][][] dp = new int[n.length][n.length][a * n.length + 1];
		for (int j = 1; j < n.length; j++) {
			for (int i = 1; i < n.length; i++) {
				for (int s = 1; s <= a * n.length; s++) {
					if (j == 1) {
						if (s == n[i]) {
							dp[i][j][s]++;
						}
					}
					int idx = (s - n[i]) >= 0 ? (s - n[i]) : 0;
					dp[i][j][s] += (dp[i - 1][j - 1][idx] + dp[i - 1][j][s]);
				}

			}
		}
		long ans = 0L;
		for (int i = n.length - 1; i <= n.length - 1; i++) {
			for (int j = 1; j <= n.length - 1; j++) {
				for (int k = 1; k <= a * n.length; k++) {
					if (dp[i][j][k] > 0 && k == a * j) {
						ans += dp[i][j][k];
					}
				}
			}
		}
		return ans;
	}

}
