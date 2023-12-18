
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {// Main

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		sc = new FastScanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		interval[] arr = new interval[m];
		for (int i = 0; i < m; i++) {
			interval struct = new interval();
			struct.lo = sc.nextInt() - 1;
			struct.hi = sc.nextInt() - 1;
			struct.val = sc.nextInt();
			arr[i] = struct;
		}

		ArrayList<Integer>[] ending = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++)
			ending[i] = new ArrayList<Integer>();
		int ind = 0;

		for (interval st : arr) {
			ending[st.hi].add(ind);
			ind++;
		}

		SegmentTree st = new SegmentTree(n);
		for (int j : ending[0])
			st.update(arr[j].lo, arr[j].hi, arr[j].val);

		for (int i = 1; i < n; i++) {
			long max = Math.max(0, st.query(0, 0, i - 1, 0, n - 1));
			st.update(i, i, max);
			for (int j : ending[i])
				st.update(arr[j].lo, arr[j].hi, arr[j].val);
		}

		out.println(Math.max(st.query(0, 0, n - 1, 0, n - 1), 0));
		out.flush();
	}

	static long mod = 1000000007;

	public static long[][] input(int n, int m) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	public static class interval {
		int lo;
		int hi;
		int val;
	}

	public static class SegmentTree {
		long[] tree;
		long[] upd;
		int n;

		// child 2n+1 , 2n+2

		public SegmentTree(int n) {
			this.n = n;
			tree = new long[4 * n];
			upd = new long[4 * n];
		}

		public void push(int node) {
			upd[2 * node + 1] += upd[node];
			upd[2 * node + 2] += upd[node];

			tree[2 * node + 1] += upd[node];
			tree[2 * node + 2] += upd[node];

			upd[node] = 0;
		}

		void update(int li, int ri, long val) {
			lazyProp(0, 0, n - 1, li, ri, val);
		}

		public void lazyProp(int node, int ln, int rn, int li, int ri, long val) {
			// TODO Auto-generated method stub
			if ( ri <ln|| rn < li) {
				return;
			}

			if (li <= ln && rn <= ri) {
				tree[node] += val;
				upd[node] += val;
				return;
			}
			int mid = (ln + rn) / 2;
			push(node);
			lazyProp(2 * node + 1, ln, mid, li, ri, val);
			lazyProp(2 * node + 2, mid + 1, rn, li, ri, val);
			tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
		}
		public long query (int li, int ri) {
		return	query( 0 , li , ri , 0 , n-1);
		}
		private long query(int node, int li, int ri, int ln, int rn) {

			// TODO Auto-generated method stub
			if ( ri<ln || rn < li) {
				return Long.MIN_VALUE;
			}
			if (li <= ln && rn <= ri) {

				return tree[node];
			}
			int mid = (ln + rn) / 2;
			push(node);
			long left = query(2 * node + 1,li,ri, ln, mid);
			long right = query(2 * node + 2,li,ri, mid + 1, rn);
			return Math.max(left, right);

		}

	}

	static BufferedReader in;
	static FastScanner sc;
	static PrintWriter out;

	static class FastScanner {
		BufferedReader in;
		StringTokenizer st;

		public FastScanner(BufferedReader in) {
			this.in = in;
		}

		public String nextToken() throws Exception {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(in.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws Exception {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() throws Exception {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() throws Exception {
			return Double.parseDouble(nextToken());
		}
	}

}
