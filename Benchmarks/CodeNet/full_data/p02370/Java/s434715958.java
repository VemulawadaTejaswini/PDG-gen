
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

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
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };

	static class TaskX {
		@SuppressWarnings("unchecked")
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int v = in.nextInt(), e = in.nextInt();
			List<Integer>[] g = new ArrayList[v];
			g = Stream.generate(ArrayList::new).limit(v).toArray(List[]::new);
			int[] count = new int[v];

			for (int i = 0; i < e; i++) {
				int s = in.nextInt(), t = in.nextInt();
				g[s].add(t);
				count[t]++;
			}

			Queue<Integer> q = new ArrayDeque<>();
			List<Integer> topologicalSortList = new ArrayList<>();
			for (int i = 0; i < v; i++) {
				if (count[i] == 0) {
					q.add(i);
					topologicalSortList.add(i);
				}
			}

			while (!q.isEmpty()) {
				int from = q.remove();
				for (int i = 0; i < g[from].size(); i++) {
					int to = g[from].get(i);
					count[to]--;
					if (count[to] == 0) {
						q.add(to);
						topologicalSortList.add(to);
					}
				}
			}

			for (Integer num : topologicalSortList) {
				out.println(num);
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

