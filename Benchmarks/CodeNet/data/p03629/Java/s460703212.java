
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		String al = "abcdefghijklmnopqrstuvwxyz";

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			List<String> s = new ArrayList<>();

			for (int i = 0; i < 26; i++) {
				s.add(al.substring(i, i+1));
			}

			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < 26; j++) {
					StringBuffer sb = new StringBuffer();
					sb.append(al.substring(i, i+1));
					sb.append(al.substring(j, j+1));
					s.add(sb.toString());
				}
			}

			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < 26; j++) {
					for (int k = 0; k < 26; k++) {
						StringBuffer sb = new StringBuffer();
						sb.append(al.substring(i, i+1));
						sb.append(al.substring(j, j+1));
						sb.append(al.substring(k, k+1));
						s.add(sb.toString());
					}
				}
			}

			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < 26; j++) {
					for (int k = 0; k < 26; k++) {
						for (int m = 0; m < 26; m++) {
							StringBuffer sb = new StringBuffer();
							sb.append(al.substring(i, i+1));
							sb.append(al.substring(j, j+1));
							sb.append(al.substring(k, k+1));
							sb.append(al.substring(m, m+1));
							s.add(sb.toString());
						}
					}
				}
			}

			String tar = in.nextString();

//			Map<String, Integer> map = new HashMap<>();
//			for (int i = 0; i < tar.length(); i++) {
//				map.merge(tar.substring(i, i+1), 1, Integer::sum);
//			}

			for (String str : s) {
				Pattern p = Pattern.compile(str);

				Matcher m = p.matcher(tar);
				if (m.find()) {
					continue;
				} else {
					out.println(str);
					return;
				}
			}



			System.out.println();
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
