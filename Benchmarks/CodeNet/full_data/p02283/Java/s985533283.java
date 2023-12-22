import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );
		int m = Integer.parseInt(br.readLine());

		Node dammy = new Node(0, null, null);
		for (int i=0; i < m; i++) {
			String[] command = br.readLine().split(" ");

			switch (command[0]) {
			case "insert":
				int k = Integer.parseInt(command[1]);
				Node z = new Node(k);
				insert(dammy, z);
				break;
			case "print":
				inorder(dammy.left);
				System.out.println();
				preorder(dammy.left);
				System.out.println();
				break;
			}
		}
	}

	public static class Node {
		int key;

		Node parent;

		Node left;

		Node right;

		public Node(int key) {
			this.key = key;
		}

		public Node(int key, Node left, Node right) {
			this(key);
			this.left = left;
			this.right = right;
		}
	}

//	public static class Tree {
//		Node root;
//
//		Tree left;
//
//		Tree right;
//	}

	public static void preorder(Node u) {
		System.out.print(" " + u.key);

		if (u.left != null) preorder(u.left);

		if (u.right != null) preorder(u.right);
	}

	public static void inorder(Node u) {
		if (u.left != null) inorder(u.left);

		System.out.print(" " + u.key);

		if (u.right != null) inorder(u.right);
	}

	// dammy???left=right???????????????root?????????
	public static void insert(Node dammy, Node z) {
		Node y = null;
		Node x = dammy.left; // root

		while (x != null) {
			y = x;
			if (z.key < x.key)
				x = x.left;
			else
				x = x.right;
		}
		z.parent = y;

		if (y == null)
			dammy.left = dammy.right = z;
		else if (z.key < y.key)
			y.left = z;
		else
			y.right = z;
	}
}