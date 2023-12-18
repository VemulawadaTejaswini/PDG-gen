import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<int[]>[] enter = new ArrayList[n + 2];
		List<int[]>[] exit = new ArrayList[n + 2];
		for (int i = 0; i <= n + 1; i++) {
			enter[i] = new ArrayList<>();
			exit[i] = new ArrayList<>();
		}

		SegmentTree st = new SegmentTree(n);
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int a = sc.nextInt();
			enter[l].add(new int[]{l, r, a});
			exit[r + 1].add(new int[]{l, r, a});
		}

		long answer = 0;
		for (int i = 1, p = 0; i <= n; i++) {
			for (int[] e : enter[i]) st.add(0, e[0], e[2]);
			for (int[] e : exit[i]) st.add(0, e[0], -e[2]);
			long v = st.query(0, i);
			st.add(i, i + 1, v);
			answer = Math.max(answer, v);
		}

		System.out.println(answer);
	}

	static class SegmentTree {
		private final int n;
		private long[] data;
		private long[] add;

		public SegmentTree(int n) {
			int t = 1;
			while (t < n) t <<= 1;
			this.n = t;
			this.data = new long[t * 2 - 1];
			this.add = new long[t * 2 - 1];
		}

		// [l, r) の最大値
		public long query(int a, int b) {
			return query(a, b, 0, 0, n);
		}

		private long query(int a, int b, int k, int l, int r) {
			if (b <= l || r <= a) return Integer.MIN_VALUE;
			if (a <= l && r <= b) return data[k];
			long vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
			long vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
			return Math.max(vl, vr);
		}

		// [a, b) に v を追加する
		public void add(int a, int b, long v) {
			add(a, b, v, 0, 0, n);
		}

		private void add(int a, int b, long v, int k, int l, int r) {
			if (b <= l || r <= a) return;
			if (a <= l && r <= b) {
				add[k] += v;
				data[k] += v;
				return;
			}

			add(a, b, v, k * 2 + 1, l, (l + r) / 2);
			add(a, b, v, k * 2 + 2, (l + r) / 2, r);
			data[k] = Math.max(data[k * 2 + 1], data[k * 2 + 2]) + add[k];
		}
	}
}
