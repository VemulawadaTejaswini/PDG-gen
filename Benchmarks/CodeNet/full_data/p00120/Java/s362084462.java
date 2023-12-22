import static java.util.Arrays.*;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		String[] ss = sc.nextLine().split("\\s+");
		int[] r = new int[ss.length - 1];
		int L = Integer.parseInt(ss[0]);
		for (int i = 1; i < ss.length; i++) {
			r[i-1] = Integer.parseInt(ss[i]);
		}
		int n = r.length;
		double[][] dp = new double[1 << n][n];
		double INF = 1e9;
		for (int i = 0; i < dp.length; i++) fill(dp[i], INF);
		for (int i = 0; i < n; i++) {
			dp[1 << i][i] = r[i];
		}
		for (int set = 1; set < (1 << n); set++) {
			for (int last = 0; last < n; last++) {
				if (dp[set][last] < INF/2) {
					for (int next = 0; next < n; next++) if ((set >> next & 1) == 0) {
						double dx = Math.sqrt(Math.pow(r[last] + r[next], 2) - Math.pow(r[last] - r[next], 2));
						double ncost = dp[set][last] + dx;
						int nset = set | (1 << next);
						dp[nset][next] = Math.min(dp[nset][next],  ncost);
					}
				}
			}
		}

		double EPS = 1e-10;
		double best = INF;
		for (int last = 0; last < n; last++) {
			best = Math.min(best, dp[(1 << n) - 1][last] + r[last]);
		}
		out.println(best < L + EPS ? "OK":"NA");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	Scanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}
}