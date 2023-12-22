import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node[] nodes = new Node[n];

		for (int i = 0; i < n; i++) {
			int node = sc.nextInt();
			int childnum = sc.nextInt();
			int[] children = new int[childnum];
			for (int j = 0; j < childnum; j++) {
				children[j] = sc.nextInt();
			}
			Node kari = new Node(node, -1, 0, "", children);
			nodes[i] = kari;
		}

		for (int i = 0; i < n; i++) {
			for (int k : nodes[i].children) {
				nodes[k].parent = i;
				nodes[k].depth = nodes[i].depth + 1;
			}
		}

		for (Node node : nodes) {
			System.out.print("node " + node.node + ": " + "parent = "
					+ node.parent + ", " + "depth = " + node.depth + ", ");
			if (node.parent == -1) {
				System.out.print("root, [");
				for (int i = 0; i < node.children.length - 1; i++) {
					System.out.print(node.children[i] + ", ");
				}
				System.out.println(node.children[node.children.length - 1] + "]");
			} else if (node.children.length == 0) {
				System.out.println("leaf, []");

			} else {
				System.out.print("internal node, [");
				for (int i = 0; i < node.children.length - 1; i++) {
					System.out.print(node.children[i] + ", ");
				}
				System.out.println(node.children[node.children.length - 1] + "]");
			}
		}

	}

}

class Node {
	int node;
	int parent;
	int depth;
	String type;
	int[] children;

	public Node(int node, int parent, int depth, String type, int[] children) {
		super();
		this.node = node;
		this.parent = parent;
		this.depth = depth;
		this.type = type;
		this.children = children;
	}
}