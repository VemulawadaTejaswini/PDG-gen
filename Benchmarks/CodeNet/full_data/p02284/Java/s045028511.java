import java.util.Scanner;

/**
 * 二分探索木：探索
 * @author nobu
 * @see <a href="http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_8_B&lang=ja">ALDS1_8_B</a>
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String command;
		Tree tree = new Tree();
		for (int i = 0; i < n; i++) {
			command = sc.next();
			if ("insert".equals(command)) {
				int key = sc.nextInt();
				tree.insert(new Node(key));
			} else if ("find".equals(command)) {
				int key = sc.nextInt();
				System.out.println(tree.exists(key) ? "yes" : "no");
			} else if ("print".equals(command)) {
				tree.print(Tree.Order.InOrder);
				tree.print(Tree.Order.PreOrder);
			}
		}

		sc.close();
	}

}

class Node {
	int key;
	Node parent, left, right;

	Node(int key) {
		this.key = key;
	}
}

class Tree {
	enum Order {
		PreOrder,
		InOrder,
		PostOrder
	}

	Node root;

	protected Node insert(Node node) {
		Node parent = null;
		Node child = root;

		while (child != null) {
			parent = child;
			if (node.key < child.key) child =child.left;
			else child = child.right;
		}
		node.parent = child;

		if (parent == null) {
			root = node;
		} else if (node.key < parent.key) {
			parent.left = node;
		} else {
			parent.right = node;
		}

		return node;
	}

	protected boolean exists(int key) {
		Node child = root;
		while (child != null) {
			if (child.key == key) return true;
			if (key < child.key) child = child.left;
			else child = child.right;
		}
		return false;
	}

	protected void print(Order order) {
		switch (order) {
			case PreOrder:
				walkPreOrder(root);
				break;
			case InOrder:
				walkInOrder(root);
				break;
			case PostOrder:
				walkPostOrder(root);
				break;
		}
		System.out.println();
	}

	private void walkPreOrder(Node node) {
		if (node == null) return;
		System.out.print(" " + node.key);
		walkPreOrder(node.left);
		walkPreOrder(node.right);
	}

	private void walkInOrder(Node node) {
		if (node == null) return;
		walkInOrder(node.left);
		System.out.print(" " + node.key);
		walkInOrder(node.right);
	}

	private void walkPostOrder(Node node) {
		if (node == null) return;
		walkPostOrder(node.left);
		walkPostOrder(node.right);
		System.out.print(" " + node.key);
	}
}
