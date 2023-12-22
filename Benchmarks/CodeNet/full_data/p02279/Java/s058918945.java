
import java.util.*;

class Node {
	public int id;
	public Node parent;
	public Node[] children;
	public int depth;

	Node(int id) {
		this.id = id;
	}
	void setChilidren(Node[] children) {
		this.children = children;
		for (int i = 0; i < children.length; i++) {
			this.children[i].setParent(this);
		}
	}
	void setParent(Node parent) {
		this.parent = parent;
	}
	void setDepth(int depth) {
		this.depth = depth;
		if (this.children != null) {
			for (int i = 0; i < children.length; i++) {
				this.children[i].setDepth(depth + 1);
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] tree = new Node[n];
		for (int i = 0; i < n; i++) {
		    tree[i] = new Node(i);
		}
		for (int i = 0; i < n; i++) {
			Node node = tree[scanner.nextInt()];
			int k = scanner.nextInt();
			if (k > 0) {
				Node[] c = new Node[k];
				for (int j = 0; j < k; j++) {
					c[j] = tree[scanner.nextInt()];
				}
				node.setChilidren(c);
			}
		}
		Node root = null;
		for (int i = 0; i < n; i++) {
			if (tree[i].parent == null) {	
				root = tree[i];
				break;
			}
		}
		root.setDepth(0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("node ");
			sb.append(i);
			sb.append(": parent = ");
			sb.append(tree[i].parent == null ? -1 : tree[i].parent.id);
			sb.append(", depth = ");
			sb.append(tree[i].depth);
			sb.append(", ");
			if (tree[i].parent == null) {
				sb.append("root");
			} else {
				sb.append(tree[i].children == null ? "leaf" : "internal node");
			}
			sb.append(", [");
			if (tree[i].children != null) {
				for (int j = 0; j < tree[i].children.length; j++) {
					sb.append(tree[i].children[j].id);
					sb.append(j == tree[i].children.length - 1 ? "]" : ", ");
				}
			} else {
				sb.append("]");
			}

			sb.append("\n");
		}
		System.out.print(sb);
	}
}