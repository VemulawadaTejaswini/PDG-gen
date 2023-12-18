
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
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

		void setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (x == y)
				return;
			if (upper[x] < upper[y]) {
				x ^= y;
				y ^= x;
				x ^= y;
			}
			upper[y] += upper[x];
			upper[x] = y;
		}

		int cmpNum() {
			int ret = 0;
			boolean[] vis = new boolean[n];
			for (int i = 0; i < n; ++i) {
				if (vis[root(i)])
					continue;
				else {
					vis[root(i)] = true;
					++ret;
				}
			}
			return ret;
		}
	}

	@SuppressWarnings("unchecked")
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		DJSet ds = new DJSet(n);
		int cnt = 2 * (n - 1);
		int[] x = new int[m];
		int[] y = new int[m];
		boolean[] vis = new boolean[n];
		long[][] tmp = new long[n][2];
		for (int i = 0; i < tmp.length; ++i)
			for (int j = 0; j < tmp[i].length; ++j)
				tmp[i][j] = Integer.MAX_VALUE / 3;
		for (int i = 0; i < m; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			ds.setUnion(x[i], y[i]);
			cnt -= 2;
		}
		if (cnt > n) {
			System.out.println("Impossible");
			return;
		}
		for (int i = 0; i < n; ++i) {
			tmp[ds.root(i)][0] = Math.min(tmp[ds.root(i)][0], a[i]);
			if (tmp[ds.root(i)][0] == a[i])
				tmp[ds.root(i)][1] = i;
		}
		long ans = 0;
		if (cnt > 0) {
			for (int i = 0; i < n; ++i) {
				if (tmp[i][0] == Integer.MAX_VALUE / 3)
					continue;
				ans += tmp[i][0];
				vis[(int) tmp[i][1]] = true;
				--cnt;
			}
		}
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (int i = 0; i < n; ++i) {
			if (vis[i])
				continue;
			pq.add(a[i]);
		}
		while (cnt-- > 0) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
