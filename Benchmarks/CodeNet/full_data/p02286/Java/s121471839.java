import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) {
		new Main().surprise();
	}

	public void surprise() {
		Scanner scanner = new Scanner(System.in);
		int numOps = scanner.nextInt();
		int key, pri;
		Node root = null;

		for(int i = 0; i < numOps; i++) {
			String op = scanner.next();

			if(op.equals("insert")) {
				key = scanner.nextInt();
				pri = scanner.nextInt();
				root = insert(root, key, pri);
			} else if(op.equals("find")) {
				key = scanner.nextInt();
				System.out.println(find(root, key) ? "yes" : "no");
			} else if(op.equals("delete")) {
				key = scanner.nextInt();
				root = erase(root, key);
			} else if(op.equals("print")) {
				printTreap(root);
			}
		}
	}

	public Node rightRotate(Node t) {
		Node s = t.left;
		t.left = s.right;
		s.right = t;
		return s;
	}

	public Node leftRotate(Node t) {
		Node s = t.right;
		t.right = s.left;
		s.left = t;
		return s;
	}

	public Node insert(Node t, int key, int pri) {
		if(t == null)
			return new Node(key, pri);

		if(key == t.key)
			return t;

		if(key < t.key) {
			t.left = insert(t.left, key, pri);
			if(t.pri < t.left.pri)
				t = rightRotate(t);
		} else {
			t.right = insert(t.right, key, pri);
			if(t.pri < t.right.pri)
				t = leftRotate(t);
		}

		return t;
	}

	public Node erase(Node t, int key) {
		if(t == null)
			return null;

		if(key == t.key) {
			if(t.left == null && t.right == null)
				return null;
			else if(t.left == null)
				t = leftRotate(t);
			else if(t.right == null)
				t = rightRotate(t);
			else {
				if(t.left.pri > t.right.pri)
					t = rightRotate(t);
				else 
					t = leftRotate(t);
			}

			return erase(t, key);
		}

		if(key < t.key)
			t.left = erase(t.left, key);
		else
			t.right = erase(t.right, key);

		return t;
	}

	public boolean find(Node root, int target) {
		if(root == null)
			return false;

		if(root.key == target)
			return true;
		else if(root.key < target)
			return find(root.right, target);
		else
			return find(root.left, target);
	}

	public void printTreap(Node root) {
		inorderTraverse(root);
		System.out.println();
		preorderTraverse(root);
		System.out.println();
	}

	private void inorderTraverse(Node root) {
		if(root != null) {
			inorderTraverse(root.left);
			System.out.print(" " + root.key);
			inorderTraverse(root.right);
		}
	}

	private void preorderTraverse(Node root) {
		if(root != null) {
			System.out.print(" " + root.key);
			preorderTraverse(root.left);
			preorderTraverse(root.right);
		}
	}

	class Node {
		int key;
		int pri;
		Node left;
		Node right;

		public Node(int k, int p) {
			key = k;
			pri = p;
			left = null;
			right = null;
		}
	}
}

