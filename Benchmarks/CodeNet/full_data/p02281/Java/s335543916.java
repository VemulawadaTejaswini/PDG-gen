import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	class Node {
		int p = -1, l, r;
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++)
			nodes[i] = new Node();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			nodes[id].l = l;
			nodes[id].r = r;
			if (l != -1)
				nodes[l].p = id;
			if (r != -1)
				nodes[r].p = id;
		}
		reader.close();

		int rootId = -1;
		for (int i = 0; i < n; i++) {
			if (nodes[i].p == -1) {
				rootId = i;
				break;
			}
		}
		System.out.println("Preorder");
		preOrderItr(nodes, rootId);
		System.out.println();

		System.out.println("Inorder");
		inOrderItr(nodes, rootId);
		System.out.println();

		System.out.println("Postorder");
		postOrderItr(nodes, rootId);
		System.out.println();
	}

	private void preOrderItr(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(rootId);
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			System.out.print(" " + cur);
			if (nodes[cur].r != -1)
				stack.push(nodes[cur].r);
			if (nodes[cur].l != -1)
				stack.push(nodes[cur].l);
		}
	}

	private void inOrderItr(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		int cur = rootId;
		while (cur != -1 || !stack.isEmpty()) {
			while (cur != -1) {
				stack.push(cur);
				cur = nodes[cur].l;
			}
			cur = stack.pop();
			System.out.print(" " + cur);
			cur = nodes[cur].r;
		}
	}


	private void postOrderItr(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		int lastNodeVisited = -1;
		int cur = rootId;
		while (cur != -1 || !stack.isEmpty()) {
			if (cur != -1) {
				stack.push(cur);
				cur = nodes[cur].l;
			} else {
				int peekId = stack.peek();
				if (nodes[peekId].r != -1 && lastNodeVisited != nodes[peekId].r) {
					cur = nodes[peekId].r;
				} else {
					System.out.print(" " + peekId);
					lastNodeVisited = stack.pop();
				}
			}
		}
	}
	
//	private void preOrder(Node[] nodes, int u) {
//		if (u == -1)
//			return;
//		System.out.print(" " + u);
//		preOrder(nodes, nodes[u].l);
//		preOrder(nodes, nodes[u].r);
//	}	
//	private void inOrder(Node[] nodes, int u) {
//		if (u == -1)
//			return;
//		inOrder(nodes, nodes[u].l);
//		System.out.print(" " + u);
//		inOrder(nodes, nodes[u].r);
//	}
//	private void postOrder(Node[] nodes, int u) {
//		if (u == -1)
//			return;
//		postOrder(nodes, nodes[u].l);
//		postOrder(nodes, nodes[u].r);
//		System.out.print(" " + u);
//	}	
}

