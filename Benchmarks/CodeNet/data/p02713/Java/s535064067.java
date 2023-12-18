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
		private void solve(InputReader in, PrintWriter out) {
			int k = in.nextInt();
			long ans = 0;
			for (int a = 1; a <= k; ++a)
				for (int b = 1; b <= k; ++b)
					for (int c = 1; c <= k; ++c)
						ans += gcd(gcd(a, b), c);
			out.println(ans);
		}
		
		private long gcd(long a, long b) {
			while (b != 0) {
				long m = a % b;
				a = b;
				b = m;
			}
			return a;
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
