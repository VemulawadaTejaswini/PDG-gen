import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int N = sc.nextInt();
		if (N == 0) return;
		int start = sc.nextInt() - 1;
		int goal = sc.nextInt() - 1;
		int D = sc.nextInt();
		char[][] s = new char[D][];

		for (int i = 0; i < D; i++) {
			s[i] = sc.next().toCharArray();
		}
		if (goal == sim(start, s)) {
			out.println(0);
			return;
		}
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (s[i][j] == '0') {
					if (j + 1 < N - 1 && s[i][j+1] == '1' ||
						j - 1 >= 0 && s[i][j-1] == '1') {
						;
					} else {
						s[i][j] = '1';
						if (goal == sim(start, s)) {
							out.println((i+1) + " " + (j+1));
							return;
						}
						s[i][j] = '0';
					}
				}
			}
		}
		out.println(1);
	}

	int sim(int pos, char[][] s) {
		int D = s.length;
		int N = s[0].length + 1;
		for (int i = 0; i < D; i++) {
			if (pos < N - 1 && s[i][pos] == '1') {
				pos += 1;
			} else if (pos > 0 && s[i][pos-1] == '1') {
				pos -= 1;
			}
		}
		return pos;
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