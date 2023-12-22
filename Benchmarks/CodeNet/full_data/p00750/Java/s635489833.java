import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int si = sc.nextInt();
		int gi = sc.nextInt();
		if ((n|m|si|gi) == 0) return;
		V[] vs = new V[n];
		for (int i = 0; i < n; i++) vs[i] = new V();
		V s = vs[si];
		V g = vs[gi];

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String label = sc.next();
			vs[y].add(vs[x], label); // rev
		}


		g.memo = "";
		boolean cycle = false;
		for (int itr = 0; itr < n * (n + 1); itr++) {
			boolean update = false;
			for (V v : vs) {
				for (E e : v.es) {
					String nl = e.label + v.memo;
					if (e.to.memo.compareTo(nl) > 0) {
						e.to.memo = nl;
						update = true;
						if (e.to == s && itr >= n * n) cycle = true;
					}
				}
			}
			if (!update) break;
		}

		if (s.memo.equals("{") || cycle) {
			out.println("NO");
		} else {
			out.println(s.memo);
		}

	}

	class V {
		List<E> es = new ArrayList<E>();
		String memo = "{";
		void add(V to, String label) {
			this.es.add(new E(to, label));
		}
	}
	class E {
		V to;
		String label;
		E(V to, String label) {
			this.to = to;
			this.label = label;
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