import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int p = -1, l, r;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			if (nodes[id] == null) nodes[id] = new Node();
			nodes[id].l = l;
			nodes[id].r = r;
			if (l != -1) {
				if (nodes[l] == null) nodes[l] = new Node();
				nodes[l].p = id;
			}
			if (r != -1) {
				if (nodes[r] == null) nodes[r] = new Node();
				nodes[r].p = id;
			}
		}
		int rootId = -1;
		for (int i = 0; i < n; i++) {
			if (nodes[i].p == -1) {
				rootId = i;
				break;
			}
		}
		
		System.out.println("Preorder");
		preOrder(nodes, rootId);
		System.out.println();
		System.out.println("Inorder");
		inOrder(nodes, rootId);
		System.out.println();
		System.out.println("Postorder");
		postOrder(nodes, rootId);
		System.out.println();
	}

	private static void preOrder(Node[] nodes, int u) {
		if (u == -1) return;
		System.out.print(" " + u);
		preOrder(nodes, nodes[u].l);
		preOrder(nodes, nodes[u].r);		
	}
	
	private static void inOrder(Node[] nodes, int u) {
		if (u == -1) return;
		inOrder(nodes, nodes[u].l);
		System.out.print(" " + u);
		inOrder(nodes, nodes[u].r);
	}

	private static void postOrder(Node[] nodes, int u) {
		if (u == -1) return;
		postOrder(nodes, nodes[u].l);
		postOrder(nodes, nodes[u].r);
		System.out.print(" " + u);
	}
}

