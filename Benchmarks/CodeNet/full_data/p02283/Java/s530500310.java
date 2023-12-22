
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			String order = sc.next();
			if(order.equals("insert")) {
				tree.insert(new BinaryTree().new Node(sc.nextLong()));
			}
			if(order.equals("print")) {
				tree.inOrder(tree.root);
				System.out.println();
				tree.preOrder(tree.root);
				System.out.println();
			}
		}
	}
}

class BinaryTree {
	
	Node root;
	
	class Node{
		Node left;
		Node right;
		long value;
		public Node(long value) {
			super();
			this.value = value;
		}
		
		
		
	}
	
	/*
	 * public void insert(Node node, long value) { if(root == null) { root = new
	 * Node(value); return; } if(node.value>value) { if(node.left == null) {
	 * node.left = new Node(value); }else { insert(node.left,value); } }else {
	 * if(node.right == null) { node.right = new Node(value); }else {
	 * insert(node.right,value); } } }
	 */
	
//	public void insert(long value) {
//		Node node;
//		Node parent = null;
//		if(root == null) {
//			root = new Node(value);
//			return;
//		}
//		node = root;
//		while(node !=null) {
//			parent = node;
//			if(node.value>value) {
//				node = node.left;
//			}else {
//				node = node.right;
//			}
//		}
//		
//		node = new Node(value);
//		if(parent.value>node.value) {
//			parent.left = node;
//		}else {
//			parent.right = node;
//		}
//		
//	}
	//t root  x=node y=parent
	public void insert(Node n) {
		Node node = root;
		Node parent = null;
		
		while(node !=null) {
			parent = node;
			if(node.value>n.value) {
				node = node.left;
			}else {
				node = node.right;
			}
		}
		if(parent==null) {
			root = n;
		}else if(parent.value>n.value) {
			parent.left = n;
		}else {
			parent.right = n;
		}
		
	}
	
	public void preOrder(Node n) {
		if(n == null) {
			return;
		}
		System.out.print(" "+n.value);
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void inOrder(Node n) {
		if(n == null) {
			return;
		}
		inOrder(n.left);
		System.out.print(" "+n.value);
		inOrder(n.right);
	}
	

}

