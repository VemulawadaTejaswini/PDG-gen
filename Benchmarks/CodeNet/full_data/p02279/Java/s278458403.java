
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] T = new Node[n];

		for (int i = 0; i < n; i++) {
			T[i] = new Node();
		}
		int l = 0;
		for (int i = 0; i < n; i++) {
			int v = scanner.nextInt();
			T[v].id = v;
			int d = scanner.nextInt();
			for (int j = 0; j < d; j++) {
				int c = scanner.nextInt();

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
		for (int i = 0; i < n; i++) {
			print(i, T, D);
		}
	}

	private void print(int u, Node[] T, int[] D) {
		System.out
				.printf("node %d: parent = %d, depth = %d, ", u, T[u].p, D[u]);
		if (T[u].p == -1)
			System.out.print("root, ");
		else if (T[u].l == -1)
			System.out.print("leaf, ");
		else
			System.out.print("internal node, ");
		System.out.print("[");
		for (int i = 0, c = T[u].l; c != -1; i++, c = T[c].r) {
			if (i != 0)
				System.out.print(", ");
			System.out.print(c);
		}
		System.out.println("]");
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

	private void slove(Deque<Node> deque, Node node, Node[] T) {
		if (node.r != -1) {
			deque.offer(T[node.r]);
			slove(deque, T[node.r], T);

		}
	}

	class Node {
		int id = -1;
		int p = -1;
		int l = -1;
		int r = -1;
	}
}