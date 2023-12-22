import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solution sol = new Solution();
		sol.solve(in, out);
		out.close();
	}

	private static class Solution {
		private void solve(InputReader in, PrintWriter out) {
			int n = in.ni(), m = in.ni(), k = in.ni();
			int[] a = in.readArray(n), b = in.readArray(m);
			LinkedList<Integer> A = new LinkedList<>();
			LinkedList<Integer> B = new LinkedList<>();
			for (int i = 0; i < a.length; ++i)
				A.add(a[i]);
			for (int j = 0; j < b.length; ++j)
				B.add(b[j]);
			int ans = 0;
			int res = 0;
			while (true) {
				if (!A.isEmpty() && !B.isEmpty()) {
					int aFirst = A.getFirst();
					int bFirst = B.getFirst();
					if (aFirst < bFirst) {
						ans += A.removeFirst();
					} else {
						ans += B.removeFirst();
					}
					if (ans > k)
						break;
					++res;
				} else break;
			}
			while (!A.isEmpty() && ans <= k) {
				ans += A.removeFirst();
				++res;
			}
			while (!B.isEmpty() && ans <= k) {
				ans += B.removeFirst();
				++res;
			}
			out.println(res);
		}
	}

	private static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		private InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		private String n() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		private int ni() {
			return Integer.parseInt(n());
		}

		private long nl() {
			return Long.parseLong(n());
		}

		private int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = ni();
			return a;
		}
	}

}
