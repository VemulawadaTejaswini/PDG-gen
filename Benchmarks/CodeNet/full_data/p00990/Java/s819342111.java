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

	int ans = 0;
	int can;
	char[] s;

	void dfs(int even, int odd, int sum) {
		if (even == 0 && odd == 0) {
			if (sum % 10 == 0) {
				ans++;
			}
			return;
		}

		if (even > 0) {
			for (int i = 0; i <= 9; i++) {
				if ((can >> i & 1) == 1) {
					dfs(even - 1, odd, sum + i);
				}
			}
		} else {
			for (int i = 0; i <= 9; i++) {
				if ((can >> i & 1) == 1) {
					int a = i * 2;
					if (a >= 10) a = 1 + a - 10;
					dfs(even, odd - 1, sum + a);
				}
			}
		}
	}
	void solve() {
		int n = sc.nextInt();
		s = new char[n];
		String str = sc.next();
		for (int i = 0; i < n; i++) {
			s[n - 1 - i] = str.charAt(i);
		}
		int m = sc.nextInt();
		can = 0;
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			can |= (1 << x);
		}
		int sum = 0;
		int even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] != '*') {
				int a = s[i] - '0';
				if (i % 2 == 1) a <<= 1;
				if (a >= 10) a = 1 + a - 10;
				sum += a;
			} else {
				if (i % 2 == 0) even++; else odd++;
			}
		}
		ans = 0;
		dfs(even, odd, sum % 10);
		out.println(ans);
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