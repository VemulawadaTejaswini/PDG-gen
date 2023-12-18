import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static final int UNVISITED = 0;
	static final int TRUE = 1;
	static final int FALSE = 2;

	static int[] dp;
	static int[] a;

	static int eval(int cur, int max) {
		if (dp[cur] != UNVISITED) {
			return dp[cur];
		}
		dp[cur] = FALSE;
		int res = FALSE;
		for (int i=cur+1; i<=max; i++) {
			int j = i - cur;
			if (cur == j || max < j) continue;
			if (eval(j, max) == TRUE && eval(i, max) == TRUE) {
				res = TRUE;
				break;
			}
		}
		// trace(cur, res);
		return dp[cur] = res;
	}

	static void solve() {
		int n = in.nextInt();
		int k = in.nextInt();
		a = new int[n];
		int max = 0;
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			max = Math.max(max, a[i]);
		}
		dp = new int[max+1];
		for (int i=0; i<n; i++) {
			dp[a[i]] = TRUE;
		}
		if (k <=max && eval(k, max) == TRUE) {
			out.println("POSSIBLE");
		} else {
			out.println("IMPOSSIBLE");
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}