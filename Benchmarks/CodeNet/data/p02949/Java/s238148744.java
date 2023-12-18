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
	int[] oo, oh; int __ = 1;
	int link(int o, int h) {
		oo[__] = o; oh[__] = h;
		return __++;
	}
	int[] ij, ww;
	int[] ae, af; byte[] used;
	int[] qu; int cnt;
	void init(int n, int m) {
		oo = new int[1 + m * 2]; oh = new int[1 + m * 2];
		ij = new int[m]; ww = new int[m];
		ae = new int[n]; af = new int[n]; used = new byte[n];
		qu = new int[n];
	}
	void dfs(int i) {
		if (used[i] == 1)
			return;
		used[i] = 1;
		for (int o = af[i]; o != 0; o = oo[o]) {
			int h = oh[o], j = i ^ ij[h];
			dfs(j);
		}
	}
	boolean dfs_(int i) {
		if (used[i] != 1)
			return used[i] == 2;
		used[i] = 2;
		for (int o = ae[i]; o != 0; o = oo[o]) {
			int h = oh[o], j = i ^ ij[h];
			if (dfs_(j))
				return true;
		}
		used[i] = 3;
		qu[cnt++] = i;
		return false;
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
			ij[h] = i ^ j;
			ww[h] = w - p;
			ae[i] = link(ae[i], h);
			af[j] = link(af[j], h);
		}
		dfs(n - 1);
		if (dfs_(0)) {
			println(-1);
			return;
		}
		int[] dd = new int[n]; Arrays.fill(dd, -INF); dd[0] = 0;
		while (cnt-- > 0) {
			int i = qu[cnt];
			for (int o = ae[i]; o != 0; o = oo[i]) {
				int h = oh[o], j = i ^ ij[h];
				dd[j] = Math.max(dd[j], dd[i] + ww[h]);
			}
		}
		println(Math.max(dd[n - 1], 0));
	}
}
