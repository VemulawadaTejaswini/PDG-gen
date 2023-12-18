
import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			char[] s = in.nextString().toCharArray();
			char[] a = new char[26];
			int len = s.length;
			for (int i = 0; i < len; i++) {
				a[s[i] - 'a']++;
			}

			int maxCount = 0;
			for (int i = 0; i < 26; i++) {
				maxCount = max(maxCount, a[i]);
			}

			if (maxCount == 1) {
				out.println("-1 -1");
				return;
			}

			List<P> list = new ArrayList<>();
			for (int i = 0; i < 26; i++) {
				if (a[i] == maxCount) {
					list.add(new P((char)(i + 'a')));
				}
			}

			for (P p : list) {
				int min = INF;
				int max = 0;
				for (int i = 0; i < len; i++) {
					if (p.c == s[i]) {
						min = min(min, i);
						max = max(max, i);
					}
				}
				p.min = min;
				p.max = max;
			}

			for (P p : list) {
				int count = p.max - p.min + 1;
				int pCount = 0;
				for (int i = p.min; i <= p.max; i++) {
					if (s[i] == p.c) pCount++;
				}
				if (count != pCount && (count / 2) < pCount) {
					out.println((p.min + 1) + " " + (p.max + 1));
					return;
				}
			}

			out.println("-1 -1");

		}
	}
	static class P {
		char c;
		int min, max;
		P (char c) {
			this.c = c;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
