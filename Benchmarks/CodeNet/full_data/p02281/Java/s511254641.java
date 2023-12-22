import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] a = new Node[n];
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			a[id] = new Node();
			a[id].id = id;
			a[id].l = sc.nextInt();
			a[id].r = sc.nextInt();

		}
		System.out.println("Preorder");
		preorder(a, 0, a[0].l, a[0].r);
		System.out.println();

		System.out.println("Inorder");
		inorder(a, 0, a[0].l, a[0].r);
		System.out.println();

		System.out.println("Postorder");
		postorder(a, 0, a[0].l, a[0].r);
		System.out.println();


	}

	static void preorder(Node a[], int id, int l, int r) {
		System.out.print(" " + id);
		if (l != -1) preorder(a, a[l].id, a[l].l, a[l].r);
		if (r != -1) preorder(a, a[r].id, a[r].l, a[r].r);
	}

	static void inorder(Node a[], int id, int l, int r) {
		if (l != -1) inorder(a, a[l].id, a[l].l, a[l].r);
		System.out.print(" " + id);
		if (r != -1) inorder(a, a[r].id, a[r].l, a[r].r);
	}

	static void postorder(Node a[], int id, int l, int r) {
		if (l != -1) postorder(a, a[l].id, a[l].l, a[l].r);
		if (r != -1) postorder(a, a[r].id, a[r].l, a[r].r);
		System.out.print(" " + id);
	}
}


class Node {
	int id;
	int l;
	int r;
}