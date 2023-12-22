import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private class Node<T> {
		T key;
		Node<T> left;
		Node<T> right;
		Node<T> parent;
		public Node(T key) {
			this.key = key;
			left = right = parent = null;
		}
		public String toString() {
			return key.toString();
		}
	}
	
	private class BST {
		
		private Node<Integer> rootNode;
		public BST() {
			rootNode = null;
		}
		
		public void insert(Node<Integer> node) {			
			Node<Integer> parent = null;
			Node<Integer> cur = rootNode;
			while (cur != null) {
				parent = cur;
				if (node.key < cur.key) {
					cur = cur.left;
				} else {
					cur = cur.right;
				}
			}
			node.parent = parent;
			if (parent == null) {
				rootNode = node;
			} else if (node.key < parent.key) {
				parent.left = node;
			} else {
				parent.right = node;
			}
		}
		
		public void print() {
			printInOrder(rootNode);
			System.out.println("");
			printPreOrder(rootNode);
			System.out.println("");
		}
		
		private void printInOrder(Node<Integer> node) {
			if (node != null) {
				printInOrder(node.left);
				System.out.print(" " + node);
				printInOrder(node.right);
			}			
		}
		
		private void printPreOrder(Node<Integer> node) {
			if (node != null) {
				System.out.print(" " + node);
				printPreOrder(node.left);
				printPreOrder(node.right);
			}			
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		BST bst = new BST();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("insert")) {
				bst.insert(new Node<Integer>(Integer.parseInt(st.nextToken())));
			} else {
				bst.print();
			}
		}
		reader.close();
	}
}

