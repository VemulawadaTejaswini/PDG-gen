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
			Node[] nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node();
			}
			for (int i = 0; i < n; i++) {
				int v = in.nextInt();
				int left = in.nextInt();
				int right = in.nextInt();
				nodes[v].left = left;
				nodes[v].right = right;
				if (left != -1) {
					nodes[left].parent = v;
				}
				if (right != -1) {
					nodes[right].parent = v;
				}
			}

			int root = -1;
			for (int i = 0; i < n; i++) {
				if (nodes[i].parent == -1) root = i;
			}
			System.out.println("Preorder");
			preorder(nodes, root);
			System.out.println();

			System.out.println("Inorder");
			inorder(nodes, root);
			System.out.println();

			System.out.println("Postorder");
			postorder(nodes, root);
			System.out.println();
		}
	}

	static void preorder(Node[] nodes, int root) {
		if (root == -1) {
			return;
		}
		System.out.print(" " + root);
		preorder(nodes, nodes[root].left);
		preorder(nodes, nodes[root].right);
	}

	static void inorder(Node[] nodes, int root) {
		if (root == -1) {
			return;
		}
		inorder(nodes, nodes[root].left);
		System.out.print(" " + root);
		inorder(nodes, nodes[root].right);
	}

	static void postorder(Node[] nodes, int root) {
		if (root == -1) {
			return;
		}
		postorder(nodes, nodes[root].left);
		postorder(nodes, nodes[root].right);
		System.out.print(" " + root);
	}

	static class Node {
		int parent, left, right;
		public Node() {
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

