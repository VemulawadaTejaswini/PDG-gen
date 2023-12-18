import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int n = sc.nextInt();
		int[] a = sc.nextIntArray(n);

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				loop: for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j]) {
						int tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;

						for (int k = 0; k < n - 1; k++) {
							if (a[k] > a[k + 1]) {
								a[j] = a[i];
								a[i] = tmp;
								continue loop;
							}
						}
						System.out.println("YES");
						return;
					}
				}
			}
		}

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

	static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

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

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
	}
}