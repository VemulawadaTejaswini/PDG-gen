import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		Tree t = new Tree(n);

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			if (s.equals("insert"))
				t.insert(i, scan.nextInt());
			else if (s.equals("find"))
				t.find(scan.nextInt());
			else {
				t.printInorder();
				t.printPreorder();
			}
		}

		scan.close();
		System.exit(0);
	}
}

class Tree {

	private class Node {
		public Node(int _key) {
			key = _key;
		}

		int key;
		int Parent = -1;
		int LeftChild = -1;
		int RightChild = -1;
	}

	Node[] node;
	int root = -1;

	public Tree(int n) {
		node = new Node[n];
	}

	public void find(int key) {
		find(root, key);
	}

	private void find(int x, int key) {
		if (x == -1)
			System.out.println("no");
		else if (node[x].key == key)
			System.out.println("yes");
		else if (key < node[x].key)
			find(node[x].LeftChild, key);
		else
			find(node[x].RightChild, key);
	}

	public void printPreorder() {
		printPre(root);
		System.out.println();
	}

	private void printPre(int id) {
		if (id == -1)
			return;
		System.out.print(" " + node[id].key);
		printPre(node[id].LeftChild);
		printPre(node[id].RightChild);
	}

	public void printInorder() {
		printIn(root);
		System.out.println();
	}

	private void printIn(int id) {
		if (id == -1)
			return;
		printIn(node[id].LeftChild);
		System.out.print(" " + node[id].key);
		printIn(node[id].RightChild);
	}

	public void insert(int i, int key) {
		node[i] = new Node(key);
		insert(i);
	}

	private void insert(int z) {
		int y = -1;
		int x = root;
		while (x != -1) {
			y = x;
			if (node[z].key < node[x].key)
				x = node[x].LeftChild;
			else
				x = node[x].RightChild;
		}
		node[z].Parent = y;

		if (y == -1)
			root = z;
		else if (node[z].key < node[y].key)
			node[y].LeftChild = z;
		else
			node[y].RightChild = z;
	}
}