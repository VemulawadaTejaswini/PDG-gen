
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
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

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int k = in.nextInt();
			int l = in.nextInt();
			UnionFind u1 = new UnionFind(n);
			UnionFind u2 = new UnionFind(n);
			for (int i = 0; i < k; i++) {
				int p = in.nextInt()-1;
				int q = in.nextInt()-1;
				u1.union(p, q);
			}
			for (int i = 0; i < l; i++) {
				int r = in.nextInt()-1;
				int s = in.nextInt()-1;
				u2.union(r, s);
			}
			Map<Long, Integer> roots = new HashMap<Long, Integer>();
			for (int i = 0; i < n; i++) {
				long code = (long)u1.table[i] << 32 | u2.table[i];
				roots.merge(code, 1, Integer::sum);
			}
			for (int i = 0; i < n; i++) {
				if (i > 0)out.print(" ");
				long code = (long)u1.table[i] << 32 | u2.table[i];
				out.print(roots.get(code));
			}

		}
	}

	static class UnionFind {
		private int[] table;
		private int[] rank;

		public UnionFind(int size) {
			this.table = new int[size];
			this.rank = new int[size];
			for (int i = 0; i < size; i++) {
				this.table[i] = i;
				this.rank[i] = 1;
			}
		}

		public boolean isSame(int node1, int node2) {
			return find(node1) == find(node2);
		}

		public int find(int node) {
			if (table[node] == node) {
				return node;
			} else {
				return table[node] = find(table[node]);
			}
		}

		public void union(int node1, int node2) {
			int root1 = find(node1);
			int root2 = find(node2);

			if (rank[root1] < rank[root2]) {
				table[root1] = root2;
			} else if (rank[root1] > rank[root2]) {
				table[root2] = root1;
			} else if (root1 != root2) {
				table[root2] = root1;
				rank[root1]++;
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
