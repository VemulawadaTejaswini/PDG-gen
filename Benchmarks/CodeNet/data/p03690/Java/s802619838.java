package 郵便配達;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];
		int[][] tmp = new int[2][n + 1];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			tmp[0][i] = a[i];
			tmp[0][n] ^= a[i];
			a[n] ^= a[i];
		}
		for (int i = 0; i < n; ++i) {
			b[i] = sc.nextInt();
			tmp[1][i] = b[i];
			tmp[1][n] ^= b[i];
			b[n] ^= b[i];
		}
		Arrays.sort(tmp[0]);
		Arrays.sort(tmp[1]);
		boolean f = true;
		for (int i = 0; i < n + 1; ++i) {
			f &= tmp[0][i] == tmp[1][i];
		}
		if (!f) {
			System.out.println(-1);
			return;
		}
		int c = 0;
		HashMap<Integer, Integer> numbering = new HashMap<>();
		for (int i = 0; i < n + 1; ++i) {
			if (i != 0 && tmp[0][i] != tmp[0][i - 1]) {
				++c;
			}
			numbering.put(tmp[0][i], c);
		}
		for (int i = 0; i < n + 1; ++i) {
			a[i] = numbering.get(a[i]);
			b[i] = numbering.get(b[i]);
		}

		solve(a, b, n);
	}

	void solve(int[] a, int[] b, int n) {
		ArrayList<Integer>[] g = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < n; ++i) {
			g[b[i]].add(i);
		}
		DJSet ds = new DJSet(n);
		boolean[] h = new boolean[n];
		for (int i = 0; i < n; ++i) {
			boolean f = true;
			for (int v : g[a[i]]) {
				f &= v == i;
			}
			if (!f) {
				for (int v : g[a[i]]) {
					ds.setUnion(i, v);
				}
			} else {
				h[a[i]] = true;
			}
		}
		int cnt = 0;
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; ++i) {
			int rep = ds.root(i);
			if (vis[rep] || h[i])
				continue;
			cnt += ds.sz(i) + 1;
			vis[rep] = true;
		}
		if (g[a[n]].size() > 0)
			--cnt;
		System.out.println(cnt);
	}

	class DJSet {
		int n;
		int[] upper;

		public DJSet(int n_) {
			n = n_;
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		void setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (x == y) {
				return;
			}
			if (upper[x] < upper[y]) {
				int tmp = x;
				x = y;
				y = tmp;
			}
			upper[y] += upper[x];
			upper[x] = y;
		}

		int sz(int x) {
			return -upper[root(x)];
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
