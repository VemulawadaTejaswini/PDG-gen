import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static class Node {
		int key;
		Node parent;
		Node right;
		Node left;

		public Node(int key) {
			this.key = key;
		}
	}

	public static Node root;

	public static Node treeSearch(Node u, int k) {
//		if (u == null) return null;
		Node x = u;
		while (x != null) {
			if (k < x.key) {
				x = x.left;
			} else if (x.key < k) {
				x = x.right;
			} else { // k == x.key
				return x;
			}
		}
		return null;
	}

	// x???root??¨??????tree????????§?????§???key?????????Node
	private static Node treeMaximum(Node x) {
		if (x == null) return null;
		while (x.right != null) {
			 x = x.right;
		}
		return x;
	}

	// x?????????????????? x????????£?????´????????£???????????\???Node
	// ??£???????????\???Node???root??¨??????tree?????????????????£?????\??????
	private static Node treeSuccessor(Node x) {
		if (x.right == null && x.left == null) {
			return null;
		}
		if (x.right == null) {
			x.left.parent = x.parent;
			return x.left;
		}
		if (x.left == null) {
			x.right.parent = x.parent;
			return x.right;
		}

		Node r = treeMaximum(x.left);
		r.parent.right = r.left;
		if (r.left != null) {
			r.left.parent = r.parent;
		}
		x.key = r.key;
		return x;
	}

	// z?????????????????? z?????£???????????\???Node??????????????£???
	// ??????Node??????pointer??????z?????????z??????poiter?????£???????????\??????
	public static void treeDelete(Node z) {
		if (z == null) return;

		Node p = z.parent;
		if (p == null) {
			treeSuccessor(root);
			return;
		}
		if (p.right == z) {
			p.right = treeSuccessor(z);
		} else { // p.left == z
			p.left = treeSuccessor(z);
		}
		return;

	}

	public static void insert(int k) {
		Node x = root;
		if (x == null) {
			root = new Node(k);
			return;
		}

		while (true) {
			if (k < x.key) {
				if (x.left == null) {
					x.left = new Node(k);
					x.left.parent = x;
					return;
				}
				x = x.left;
			} else { // x.key <= k
				if (x.right == null) {
					x.right = new Node(k);
					x.right.parent = x;
					return;
				}
				x = x.right;
			}
		}
	}

	public static void inorder(Node u) {
		if (u.left != null) inorder(u.left);

		System.out.print(" " + u.key);

		if (u.right != null) inorder(u.right);
	}

	public static void preorder(Node u) {
		System.out.print(" " + u.key);

		if (u.left != null) preorder(u.left);

		if (u.right != null) preorder(u.right);
	}

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );
		int n = Integer.parseInt(br.readLine());
		int x;
		for (int i=0; i< n; i++) {
			String[] com = br.readLine().split(" ");

			switch (com[0]) {
			case "find":
				x = Integer.parseInt(com[1]);
				Node t = treeSearch(root, x);
				if (t != null) System.out.println("yes");
				else System.out.println("no");
				break;

			case "insert":
				x = Integer.parseInt(com[1]);
				insert(x);
				break;

			case "print":
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
				break;

			case "delete":
				x = Integer.parseInt(com[1]);
				treeDelete( treeSearch(root, x) );
				break;
			}
		}
	}

}