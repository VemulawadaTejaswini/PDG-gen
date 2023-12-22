import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node[] nodes = new Node[n];
		StringBuilder[] children = new StringBuilder[n];

		for (int i = 0; i < n; i++) {
			nodes[i] = new Node(-1, -1, -1);
		}

		for (int i = 0; i < n; i++) {
			int node = sc.nextInt();
			int Cnum = sc.nextInt();

			int[] Ckari = new int[Cnum];

			children[node] = new StringBuilder("[");

			for (int j = 0; j < Cnum; j++) {
				Ckari[j] = sc.nextInt();

				if (j == 0) {
					nodes[i].left = Ckari[j];
				} else {
					nodes[Ckari[j - 1]].right = Ckari[j];
				}

				nodes[Ckari[j]].parent = i;

				children[i].append(Ckari[j]);
				if (j != Cnum - 1) {
					children[i].append(", ");
				}
			}

			children[i].append("]");
		}
		
		int[] D = new int[n];
		setDepth(nodes, D, 0, 0);

		for (int i = 0; i < n; i++) {
			StringBuilder kari = new StringBuilder();
			kari.append("node ");
			kari.append(i);
			kari.append(": parent = ");
			kari.append(nodes[i].parent);
			kari.append(", depth = ");
			kari.append(D[i]);
			kari.append(", ");
			if (nodes[i].parent == -1) {
				kari.append("root, ");
			} else if (nodes[i].left == -1) {
				kari.append("leaf, ");
			} else {
				kari.append("internal node, ");
			}
			kari.append(children[i]);
			System.out.println(kari);
		}

	}

	public static void setDepth(Node[] nodes ,int[] D ,int u, int p) {
		D[u] = p;
		if (nodes[u].right != -1) {
			setDepth(nodes, D, nodes[u].right, p);
		}
		if (nodes[u].left != -1) {
			setDepth(nodes, D, nodes[u].left, p+1);
		}
	}

}

class Node {
	int parent;
	int left;
	int right;

	public Node(int parent, int left, int right) {
		super();
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

}