import java.util.*;

public class Main {
//	private Node root = null;
////	
////	void insert(int n) {
////		if(root == null) {
////			root = new Node(n);
////		}
////		
////		if(root)
////		
////	}
//	
//	void insert(int data) {
//		root = insert(root, data);
//	}
//	
//	Node insert(Node root, int data) {
//		if (root == null) {
//			return new Node(data);
//		} else {
//			Node cur;
//			if (root.left == null) {
//				root.left = new Node(data);
//			} else if(root.right == null){
//				root.right = new Node(data);
//			}
//			else{
//				cur = insert(root.left, data);
//			}
//			return root;
//		}
//	}
	
	public static void main(String args[]) {
		
		Main tree = new Main();
		Scanner s = new Scanner(System.in);
		int total_nodes = s.nextInt();
		int n;
		int[] heap = new int[total_nodes + 1];
		
		
		for(int i = 1; i < total_nodes + 1; i++) {
			n = s.nextInt();
			heap[i] = n;
		}
		
		for(int i = 1; i < heap.length; i++) {
			System.out.print("node " + i + ": " + "key = " + heap[i] + ", ");
			
			if(i / 2 != 0) {
				System.out.print("parent key = " + heap[i/2] + ", ");
			}
			
			if( 2 * i  <= heap.length - 1) {
				System.out.print("left key = " + heap[2*i] + ", ");
			}
			if( 2 * i + 1 <= heap.length - 1) {
				System.out.print("right key = " + heap[2*i+1] + ", ");
			}
			
			System.out.println();
		}
		
	}

}
