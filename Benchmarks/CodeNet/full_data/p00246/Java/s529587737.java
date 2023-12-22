import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
	for (;;) {
		int n = sc.nextInt();
		if (n == 0) return;
		int[] a = sc.nextIntArray(n);
		int[] b = new int[10];
		for (int x : a) b[x]++;
		int res = b[5] / 2;
		b[5] %= 2;
		for (int i = 1; i <= 4; i++) {
			int m = Math.min(b[i], b[10 - i]);
			b[i] -= m;
			b[10 - i] -= m;
			res += m;
		}
		patternList = new java.util.ArrayList<int[][]>();
		make(b);
		md = 0;
		search(b, 0, 0);
		System.out.println(res + md);
	}
	}
	int md;
	void search(int[] b, int d, int s) {
		if (d >= md) {
			md = d;
		}
		for (int i = s; i < patternList.size(); i++) {
			int[][] p = patternList.get(i);
			boolean ok = true;
			for (int[] k : p) {
				b[k[0]] -= k[1];
				if (b[k[0]] < 0) ok = false;
			}
			if (ok) {
				search(b, d + 1, i);
			}
			for (int[] k : p) {
				b[k[0]] += k[1];
			}
		}
	}

	List<int[][]> patternList;
	void make(int[] b) {
		int[] pattern = new int[10];
		dfs(b, pattern, 0, 0);
	}

	void dfs(int[] b, int[] pattern, int depth, int sum) {
		if (sum == 10) {
			int[] hist = new int[10];
			for (int i = 0; i < depth; i++) {
				hist[pattern[i]]++;
			}
			int nz = 0;
			for (int i = 0; i < hist.length; i++) if (hist[i] > 0) nz++;
			if (nz > 2) {
				int[][] k = new int[nz][2];
				int p = 0;
				for (int i = 0; i < hist.length; i++) if (hist[i] > 0) {
					k[p][0] = i;
					k[p][1] = hist[i];
					p++;
				}
				patternList.add(k);
			}
			return;
		}
		int s = (depth == 0) ? 1 : pattern[depth-1];

		for (int i = s; i <= 9; i++) if (b[i] > 0 && sum + i <= 10) {
			pattern[depth] = i;
			dfs(b, pattern, depth + 1, sum + i);
			pattern[depth] = 0;
		}
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