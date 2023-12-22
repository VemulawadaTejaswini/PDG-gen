import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static int w,h,si,sj,n;
	static int[][] table,hs;
	static int[][] dp;

	static boolean solve() {
		w = in.nextInt();
		h = in.nextInt();
		if (w == 0 && h == 0) return false;
		table = new int[h][w];

		si = -1; sj = -1;
		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				int tmp = in.nextInt();
				table[i][j] = -1;
				if (tmp == 1) {
					table[i][j] = list.size();
					list.add(new int[]{i,j});
				} else {
					si = i; sj = j;
				}
			}
		}

		n = list.size();
		hs = new int[n][2];
		for (int i=0; i<n; i++) {
			hs[i] = list.get(i);
		}

		dp = new int[1<<n][n];
		for (int i=0; i<1<<n; i++) {
			Arrays.fill(dp[i],-1);
		}

		out.println(rec(0,si,sj));
		return true;
	}

	static int rec(int visited, int ci, int cj) {
		int cur = table[ci][cj];
		if (cur >= 0 && dp[visited][cur] != -1) return dp[visited][cur];
		if (Integer.bitCount(visited) == n) {
			return check(visited, ci, cj, si, sj) ? 1 : 0;
		}

		int res = 0;

		for (int i=0; i<n; i++) {
			int ni = hs[i][0], nj = hs[i][1];
			if (((visited>>i)&1) == 1) continue;
			if (check(visited, ci, cj, ni, nj)) {
				res += rec(((1<<i)|visited), ni, nj);
			}
		}

		return cur >= 0 ? dp[visited][cur] = res : res;
	}

	static boolean check(int visited, int ci, int cj, int ti, int tj) {
		if (ci != ti && cj != tj) return false;
		if (ci == ti) {
			int from = Math.min(cj,tj);
			int to = Math.max(cj,tj);
			for (int j=from+1; j<to; j++) {
				if (table[ci][j] >= 0 && ((visited>>table[ci][j])&1) == 1) return false;
			}
		} else if (cj == tj) {
			int from = Math.min(ci,ti);
			int to = Math.max(ci,ti);
			for (int i=from+1; i<to; i++) {
				if (table[i][cj] >= 0 && ((visited>>table[i][cj])&1) == 1) return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}