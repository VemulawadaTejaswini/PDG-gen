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

	class IntArray {
		private int size;
		private int[] data;
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

	boolean isLeapYear(int y) {
		return y % 400 == 0 || (y % 100 != 0 && y % 4 == 0);
	}

	void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 && b == 0) System.exit(0);
		IntArray ans = new IntArray(b - a + 1);
		for (int i = a; i <= b; i++) {
			if (isLeapYear(i)) {
				ans.add(i);
			}
		}
		if (ans.size() == 0) {
			out.println("NA");
		} else {
			for (int i = 0; i < ans.size(); i++) {
				out.println(ans.get(i));
			}
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
		boolean first = true;
		for (;sc.hasNext();) {
			if (!first) out.println();
			first = false;
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