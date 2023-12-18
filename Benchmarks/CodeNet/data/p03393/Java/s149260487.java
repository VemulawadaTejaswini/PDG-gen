
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
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

			String input = in.nextString();
			String t = new String(input);
			char[] s = t.toCharArray();

			String[] al = "abcdefghijklmnopqrstuvwxyz".split("");

			int[] count = new int[26];
			for (int i = 0; i < s.length; i++) {
				count[s[i]-'a']++;
			}

			if ("zyxwvutsrqponmlkjihgfedcba".equals(input)) {
				out.println(-1);
				return;
			}

			StringBuffer sb = new StringBuffer();
			if (input.length() <= 25) {
				for (int i = 0; i < 26; i++) {
					if (count[i] == 0) {
						for (int j = 0; j < s.length; j++) {
							out.print(s[j]);
						}
						out.println(al[i]);
						return;
					}
				}
			} else {
				for (int i = 0; i < s.length; i++) {
					// 最大の場合と一致する時
					if (s[i] == al[25-i].toCharArray()[0]) {
						sb.append(s[i]);

					// 最大の場合と一致しなかった時
					} else {
						char min = 'z';
						int rep = -1;
						for (int j = i + 1; j < s.length; j++) {
							// 不一致の文字列を探索
							if (al[25-i].toCharArray()[0] == s[j]) {
								char kijun = s[j-1];
								rep = j-1;
								min = s[j];
								for (int k = j + 1; k < s.length; k++) {
									if (kijun < s[k]) {
										if (min > s[k]) {
											min = s[k];
										}
									}
								}
							}
						}

						for (int j = i; j < rep; j++) {
							sb.append(s[j]);
						}
						sb.append(min);
						break;
					}
				}
			}
			out.println(sb.toString());


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
