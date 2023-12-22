import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class Node {
	int id;
	int left;
	int right;

	public Node(int id) {
		this.id = id;
	}

}

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node[] tree = new Node[n];

		for (int i = 0; i < n; i++) {
			tree[i] = new Node(i);
		}

		boolean[] isChild = new boolean[n];
		for (int i = 0; i < n; i++) {
			int nowNum = sc.nextInt();

			Node now = tree[nowNum];
			now.left = sc.nextInt();
			now.right = sc.nextInt();

			if (now.left != -1) isChild[now.left] = true;
			if (now.right != -1) isChild[now.right] = true;
		}

		int root = -1;
		for (int i = 0; i < n; i++) {
			if(!isChild[i]) {
				root = i;
				break;
			}
		}

		sc.close();

		pByPreorder(root, tree);
		pByInorder(root, tree);
		pByPostorder(root, tree);

	}

	private static void pByPostorder(int root, Node[] tree) {
		System.out.println("Postorder");
		porder(root, tree);
		System.out.println();
	}

	private static void porder(int id, Node[] tree) {
		Node now = tree[id];
		if(now.left != -1) porder(now.left, tree);
		if(now.right != -1) porder(now.right, tree);
		System.out.print(" " + id);
	}

	private static void pByInorder(int root, Node[] tree) {
		System.out.println("Inorder");
		inorder(root, tree);
		System.out.println();
	}

	private static void inorder(int id, Node[] tree) {
		Node now = tree[id];
		if(now.left != -1) inorder(now.left, tree);
		System.out.print(" " + id);
		if(now.right != -1) inorder(now.right, tree);
	}

	private static void pByPreorder(int root, Node[] tree) {

		System.out.println("Preorder");

		Deque<Integer> deq = new LinkedList<>();
		deq.push(root);

		while(!deq.isEmpty()) {

			int nowId = deq.pop();
			System.out.print(" " + nowId);

			Node now = tree[nowId];
			if (now.right != -1) deq.push(now.right);
			if (now.left != -1) deq.push(now.left);

		}
		System.out.println();
	}
}