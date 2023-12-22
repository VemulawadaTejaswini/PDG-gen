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
		private void solve(InputReader in, PrintWriter out) {
			int heads = in.ni(), legs = in.ni();
			if (legs % 2 != 0 || heads == 0 || heads > legs) out.println("No");
			else {
				int t = (legs + (-2*heads))/2;
				int c = heads - t;
				if (t < 0 || c < 0) {
					out.println("No");
					return;
				}
				out.println("Yes");
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
