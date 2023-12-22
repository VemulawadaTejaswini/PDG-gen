
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		new Main().run();
	}

	private void run() throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node();
		}
		for (int i = 0; i < n; i++) {
			int v = scanner.nextInt();
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			nodes[v].l = l;
			nodes[v].r = r;
			if (l != -1)
				nodes[l].p = v;
			if (r != -1)
				nodes[r].p = v;
		}

		int root = 0;
		for (int i = 0; i < n; i++) {
			if (nodes[i].p == -1) {
				root = i;
			}
		}
		System.out.println("Preorder");
		preParse(root, nodes);
		System.out.println();
		System.out.println("Inorder");
		inParse(root, nodes);
		System.out.println();
		System.out.println("Postorder");
		postParse(root, nodes);
		System.out.println();
	}

	private void postParse(int u, Node[] nodes) {
		if (u == -1)
			return;
		postParse(nodes[u].l, nodes);
		postParse(nodes[u].r, nodes);
		System.out.print(" " + u);
	}

	private void inParse(int u, Node[] nodes) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(u);
		boolean[] b = new boolean[nodes.length];
		while (!deque.isEmpty()) {
			u = deque.peek();
			int l = nodes[u].l;
			if (l != -1 && !b[l]) {
				deque.push(l);
				continue;
			}
			deque.poll();
			b[u] = true;
			System.out.print(" " + u);
			int r = nodes[u].r;
			if (r != -1 && !b[r]) {
				deque.push(r);
			}

		}
	}

	private void preParse(int u, Node[] nodes) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(u);
		while (!deque.isEmpty()) {
			u = deque.poll();
			System.out.print(" " + u);
			if (nodes[u].r != -1)
				deque.push(nodes[u].r);
			if (nodes[u].l != -1)
				deque.push(nodes[u].l);
		}

	}

	class Node {
		int p = -1, l, r;
	}
}