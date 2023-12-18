// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int INF = 0x3f3f3f3f;
	int[] oo, oj; int __ = 1;
	int link(int o, int h) {
		oo[__] = o; oj[__] = h;
		return __++;
	}
	int[] ii, jj, ww;
	int[] af; boolean[] used;
	void init(int n, int m) {
		oo = new int[1 + m * 2]; oj = new int[1 + m * 2];
		ii = new int[m]; jj = new int[m]; ww = new int[m];
		af = new int[n]; used = new boolean[n];
	}
	void dfs(int i) {
		if (used[i])
			return;
		used[i] = true;
		for (int o = af[i]; o != 0; o = oo[o]) {
			int h = oj[o], j = ii[h];
			dfs(j);
		}
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		init(n, m);
		for (int h = 0; h < m; h++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int w = sc.nextInt();
			ii[h] = i;
			jj[h] = j;
			ww[h] = w - p;
			af[j] = link(af[j], i);
		}
		dfs(n - 1);
		int[] dd = new int[n]; Arrays.fill(dd, -INF); dd[0] = 0;
		for (int k = 1; k <= n; k++)
			for (int h = 0; h < m; h++) {
				int i = ii[h], j = jj[h];
				if (used[j]) {
					int d = dd[i] + ww[h];
					if (d >= INF) {
						println(-1);
						return;
					}
					if (dd[j] < d) {
						dd[j] = d;
						if (j == n - 1 && k == n) {
							println(-1);
							return;
						}
					}
				}
			}
		println(Math.max(dd[n - 1], 0));
	}
}
