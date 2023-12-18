import java.util.*;
import java.io.*;

public class Main {

	class DSU {
		int[] p;

		public DSU(int n) {
			p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
		}

		int get(int i) {
			if (p[i] == i) {
				return i;
			}
			return p[i] = get(p[i]);
		}

		void union(int a, int b) {
			p[get(b)] = get(a);
		}
	}

	void solve() {
		int n = in.nextInt(), m = in.nextInt();
		int[] cost = new int[n];
		for (int i = 0; i < n; i++) {
			cost[i] = in.nextInt();
		}
		DSU dsu = new DSU(n);
		for (int i = 0; i < m; i++) {
			dsu.union(in.nextInt(), in.nextInt());
		}
		int edges = n - m - 1;
		int needTake = 2 * edges;
		int[] count = new int[n];

		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		Arrays.sort(a, (i, j) -> Integer.compare(cost[i], cost[j]));
		long ans = 0;
		for (int i : a) {
			if (count[dsu.get(i)] == edges || needTake == 0) {
				continue;
			}
			count[dsu.get(i)]++;
			ans += cost[i];
			needTake--;
		}
		out.println(needTake == 0 ? ans : "Impossible");
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
