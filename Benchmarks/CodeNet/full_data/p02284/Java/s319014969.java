
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main bst = new Main();
		int ops = in.nextInt();
		while (in.hasNextLine()) {
			String[] holder;
			holder = in.nextLine().split(" ");
			
			if (holder[0].equals("insert")) {
				bst.insert(bst, new Node(Integer.parseInt(holder[1])));
			}
			else if (holder[0].equals("print")) {
				bst.print();
			}
			else if (holder[0].equals("find")) {
				if (bst.find(bst, Integer.parseInt(holder[1]))) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
		}
		
	}
	
	Node root;
	
	public Main() {
		root = null;
	}
	
	public boolean find(Main T , int k) {
		boolean result = false;
		Node curr = T.root;
		while (curr != null) {
			if (k == curr.key) {
				return true;
			} 			
			else if (k < curr.key) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		return result;
	}
	
	public void insert(Main T, Node z) {
		Node y = null;
		Node x = T.root;
		
		while (x != null) {
			y = x;
			if (z.key < x.key) {
				x = x.left;
			}
			else {
				x = x.right;
			}
		}
		z.p = y;
		
		if (y == null) {
			T.root = z;
		}
		else if (z.key < y.key) {
			y.left = z;
		}
		else {
			y.right = z;
		}
	}
	
	public String inOrder(Node z) {
		String result = "";
		if (z == null) {
			return result;
		}
		else {
			return inOrder(z.left) + " " + z.key + inOrder(z.right); 
		}
	}
	
	public String preOrder(Node z) {
		String result = "";
		if (z == null) {
			return result;
		}
		else {
			return " " + z.key + preOrder(z.left) + preOrder(z.right); 
		}
	}
	
	public void print() {
		System.out.println(this.inOrder(root));
		System.out.println(this.preOrder(root));
	}
}
class Node {
	int key; // Key of the node
	Node p; // Parent of the node
	Node left; // Left child
	Node right; // Right child
	
	public Node(int val) {
		key = val;
		p = null;
		left = null;
		right = null;
	}
	
	public String toString() {
		return key + "";
	}
}


