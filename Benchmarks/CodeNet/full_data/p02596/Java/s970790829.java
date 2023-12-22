import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Repsept {

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
			int k = in.ni(), max = 1000000;
			int n = 0;
			if (k % 2 == 0) {
				out.println(-1);
				return;
			}
			for (int i = 0; i < max; ++i) {
				n = (n * 10 + 7) % k;
				if (n == 0) {
					out.println(i + 1);
					return;
				}
			}
			if (n != 0) {
				out.println(-1);
			}
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
	}
}