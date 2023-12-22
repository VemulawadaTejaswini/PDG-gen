
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

	public static void main(String[] args) throws IOException {
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
			int q = in.nextInt();
			int[] p = new int[n];
			int[] rank = new int[n];

			for (int i = 0; i < n; i++) {
				makeSet(p, rank, i);
			}

			for (int i = 0; i < q; i++) {
				int command = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				if (command == 0) {
					unite(p, rank, x, y);
				} else if (command == 1) {
					if (isSame(p, x, y)) {
						out.println("1");
					} else {
						out.println("0");
					}
				}
			}
		}
	}

	static void makeSet(int[] p, int[] rank, int x) {
		p[x] = x;
		rank[x] = 0;
	}

	static boolean isSame(int[] p, int x, int y) {
		return findSet(p, x) == findSet(p, y);
	}

	static void unite(int[] p,int[] rank, int x, int y) {
		link(p, rank, findSet(p, x) ,findSet(p, y));
	}

	static void link(int[] p, int[] rank, int x, int y) {
		if (rank[x] > rank[y]) {
			p[y] = x;
		} else {
			p[x] = y;
			if (rank[x] == rank[y]) {
				rank[y]++;
			}
		}
	}

	static int findSet(int[] p, int x) {
		if (x != p[x]) {
			p[x] = findSet(p, p[x]);
		}
		return p[x];
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

