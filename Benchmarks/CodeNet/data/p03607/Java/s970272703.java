import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		AVLTree avltree = new AVLTree();
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			if (avltree.contain(a)) {
				avltree.delete(a);
				--ans;
			}else{
				avltree.insert(a);
				++ans;
			}
		}
		System.out.println(ans);
	}

	/*
	 * 重複要素を持たない実装。 一応verify済み。
	 */
	public static class AVLTree {
		Node root = null;

		class Node {
			long key;
			int height;
			int balance;
			int sz = 1;
			Node left = null;
			Node right = null;
			Node parent = null;

			public Node(long key_, Node parent_) {
				key = key_;
				parent = parent_;
			}
		}

		Node kth(int k) {
			Node node = root;
			int sum = 0;
			while (node != null) {
				if (sum + node.sz < k) {
					return null;
				}
				if (sum + sz(node.left) + 1 == k) {
					return node;
				}
				if (sum + sz(node.left) + 1 < k) {
					sum = sum + 1 + sz(node.left);
					node = node.right;
				} else {
					node = node.left;
				}
			}
			return null;
		}

		boolean contain(int delKey) {
			if (root == null)
				return false;
			Node node = root;
			while (node != null) {
				if (delKey == node.key) {
					return true;
				}
				node = delKey >= node.key ? node.right : node.left;
			}
			return false;
		}

		boolean delete(int delKey) {
			if (root == null)
				return false;
			Node node = root;
			while (node != null) {
				if (delKey == node.key) {
					delete(node);
					return true;
				}
				node = delKey >= node.key ? node.right : node.left;
			}
			return false;
		}

		void delete(Node node) {
			if (node.left == null && node.right == null) {
				if (node.parent == null) {
					root = null;
					return;
				}
				Node parent = node.parent;
				if (parent.left == node)
					parent.left = null;
				else
					parent.right = null;
				rebalance(parent);
			}
			if (node.left != null) {
				Node child = node.left;
				while (child.right != null) {
					child = child.right;
				}
				node.key = child.key;
				delete(child);
			} else if (node.right != null) {
				Node child = node.right;
				while (child.left != null) {
					child = child.left;
				}
				node.key = child.key;
				delete(child);
			}
		}

		boolean insert(long key) {
			if (root == null) {
				root = new Node(key, null);
				return true;
			}
			Node cur = root;
			Node parent = null;
			while (true) {
				if (cur.key == key) {
					return false;
				}
				parent = cur;
				boolean goLeft = key < cur.key;
				cur = goLeft ? cur.left : cur.right;
				if (cur == null) {
					if (goLeft) {
						parent.left = new Node(key, parent);
					} else {
						parent.right = new Node(key, parent);
					}
					rebalance(parent);
					break;
				}

			}
			return true;
		}

		void rebalance(Node n) {
			setBalance(n);
			if (n.balance == -2) {
				if (height(n.left.left) >= height(n.left.right)) {
					n = rotateRight(n);
				} else {
					n = rotateLeftThenRight(n);
				}
			} else if (n.balance == 2) {
				if (height(n.right.right) >= height(n.right.left)) {
					n = rotateLeft(n);
				} else {
					n = rotateRightThenLeft(n);
				}
			}
			if (n.parent != null) {
				rebalance(n.parent);
			} else {
				root = n;
			}
		}

		void setBalance(Node... nodes) {
			for (Node n : nodes) {
				reheight(n);
				n.balance = height(n.right) - height(n.left);
				n.sz = 1 + sz(n.left) + sz(n.right);
			}
		}

		int sz(Node node) {
			return node != null ? node.sz : 0;
		}

		int height(Node node) {
			return node != null ? node.height : -1;
		}

		void reheight(Node node) {
			if (node != null) {
				node.height = 1 + Math.max(height(node.right), height(node.left));
			}
		}

		Node rotateRight(Node a) {
			Node b = a.left;
			if (a.parent != null) {
				if (a.parent.left == a) {
					a.parent.left = b;
				} else {
					a.parent.right = b;
				}
			}
			b.parent = a.parent;
			a.parent = b;
			a.left = b.right;
			b.right = a;
			if (a.left != null)
				a.left.parent = a;
			setBalance(a, b);
			return b;
		}

		Node rotateLeft(Node a) {
			Node b = a.right;
			if (a.parent != null) {
				if (a.parent.right == a) {
					a.parent.right = b;
				} else {
					a.parent.left = b;
				}
			}
			b.parent = a.parent;
			a.parent = b;
			a.right = b.left;
			b.left = a;
			if (a.right != null)
				a.right.parent = a;
			setBalance(a, b);
			return b;
		}

		Node rotateLeftThenRight(Node n) {
			n.left = rotateLeft(n.left);
			return rotateRight(n);
		}

		Node rotateRightThenLeft(Node n) {
			n.right = rotateRight(n.right);
			return rotateLeft(n);
		}

		void inOrder(Node cur) {
			if (cur == null)
				return;
			inOrder(cur.left);
			System.out.println(cur.key);
			inOrder(cur.right);
		}
	}

}