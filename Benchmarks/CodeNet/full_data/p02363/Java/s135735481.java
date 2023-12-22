
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

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

	static int INF = Integer.MAX_VALUE;
	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int v = in.nextInt();
			int e = in.nextInt();
			int[][] w = new int[v][v];
			int len = w.length;
			for (int i = 0; i < len; i++) {
				Arrays.fill(w[i], INF);
			}
			for (int i = 0; i < len; i++) {
				w[i][i] = 0;
			}
			for (int i = 0; i < e; i++) {
				int s = in.nextInt();
				int t = in.nextInt();
				int d = in.nextInt();
				w[s][t] = d;
			}

			warshallFloyd(w);

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < v; i++) {
				if (w[i][i] < 0) {
					sb = new StringBuffer();
					sb.append("NEGATIVE CYCLE\n");
					break;
				}
				for (int j = 0; j < v; j++) {
					if (j != 0) {
						sb.append(" ");
					}
					if (w[i][j] == INF) {
						sb.append("INF");
					} else {
						sb.append(w[i][j]);
					}
				}
				sb.append("\n");
			}
			out.print(sb.toString());

		}

		void warshallFloyd(int[][] d) {
			int len = d.length;
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					if (d[j][i] == INF) continue;
					for (int k = 0; k < len; k++) {
						if (d[i][k] == INF) continue;
						d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
					}
				}
			}
		}
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
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

