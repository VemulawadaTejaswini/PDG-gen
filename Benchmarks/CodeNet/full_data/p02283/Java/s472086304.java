import java.util.Scanner;

class Node {
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
	this.key = key;
    }
}

class Tree {
    public Node root;

    public void insert(int key) {	
	Node current = null;
	Node next = root;
	while (next != null) {
	    current = next;
	    if (key < next.key) {
		next = next.left;
	    } else {
		next = next.right;
	    }
	}
	
	if (current == null) {
	    root = new Node(key);
	} else if (key < current.key) {
	    current.left = new Node(key);
	} else {
	    current.right = new Node(key);
	}
    }
    private void inorderWalk(Node node) {
	if (node != null) {
	    inorderWalk(node.left);
	    System.out.print(" " + node.key);
	    inorderWalk(node.right);
	}
    }
    public void inorderWalk() {
	inorderWalk(root);
	System.out.println();
    }
    private void preorderWalk(Node node) {
	if (node != null) {
	    System.out.print(" " + node.key);
	    preorderWalk(node.left);
	    preorderWalk(node.right);
	}
    }
    public void preorderWalk() {
	preorderWalk(root);
	System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
	Tree tree = new Tree();

	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();

	for (int i = 0; i < n; i++) {
	    String command = scanner.next();

	    if (command.equals("insert")) {
		int key = scanner.nextInt();
		tree.insert(key);
	    } else {
		tree.inorderWalk();
		tree.preorderWalk();
	    }
	}
    }
}