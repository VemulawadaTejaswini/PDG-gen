
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

			int h = in.nextInt(), w = in.nextInt();
			boolean is_h_even = h % 2 == 0 ? true : false;
			boolean is_w_even = w % 2 == 0 ? true : false;

			int evenCount = 0;
			if (is_w_even) {
				evenCount = w / 2;
			} else {
				evenCount = h / 2;
			}

			int[] s = new int[26];
			for (int i = 0; i < h; i++) {
				char[] t = in.nextString().toCharArray();
				for (int j = 0; j < w; j++) {
					s[t[j]-'a']++;
				}
			}

			boolean ans = true;
			if (is_w_even && is_h_even) {
				for (int i = 0; i < 26; i++) {
					if (s[i] % 4 == 0) {
						continue;
					} else {
						ans = false;
						break;
					}
				}
			} else if  ((is_w_even && !is_h_even) || (!is_w_even && is_h_even)) {
				int count = 0;
				for (int i = 0; i < 26; i++) {
					if (s[i] % 2 == 0) {
						s[i] = s[i] / 2;
						if (s[i] % 2 == 1) {
							count++;
						}
						continue;
					} else {
						ans = false;
						break;
					}
				}
				if (count != evenCount) {
					ans = false;
				}
			} else if (!is_w_even && !is_h_even) {
				int oddCount = 0;
				int oddCharNum = 0;
				for (int i = 0; i < 26; i++) {
					if (s[i] % 2 == 1) {
						oddCount++;
						oddCharNum = i;
					}
				}
				if (oddCount >= 2) {
					ans = false;
				} else {
					s[oddCharNum]--;
				}
				for (int i = 0; i < 26; i++) {
					if (s[i] % 2 == 0) {
						continue;
					} else {
						ans = false;
						break;
					}
				}
			}

			if (ans) {
				out.println("Yes");
			} else {
				out.println("No");
			}

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
