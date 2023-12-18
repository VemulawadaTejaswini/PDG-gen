import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
		}
		int q = Integer.parseInt(br.readLine());
		int[] c = new int[q + 1];
		int[][] dp = new int[11][n];
		for (int i = 1; i <= q; i++) {
			sa = br.readLine().split(" ");
			int v = Integer.parseInt(sa[0]) - 1;
			int d = Integer.parseInt(sa[1]);
			c[i] = Integer.parseInt(sa[2]);
			dp[d][v] = i;
		}
		br.close();

		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < n; j++) {
				dp[i - 1][j] = Math.max(dp[i - 1][j], dp[i][j]);
			}
			for (int j = 0; j < m; j++) {
				dp[i - 1][b[j]] = Math.max(dp[i - 1][b[j]], dp[i][a[j]]);
				dp[i - 1][a[j]] = Math.max(dp[i - 1][a[j]], dp[i][b[j]]);
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(c[dp[0][i]]);
		}
		pw.flush();
	}
}
