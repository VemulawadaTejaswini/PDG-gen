
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
			Node[] nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node();
			}
			int[] d = new int[n];
			String[] ty = new String[n];

			// solve
			for (int i = 0; i < n; i++) {
				int f = in.nextInt();
				int k = in.nextInt();
				List<Integer> list = new ArrayList<>();
				for (int j = 0; j < k; j++) {
					int t = in.nextInt();
					list.add(t);
				}

				if (!list.isEmpty()) {
					nodes[f].left = list.get(0);
				}
				for (int j = 0; j < list.size(); j++) {
					nodes[list.get(j)].parent = f;

					if (j == list.size() - 1) {
						continue;
					}
					nodes[list.get(j)].right = list.get(j + 1);
				}
			}

			// depth
			for (int i = 0; i < n; i++) {
				int t = i;
				Node node = nodes[t];
				int depth = 0;
				while (node.parent != -1) {
					t = node.parent;
					node = nodes[t];
					depth++;
				}
				d[i] = depth;
			}

			// type
			for (int i = 0; i < n; i++) {
				if (nodes[i].parent == -1) {
					ty[i] = "root";
				} else if (nodes[i].left == -1) {
					ty[i] = "leaf";
				} else {
					ty[i] = "internal node";
				}
			}

			// print
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < n; i++) {
				sb.append("node ").append(i).append(": parent = ").append(nodes[i].parent);
				sb.append(", depth = ").append(d[i]).append(", ").append(ty[i]).append(", [");
				if (nodes[i].left != -1) {
					sb.append(nodes[i].left);
					int next = nodes[i].left;
					while (nodes[next].right != -1) {
						sb.append(", ");
						sb.append(nodes[next].right);
						next = nodes[next].right;
					}
				}
				sb.append("]");

				if (i == n - 1) {
					continue;
				}
				sb.append("\n");
			}

			out.println(sb.toString());
		}
	}

	static class Node {
		int parent;
		int left;
		int right;
		Node() {
			this.parent = -1;
			this.left = -1;
			this.right = -1;
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

