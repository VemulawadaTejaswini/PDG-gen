
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

	static int INF = 1 << 26;
	static int MOD = 998244353;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			String str = in.nextString();
			int[] num = new int[4];
			for (int i = 0; i < 4; i++) {
				num[i] = Integer.parseInt(str.substring(i, i+1));
			}

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					for (int k = 0; k < 2; k++) {
						int s = num[0];
						if (i == 0) {
							s += num[1];
						} else {
							s -= num[1];
						}
						if (j == 0) {
							s += num[2];
						} else {
							s -= num[2];
						}
						if (k == 0) {
							s += num[3];
						} else {
							s -= num[3];
						}
						if (s == 7) {
							StringBuffer sb = new StringBuffer();
							sb.append(num[0]);
							if (i == 0) {
								sb.append("+");
							} else {
								sb.append("-");
							}
							sb.append(num[1]);
							if (j == 0) {
								sb.append("+");
							} else {
								sb.append("-");
							}
							sb.append(num[2]);
							if (k == 0) {
								sb.append("+");
							} else {
								sb.append("-");
							}
							sb.append(num[3]);
							sb.append("=7");
							out.println(sb.toString());
							return;
						}
					}
				}
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