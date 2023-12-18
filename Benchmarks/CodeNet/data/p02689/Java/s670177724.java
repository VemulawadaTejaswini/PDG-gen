import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ten = new int[n][3];
		int[][] root = new int[m][2];
		for (int i = 0; i < ten.length; i++) {
			ten[i][0] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			root[i][0] = sc.nextInt();
			root[i][1] = sc.nextInt();
		}
		for (int[] i : root) {
			int[] j = ten[i[0] - 1];
			int[] k = ten[i[1] - 1];
			if (j[0] == k[0]) {
				j[2] = 1;
				k[2] = 1;
			} else if (j[0] < k[0]) {
				if (k[2] == 0) {
					k[1] = 1;
					k[2] = 1;
				}
				j[1] = 0;
				j[2] = 1;
			} else {
				if (j[2] == 0) {
					j[1] = 1;
					j[2] = 1;
				}
				k[1] = 0;
				k[2] = 1;
			}
		}

		int count = 0;
		for (int[] i : ten) {
			count += i[1] == 1 ? 1 : 0;
			count += i[2] == 1 ? 0 : 1;
		}
		System.out.println(count);
	}

	static class FastScanner {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public String nextLine() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					return reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			return tokenizer.nextToken("\n");
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
	}
}