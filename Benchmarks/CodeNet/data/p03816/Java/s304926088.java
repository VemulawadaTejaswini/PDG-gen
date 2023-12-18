import java.util.*;

class Node {
	private int object;
	public int object() {
		return this.object;
	}
	private Node left;
	public Node left() {
		return this.left;
	}
	private Node right;
	public Node right() {
		return this.right;
	}
	private boolean[] null_check;
	public boolean left_null_check() {
		return this.null_check[0];
	}
	public boolean right_null_check() {
		return this.null_check[1];
	}
	public void left_insert(int object) {
		this.left = (new Node(object));
		this.null_check[0] = false;
	}
	public void right_insert(int object) {
		this.right = (new Node(object));
		this.null_check[1] = false;
	}

	protected Node(int object) {
		this.object = object;
		this.null_check = new boolean[2];
		this.null_check[0] = true;
		this.null_check[1] = true;
	}
}

public class Main {
	private static boolean insert_or_find(Node node, int object) {
		if(object < node.object()) {
			if(node.left_null_check()) {
				node.left_insert(object);
				return false;
			} else
				return insert_or_find(node.left(), object);
		} else if(object > node.object()){
			if(node.right_null_check()) {
				node.right_insert(object);
				return false;
			} else
				return insert_or_find(node.right(), object);
		} else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = new Node(sc.nextInt());
		int identity = 1;
		for(int i = 1; i < n; i++) {
			if(!insert_or_find(root, sc.nextInt()))
				identity++;
		}
		System.out.println(String.valueOf(identity - ((identity + 1)%2)));
	}
}