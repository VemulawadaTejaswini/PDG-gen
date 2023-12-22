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
 *
 * @author lucasr
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		BSubstring solver = new BSubstring();
		solver.solve(1, in, out);
		out.close();
	}

	static class BSubstring {
		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			char[] S = sc.next().toCharArray();
			char[] T = sc.next().toCharArray();
			int ans = T.length;

			for (int i = 0; i + T.length <= S.length; i++) {
				int tmp = 0;
				for (int j = 0; j < T.length; j++) {
					if (T[j] != S[i + j]) tmp++;
				}
				ans = Math.min(ans, tmp);
			}

			out.println(ans);
		}

	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;

		public MyScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

	}
}

