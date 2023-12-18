import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] s = new int[n];
			int[] c = new int[m];
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < n; i++) {
				sb.append("X");
			}
			int digit;
			char value;
			String ans = "";
			for (int i = 0; i < m; i++) {
				digit = in.nextInt() - 1;
				value = in.nextChar();
				if (digit == 0 && value == '0') {
					ans = "-1";
					break;
				}
				if (sb.toString().charAt(digit) != value && sb.toString().charAt(digit) == 'X') {
					sb.setCharAt(digit, value);
				} else if (sb.toString().charAt(digit) != value) {
					ans = "-1";
					break;
				}
				ans = sb.toString();
			}
			if (!ans.equals("-1")) {
				ans = ans.replace("X", "0");
			}
			out.println(ans);
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

		public char nextChar() {
			return next().charAt(0);
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}
