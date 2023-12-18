import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			char[] s = in.next().toCharArray();
			int[] am = new int[256];
			for (char c : s) {
				++am[c];
			}
			int ans = 0;
			int i = 0;
			int n = s.length;
			while (i < n) {
				int odd = -1;
				for (int c = 'a'; c <= 'z'; c++) {
					if (am[c] % 2 == 1) {
						odd = c;
					}
				}
				if (odd < 0) {
					if (ans == 0) {
						++ans;
					}
					break;
				}
				int[] curAm = new int[256];
				int j = i;
				int numOdd = 0;
				while (j < n) {
					int c = s[j];
					++j;
					if (curAm[c] % 2 == 1) {
						--numOdd;
					}
					++curAm[c];
					if (curAm[c] % 2 == 1) {
						++numOdd;
					}
					if (curAm[c] % 2 == 1 && am[c] % 2 == 1 && numOdd == 1) {
						break;
					}
				}
				for (int k = i; k < j; k++) {
					--am[s[k]];
				}
				++ans;
				i = j;
			}
			out.println(ans);
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

	}
}

