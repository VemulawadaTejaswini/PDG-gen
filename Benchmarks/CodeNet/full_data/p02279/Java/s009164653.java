
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		new Main().run();
	}

	private void run() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] T = new Node[n];

		for (int i = 0; i < n; i++) {
			T[i] = new Node();
		}
		int l = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int v = Integer.parseInt(tokenizer.nextToken());
			T[v].id = v;
			int d = Integer.parseInt(tokenizer.nextToken());
			for (int j = 0; j < d; j++) {
				int c = Integer.parseInt(tokenizer.nextToken());
				if (j == 0) {
					T[v].l = c;
				} else {
					T[l].r = c;
				}
				l = c;
				T[c].p = v;
			}
		}
		int r = -1;
		for (int i = 0; i < n; i++) {
			if (T[i].p == -1) {
				r = i;
				break;
			}
		}
		int[] D = new int[n];
		rec(r, 0, D, T);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			print(i, T, D, builder);
		}
		System.out.print(builder);
	}

	private void print(int u, Node[] T, int[] D, StringBuilder builder) {
		builder.append("node ").append(u).append(": parent = ").append(T[u].p)
				.append(", depth = ").append(D[u]).append(", ");
		if (T[u].p == -1)
			builder.append("root, ");
		else if (T[u].l == -1)
			builder.append("leaf, ");
		else
			builder.append("internal node, ");
		builder.append("[");
		for (int i = 0, c = T[u].l; c != -1; i++, c = T[c].r) {
			if (i != 0)
				builder.append(", ");
			builder.append(c);
		}
		builder.append("]\n");
	}

	private void rec(int u, int p, int[] D, Node[] T) {
		Deque<Node> deque = new ArrayDeque<Node>();
		deque.offer(T[u]);
		while (!deque.isEmpty()) {
			int t = deque.size();
			for (int i = 0; i < t; i++) {
				Node node = deque.poll();
				D[node.id] = p;
				if (node.l != -1) {
					node = T[node.l];
					while (true) {
						deque.offer(T[node.id]);
						if (node.r != -1) {
							node = T[node.r];
						} else {
							break;
						}
					}
				}
			}
			p++;
		}
	}

	class Node {
		int id = -1;
		int p = -1;
		int l = -1;
		int r = -1;
	}
}