import java.util.*;
import java.io.*;

public class Main {
	static int[] a, lis, b;
	static ArrayList<Integer>[] adjList;

	static Stack<Solve> st = new Stack<Solve>();

	public static int bins(int key) {
		int lo = 0;
		int hi = b.length - 1;
		int ans = -1;
		while (lo <= hi) {
			int mid = lo + hi >> 1;
			if (b[mid] >= key) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static void solve(int u, int p) {
		st.add(new Solve(0, -1, true));
		while (!st.isEmpty()) {
			st.pop().ex();
		}
	}

	static class Solve {
		int u;
		int p;
		boolean s;
		int old;
		int changedidx;

		public Solve(int u, int p, boolean s) {
			this.u = u;
			this.p = p;
			this.s = s;
		}

		public Solve(int old, int changedidx) {
			this.old = old;
			this.changedidx = changedidx;
			s = false;
		}

		public void ex() {
			if (s) {
				int changedidx = bins(a[u]);
				lis[u] = changedidx + 1;
				int old = b[changedidx];
				b[changedidx] = a[u];
				st.add(new Solve(old, changedidx));
				for (int x : adjList[u]) {
					if (x != p) {
						st.add(new Solve(x, u, true));

					}
				}
			} else {
				b[changedidx] = old;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		a = sc.nextIntArr(n);
		b = new int[n + 1];
		Arrays.fill(b, (int) 1e9);
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
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
		}
		int m = ts.size();
		int N = 1;

		while (N < m)
			N <<= 1;

		lis = new int[n];

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
