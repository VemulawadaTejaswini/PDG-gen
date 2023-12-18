import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;

import java.io.*;

public class Main {

	int[][] d;
	IntVec[] g;
	int[] as, bs;
	
	void solve() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		d = new int[N][N];
		g = new IntVec[N];
		as = new int[N-1];
		bs = new int[N-1];
		for (int i = 0; i < N; i++) g[i] = new IntVec(10);
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
			as[i] = a;
			bs[i] = b;
		}
		for (int i = 0; i < N; i++)
			dfs(i, -1, 0, i);
		int ans = N;
		
		if (K % 2 == 0) {
			for (int i = 0; i < N; i++) {
				int del = 0;
				for (int j = 0; j < N; j++) {
					if (d[i][j] > K/2) {
						del++;
					}
				}
				ans = Math.min(ans, del);
			}
		} else {
			for (int m = 0; m < N - 1; m++) {
				int a = as[m];
				int b = bs[m];
				int del = 0;
				for (int j = 0; j < N; j++) {
					int dist = Math.min(d[a][j], d[b][j]);
					if (dist > K/2) del++;
				}
				ans = Math.min(ans, del);
			}
		}
		out.println(ans);
		
		
	}
	
	void dfs(int pos, int prev, int dist, int root) {
		d[root][pos] = dist;
		for (int i = 0; i < g[pos].size(); i++) {
			int next = g[pos].get(i);
			if (next != prev)
				dfs(next, pos, dist + 1, root);
		}
	}
	
	public class IntArray {
		protected int size;
		protected int[] data;
		IntArray(int maxSize) {
			size = 0;
			data = new int[maxSize];
		}
		int size() { return size; }
		int get(int index) { return data[index]; }
		void add(int a) { data[size++] = a; }
		int back() { return data[size-1]; }
		void clear() { size = 0; }
	}

	public class IntVec extends IntArray {
		IntVec(int maxSize) {
			super(maxSize);
		}
		void add(int a) {
			if (size >= data.length) {
				int[] newData = new int[(data.length * 3) >> 1];
				System.arraycopy(data, 0, newData, 0, data.length);
				data = newData;
			}
			data[size++] = a;
		}
	}
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(int[][] as) { for (int[] a : as) tr(a); }

	void print(int[] a) {
		out.print(a[0]);
		for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
		out.println();
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}