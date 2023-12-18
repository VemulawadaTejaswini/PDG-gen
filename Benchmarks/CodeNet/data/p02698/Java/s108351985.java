import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, m, k;
	static long mod = 998244353;
	static Boolean[][][] memo;
	static String s;
	static HashMap<Integer, Integer> nums;
	static ArrayList<Integer>[] ad;
	static boolean[] vis;
	static TreeSet<Long> al;
	static int[][] val;
	static int[] b;
	static int[] ans;
	static FenwickTree ft;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		b = new int[n];
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			ts.add(b[i] = sc.nextInt());
		}
		nums = new HashMap<>();
		int id = 1;
		ad = new ArrayList[n];
		for (int i = 0; i < n; i++)
			ad[i] = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			ad[a].add(b);
			ad[b].add(a);
		}
		ans = new int[n];
		while (!ts.isEmpty())
			nums.put(ts.pollFirst(), id++);
		ft = new FenwickTree(nums.size() + 1);
		dfs(0, -1);
		for (int i = 0; i < n; i++)
			out.println(ans[i]);
		out.flush();
	}

	static void dfs(int u, int p) {
		int v = ft.rsq(nums.get(b[u]) - 1) + 1;
		ans[u] = v;
		ArrayList<Integer> o = ft.point_update(nums.get(b[u]), v);
		for (int ch : ad[u])
			if (ch != p) {
				dfs(ch, u);
			}
		ft.reverse(o);
	}

	public static class FenwickTree { // one-based DS

		int n;
		int[] ft;
		int[] occ;

		FenwickTree(int size) {
			n = size;
			ft = new int[n + 1];
			occ = new int[n + 1];
		}

		int rsq(int b) // O(log n)
		{
			int sum = 0;
			while (b > 0) {
				sum = Math.max(ft[b], sum);
				b -= b & -b;
			} // min?
			return sum;
		}

		ArrayList<Integer> point_update(int k, int val) // O(log n), update = increment
		{
			ArrayList<Integer> points = new ArrayList<>();
			while (k <= n) {
				if (ft[k] < val) {
					points.add(k);
					points.add(ft[k]);
				}
				ft[k] = Math.max(val, ft[k]);
				k += k & -k;
			} // min?
			return points;
		}

		void reverse(ArrayList<Integer> g) {
			for (int i = 0; i < g.size(); i += 2) {
				ft[g.get(i)] = g.get(i + 1);
			}
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}