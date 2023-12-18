
import java.io.PrintWriter;
import java.util.*;

public class Main {

	static int c;
	static int[] w;
	static int[] v;
	static long[][] dp;
	static int n;

	public static long KnapSack(int idx, int remw) {
		if (remw < 0) {
			return -(int) 1e9;
		}
		if (idx == n) {
			return 0;
		}
		if (dp[idx][remw] != -1) {
			return dp[idx][remw];
		}
		long take = v[idx] + KnapSack(idx + 1, remw - w[idx]);
		long leave = KnapSack(idx + 1, remw);
		return dp[idx][remw] = Math.max(take, leave);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		c = sc.nextInt();
		w = new int[n];
		v = new int[n];
		dp = new long[n][c+5];
		for (long[] x : dp)
			Arrays.fill(x, -1);
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		pw.println(KnapSack(0, c));
		pw.close();
	}

}