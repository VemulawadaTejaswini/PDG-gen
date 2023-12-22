import java.util.Scanner;

class Main {
	static Node node;
	static Node root;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ins;
		for (int i = 0; i < n; i++) {
			ins = sc.next();
			if (ins.equals("print")) {
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			} else if (ins.equals("insert")) {
				Node z = new Node();
				z.key = sc.nextInt();
				insert(z);
			} else if (ins.equals("find")) {
				int k = sc.nextInt();
				find(k);
				System.out.println();
			} else if (ins.equals("delete")) {

				Node z = new Node();
				z.key = sc.nextInt();
				delete(z);
			}

		}
	}
	static void inorder(Node node) {
		if (node == null) return;
		inorder(node.l);
		System.out.print(" " + node.key);
		inorder(node.r);
	}

	static void preorder(Node node) {
		if (node == null) return;
		System.out.print(" " + node.key);
		preorder(node.l);
		preorder(node.r);
	}

	static void insert(Node z) {
		if (root == null) {
			root = z;
			return;
		}
		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (z.key < x.key) x = x.l;
			else x = x.r;
		}

		if (z.key < y.key) y.l = z;
		else y.r = z;
	}

	static void find(int k) {
		node = root;
		while (true) {
			if (node.key > k) {
				if (node.l == null) {
					System.out.print("no");
					return;
				} else {
					node = node.l;
				}
			} else if (node.key < k) {
				if (node.r == null) {
					System.out.print("no");
					return;
				} else {
					node = node.r;
				}
			} else if (node.key == k) {
				System.out.print("yes");
				return;
			}
		}
	}

	static void delete(Node z) {
		Node p = null;
		node = root;
		while (z.key != node.key) {
			p = node;
			if (node.key > z.key) node = node.l;
			else if (node.key < z.key) node = node.r;
		}
		if (node.l == null && node.r == null) {
			if (p.key < node.key) p.r = null;
			else p.l = null;
		} else if (node.l == null) {
			if (p.key < node.key) p.r = node.r;
			else p.l = node.r;
		} else if (node.r == null) {
			if (p.key < node.key) p.r = node.l;
			else p.l = node.l;
		} else {
			p = node;
			node = node.r;
			if (node.l == null) {
				if (p.key < node.key) p.r = node.r;
				else p.l = node.r;
			} else if (node.r == null) {
				if (p.key < node.key) p.r = node.l;
				else p.l = node.l;
			}
		}
	}
}

class Node {
	int key;
	Node l;
	Node r;
	Node() {
		key = -1;
		l = null;
		r = null;
	}
}