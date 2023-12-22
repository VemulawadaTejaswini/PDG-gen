import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) {
		new Main().solution();
	}

	public void solution() {
		Scanner sc= new Scanner(System.in);
		int op_num= sc.nextInt();
		Node root = null;
		int k, p;
		

		for(int i = 0; i < op_num; i++) {
			String op = sc.next();

			if(op.equals("insert")) {
				k = sc.nextInt();
				p = sc.nextInt();
				root = insert(root, k, p);
			} else if(op.equals("find")) {
				k = sc.nextInt();
				System.out.println(find(root, k) ? "yes" : "no");
			} else if(op.equals("delete")) {
				k = sc.nextInt();
				root = Delete(root, k);
			} else if(op.equals("print")) {
				Print(root);
			}
		}
	}

	public Node right_rotate(Node t) {
		Node s = t.left;
		t.left = s.right;
		s.right = t;
		return s;
	}

	public Node left_rotate(Node t) {
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
				t = right_rotate(t);
		} else {
			t.right = insert(t.right, key, pri);
			if(t.pri < t.right.pri)
				t = left_rotate(t);
		}

		return t;
	}

	public Node Delete(Node t, int key) {
		if(t == null)
			return null;

		if(key == t.key) {
			if(t.left == null && t.right == null)
				return null;
			else if(t.left == null)
				t = left_rotate(t);
			else if(t.right == null)
				t = right_rotate(t);
			else {
				if(t.left.pri > t.right.pri)
					t = right_rotate(t);
				else 
					t = left_rotate(t);
			}

			return Delete(t, key);
		}

		if(key < t.key)
			t.left = Delete(t.left, key);
		else
			t.right = Delete(t.right, key);

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

	public void Print(Node root) {
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
	}

	private void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(" " + root.key);
			inorder(root.right);
		}
	}

	private void preorder(Node root) {
		if(root != null) {
			System.out.print(" " + root.key);
			preorder(root.left);
			preorder(root.right);
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
