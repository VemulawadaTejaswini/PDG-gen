import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Node root = null;

		for (int i = 0; i < num; i++) {
			String element = scanner.next();
			if (!element.equals("print")) {
				int key = scanner.nextInt();
				Node node = new Node(key);
				if (root == null) {
					root = node;
					continue;
				}
				treeInsert(root, node);
			} else {
				StringBuilder stringBuilder = new StringBuilder();
				root.inorderTreeWalk(stringBuilder);
				System.out.println(stringBuilder);
				stringBuilder = new StringBuilder();
				root.preorderTreeWalk(stringBuilder);
				System.out.println(stringBuilder);
			}
		}

	}

	static void treeInsert(Node root, Node z) {
		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (z.key < x.key) {
				x = x.leftChild;
			} else {
				x = x.rightChild;
			}
		}
		z.parent = y;

		if (y == null) {
			root = z;
		} else if (z.key < y.key) {
			y.leftChild = z;
		} else {
			y.rightChild = z;
		}
	}
}
 class Node {
	/** ????????????????????§??? */
	public Node parent;
	
	/** ???????????§??? */
	public Node rightChild;
	
	/** ???????????§??? */
	public Node leftChild;
	
	/** ?????????????????§??? */
	public int key;
	
	public Node(int key) {
		this.key = key;
	}
	
	/** ??????????????????????????? */
	public void inorderTreeWalk(StringBuilder stringBuilder) {
		if (leftChild != null) {
			leftChild.inorderTreeWalk(stringBuilder);
		}
		stringBuilder.append(" " + String.valueOf(key));
		if (rightChild != null) {
			rightChild.inorderTreeWalk(stringBuilder);
		}
	}
	
	/** ??????????????????????????? */
	public void preorderTreeWalk(StringBuilder stringBuilder) {
		stringBuilder.append(" " + String.valueOf(key));
		if (leftChild != null) {
			leftChild.preorderTreeWalk(stringBuilder);
		}
		if (rightChild != null) {
			rightChild.preorderTreeWalk(stringBuilder);
		}
	}
}