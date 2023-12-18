
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

	static int maxN = 1000;
	static int maxM = 2000;
	static int n;
	static int m;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			// input
			n = in.nextInt();
			m = in.nextInt();

			List<Edge>[] list = new ArrayList[maxN+1];
			for (int i = 0; i <= maxN; i++) {
				list[i] = new ArrayList<>();
			}
			Node[] nodes = new Node[maxN+1];
			for (int i = 0; i < m; i++) {
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				long c = in.nextLong()*(-1);
				list[a].add(new Edge(b, c));
			}

			// solve
			for (int i = 0; i <= maxN; i++) {
				nodes[i] = new Node(i, Long.MAX_VALUE);
			}

			boolean isNega = bellmanFord(list, nodes, 0);
			if (isNega) {
				out.println("inf");
			} else {
				out.println(nodes[n-1].cost*(-1));
			}
		}
	}

	static boolean bellmanFord(List<Edge>[] list, Node[] nodes, int fromNode) {
		boolean isNegativeCycle = false;
		nodes[fromNode].cost = 0;
		if (list.length > 0) {
			for (int i = 0; i < nodes.length; i++) {
				for (int v = 0; v < nodes.length; v++) {
					for (int k = 0; k < list[v].size(); k++) {
						Edge e = list[v].get(k);
						if (nodes[v].cost != Long.MAX_VALUE
								&& nodes[e.toNodeNum].cost > nodes[v].cost + e.weight) {
							nodes[e.toNodeNum].cost = nodes[v].cost + e.weight;
							if (i == nodes.length - 1) return true;
						}
					}
				}
			}
		}
		return isNegativeCycle;
	}

	static class Node {
		int nodeNum;
		long cost;

		public Node(int nodeNum, long cost) {
			this.nodeNum = nodeNum;
			this.cost = cost;
		}
	}
	static class Edge {
		int toNodeNum;
		long weight;

		public Edge(int nodeNum, long weight) {
			this.toNodeNum = nodeNum;
			this.weight = weight;
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
