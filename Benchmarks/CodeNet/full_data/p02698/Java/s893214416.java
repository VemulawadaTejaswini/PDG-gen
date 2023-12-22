import java.util.*;
import java.io.*;

public class Abc165f {
	static int[] a, lis;
	static ArrayList<Integer>[] adjList;
	static SegmentTree sg;

	public static void solve(int u, int p) {

		lis[u] = 1 + (a[u] == 1 ? 0 : sg.query(1, a[u] - 1));
		int old = sg.queryPoint(a[u]);

		sg.update_point(a[u], Math.max(lis[u], old));
		for (int x : adjList[u]) {
			if (x != p) {
				solve(x, u);
			}
		}
		sg.update_point(a[u], old);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		a = sc.nextIntArr(n);
		adjList = new ArrayList[n];
		for (int i = 0; i < adjList.length; i++) {
			adjList[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			adjList[u].add(v);
			adjList[v].add(u);
		}
		int N = 1;
		while (N < n)
			N <<= 1;

		sg = new SegmentTree(new int[N + 1]);
		lis = new int[n];
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
		}
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		while (!ts.isEmpty()) {
			tm.put(ts.pollFirst(), tm.size() + 1);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = tm.get(a[i]);
		}
		solve(0, -1);
		for (int i = 0; i < lis.length; i++) {
			pw.println(lis[i]);
		}
		pw.close();

	}

	static class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree;

		SegmentTree(int[] in) {
			array = in;
			N = in.length - 1;
			sTree = new int[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
		}

		void update_point(int index, int val) // O(log n)
		{
			index += N - 1;
			sTree[index] = val;
			while (index > 1) {
				index >>= 1;
				sTree[index] = Math.max(sTree[index << 1], sTree[index << 1 | 1]);
			}
		}

		public int queryPoint(int index) {
			
			index += N - 1;
			return sTree[index];
		}

		int query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		int query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return 0;
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			int q1 = query(node << 1, b, mid, i, j);
			int q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return Math.max(q1, q2);

		}

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
