import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());

		Node[] nodes = new Node[n];
		for (int i=0; i < n; i++) {
			nodes[i] = new Node(i);
		}

		for (int i=0; i < n; i++) {
			String[] ilr = br.readLine().split(" "); // ilr : id left right
			int id = Integer.parseInt(ilr[0]);
			int left = Integer.parseInt(ilr[1]);
			int right = Integer.parseInt(ilr[2]);

			if (left != -1) {
				nodes[id].left = nodes[left];
				nodes[left].parent = nodes[id];
			}
			if (right != -1) {
				nodes[id].right = nodes[right];
				nodes[right].parent = nodes[id];
			}
		}

		Node root = null;
		for (Node node:nodes) {
			if (node.parent == null)
				root = node;
		}

		Tree t = new Tree(root);
//		System.out.println(t.rtree.ltree.rtree.ltree);
		StringBuilder presb = new StringBuilder();
		preorder(t, presb);
//		presb.delete(presb.length()-1, presb.length());

		StringBuilder insb = new StringBuilder();
		inorder(t, insb);
//		insb.delete(insb.length()-1, insb.length());

		StringBuilder postsb = new StringBuilder();
		postorder(t, postsb);
//		postsb.delete(postsb.length()-1, postsb.length());

		System.out.println("Preorder");
		System.out.println(presb);

		System.out.println("Inorder");
		System.out.println(insb);

		System.out.println("Postorder");
		System.out.println(postsb);
	}

	public static class Node {
		int id;
		Node left;
		Node right;
		Node parent;

		public Node(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "" + id;
		}
	}

	public static class Tree {
		Node root;
		Tree ltree;
		Tree rtree;

		public Tree(Node root) {
			this.root = root;

			if (root.left != null)
				ltree = new Tree(root.left);

			if (root.right != null)
				rtree = new Tree(root.right);
		}
	}

	public static void preorder(Tree tree, StringBuilder sb) {
//		StringBuilder sb = new StringBuilder();
		if (tree.ltree==null && tree.rtree==null) {
//			sb.append(tree.root.id + " ");
			sb.append(" " + tree.root.id);
			return;
		}

//		sb.append(tree.root.id + " ");
		sb.append(" " + tree.root.id);

		if (tree.ltree != null)
			preorder(tree.ltree, sb);

		if (tree.rtree != null)
			preorder(tree.rtree,sb);
	}

	public static void inorder(Tree tree, StringBuilder sb) {
		if (tree.ltree==null && tree.rtree==null) {
//			sb.append(tree.root.id + " ");
			sb.append(" " + tree.root.id);
			return;
		}

		if (tree.ltree != null)
			inorder(tree.ltree, sb);

//		sb.append(tree.root.id + " ");
		sb.append(" " + tree.root.id);

		if (tree.rtree != null)
			inorder(tree.rtree, sb);
	}

	public static void postorder(Tree tree, StringBuilder sb) {
		if (tree.ltree==null && tree.rtree==null) {
//			sb.append(tree.root.id + " ");
			sb.append(" " + tree.root.id);
			return;
		}

		if (tree.ltree != null)
			postorder(tree.ltree, sb);

		if (tree.rtree != null)
			postorder(tree.rtree, sb);

//		sb.append(tree.root.id + " ");
		sb.append(" " + tree.root.id);
	}
}