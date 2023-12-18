import java.util.*;

public class Main {
	static class Node {
		int id;
		int depth = -1;
		Node parent = null;
		Set<Node> parents = new HashSet<>();
		List<Node> children = new ArrayList<>();

		Node(int id) {
			this.id = id;
		}

		void setDepth(Node from) {
			if (from == null) {
				this.depth = 0;
			} else {
				if (this.depth <= from.depth + 1) {
					this.parent = from;
					this.depth = from.depth + 1;
				}
				this.parents.remove(from);
			}
			if (this.parents.isEmpty()) {
				for (Node child : children) {
					child.setDepth(this);
				}
			}
		}
	}

	int N, M;
	int[] A, B;
	Node[] nodes;
	Node root;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		A = new int[N - 1 + M];
		B = new int[N - 1 + M];
		for (int i = 0; i < N - 1 + M; ++i) {
			tokens = in.nextLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]);
			B[i] = Integer.parseInt(tokens[1]);
		}
		in.close();

		this.nodes = genTree();
		this.root = findRoot(this.nodes);
		this.root.setDepth(null);
	}

	Node findRoot(Node[] nodes) {
		for (Node node : nodes) {
			if (node.parents.isEmpty()) {
				return node;
			}
		}
		return null;
	}

	Node[] genTree() {
		Node[] tree = new Node[N];
		for (int i = 0; i < N; ++i) {
			tree[i] = new Node(i);
		}
		// edgeの追加
		for (int i = 0; i < N - 1 + M; ++i) {
			Node src = tree[A[i] - 1];
			Node dst = tree[B[i] - 1];
			src.children.add(dst);
			dst.parents.add(src);
		}
		return tree;
	}

	void show() {
		for (int i = 0; i < N; ++i) {
			if (nodes[i].parent == null) {
				System.out.println(0);
			} else {
				System.out.println((nodes[i].parent.id + 1));
			}
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.show();
	}
}