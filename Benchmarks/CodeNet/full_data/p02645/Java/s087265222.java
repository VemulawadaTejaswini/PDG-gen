import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = in.nextIntArray(n);

		for (int i = 0; i < k; ++i) {
			int[] b = new int[n];
			for (int j = 0; j < n; ++j) {
				int l = Math.max(0, j - a[j]);
				int r = Math.min(n - 1, j + a[j]);
				b[l]++;
				if (r + 1 < n)
					b[r + 1]--;
			}
			a = b.clone();
			for (int x = 1; x < n; ++x)
				a[x] += a[x - 1];
		}

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < n; i++) {
			res.append(a[i] + " ");
		}
		out.println(res.toString());
		out.flush();
		out.close();
	}

	static class FastReader {
		StringTokenizer st;
		BufferedReader br;

		public FastReader(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public FastReader(FileReader fileReader) {
			br = new BufferedReader(fileReader);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = nextInt();
			}
			return ret;
		}

		public long[] nextIntLong(int n) throws IOException {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = nextLong();
			}
			return ret;
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}