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
		new Solution().solve(in, out);
		out.close();
	}
	
	private static class Solution {

		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			String s = in.next();
			int ans = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = i; j < n; ++j) {
					for (int k = j; k < n; ++k) {
						if (s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k))
							if (j - i != k - j) ++ans;
					}
				}
			}
			out.println(ans);
		}
		
	}
	

	private static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32678);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		private int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
