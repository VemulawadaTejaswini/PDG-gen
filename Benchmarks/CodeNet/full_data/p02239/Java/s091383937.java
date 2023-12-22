
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int[][] matrix = new int[n+1][n+1];
			for (int i = 0; i < n; i++) {
				int fromNode = in.nextInt();
				int outBoundCount = in.nextInt();
				for (int k = 0; k < outBoundCount; k++) {
					int toNode = in.nextInt();
					matrix[fromNode][toNode] = 1;
				}
			}

			int[] v = new int[n+1];

			// 1から順番に頂点を探索
			for (int i = 1; i <= n; i++) {
				v = SearchUtil.bfs(matrix, v, i);
			}

			for (int i = 1; i <= n; i++) {
				out.println(i + " " + v[i]);
			}
		}

	}

	static class SearchUtil {
		/**
		 * @param matrix グラフ
		 * @param v[] 訪問済リスト
		 *
		 * */
		public static int[] bfs(int[][] matrix, int[] v, int from) {

			for (int to = 1; to < v.length; to++) {
				if (matrix[from][to] == 1) {
					int count = v[from] + 1;
					if (v[to] == 0 || count < v[to]) {
						v[to] = count;
					}
				}
			}
			return v;
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

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

