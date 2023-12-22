import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] tenbo = new int[n][2];

		for (int i = 0; i < n; i++) {
			tenbo[i][0] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			int[] a = tenbo[sc.nextInt() - 1];
			int[] b = tenbo[sc.nextInt() - 1];
			if (a[0] == b[0]) {
				a[1] = 1;
				b[1] = 1;
			} else if (a[0] > b[0]) {
				b[1] = 1;
			} else {
				a[1] = 1;
			}

		}
		System.out.println(Arrays.stream(tenbo).filter(s -> s[1] == 0).count());

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