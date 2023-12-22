import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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
		final int[] a = new int[2_00_000_0];
		private void solve(InputReader in, PrintWriter out) {
			int n = in.ni();
			for (int i = 0; i < n; i++) {
				a[i] = in.ni();
			}
			int total = 0;
			for (int i = 0; i < n; ++i) {
				int k=0;
				for (int j = i+1; j < n; ++j) {
					if (a[i]%a[j] != 0) ++k;
					if (k == i+1) ++total;
				}
			}
          if (total == 0) {
				out.println(0);
				return;
			}
			out.println(total-1);
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
