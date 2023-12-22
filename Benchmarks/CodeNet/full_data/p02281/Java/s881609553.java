import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private class Node {
		int p = -1, l, r;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
		preOrder(nodes, rootId);
		System.out.println("Inorder");
		inOrder(nodes, rootId);
		System.out.println("Postorder");
		postOrder(nodes, rootId);
	}
	
	private void preOrder(Node[] nodes, int rootId) {
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
		System.out.println("");
	}

	private void inOrder(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		int cur = rootId;
		while (cur != -1 || !stack.isEmpty()) {
			if (cur != -1) {
				stack.push(cur);
				cur = nodes[cur].l;
			} else {
				cur = stack.pop();
				System.out.print(" " + cur);
				cur = nodes[cur].r;
			}
		}
		System.out.println("");
	}

	private void postOrder(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		int lastVisited = -1;
		int cur = rootId;
		while (cur != -1 || !stack.isEmpty()) {
			if (cur != -1) {
				stack.push(cur);
				cur = nodes[cur].l;
			} else {
				int peekId = stack.peek();
				if (nodes[peekId].r != -1 && nodes[peekId].r != lastVisited) {
					cur = nodes[peekId].r;
				} else {
					System.out.print(" " + peekId);
					lastVisited = stack.pop();
				}
			}
		}
		System.out.println("");
	}
}
