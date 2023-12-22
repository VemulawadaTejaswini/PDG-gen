import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// ALDS1_7_C
public class Main {
	List<Integer> treeSearch(Node[] A, int root, String str) {
		Node[] copyA = A.clone();
		for (int i = 0; i < copyA.length; i++) {
			copyA[i] = new Node(A[i].number);
			copyA[i].left = A[i].left;
			copyA[i].right = A[i].right;
			copyA[i].parent = A[i].parent;
		}
		List<Integer> list = new ArrayList<Integer>();
		int i = root;
		boolean[] check = new boolean[copyA.length];
		Arrays.fill(check, true);
		while (i > -1) {
			switch(str) {
			case "preorder":
				if (check[i]) {
					list.add(copyA[i].number);
					check[i] = false;
				}
				break;
			case "inorder":
				if (copyA[i].left == -1 && check[i]) {
					list.add(copyA[i].number);
					check[i] = false;
				}
				break;
			case "postorder":
				if (copyA[i].left == -1 && copyA[i].right == -1 && check[i]) {
					list.add(copyA[i].number);
					check[i] = false;
				}
				break;
			}
			if (copyA[i].left != -1) i = copyA[i].left;
			else if (copyA[i].right != -1) i = copyA[i].right;
			else {
				if (copyA[i].parent != -1) {
					if (copyA[copyA[i].parent].left == i) copyA[copyA[i].parent].left = -1;
					else if (copyA[copyA[i].parent].right == i) copyA[copyA[i].parent].right = -1;
				}
				i = copyA[i].parent;
			}
		}
		return list;
	}
	
	void printList(List<Integer> list, String str) {
		StringBuilder build = new StringBuilder();
		build.append(str + "\n");
		for (Integer n : list) {
			build.append(" " + n);
		}
		build.append("\n");
		System.out.print(build);
	}
	
	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] tree = new Node[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new Node(i);
		}
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			int left = sc.nextInt();
			int right = sc.nextInt();
			tree[number].left = left;
			tree[number].right = right;
			if (left != -1 && right != -1) {
				tree[left].parent = number;
				tree[right].parent = number;
			} else if (left != -1 || right != -1) {
				if (left != -1) tree[left].parent = number;
				if (right != -1) tree[right].parent = number;
			}
		}
		// search root
		int root = 0;
		for (int i = 0; i < tree.length; i++) {
			if (tree[i].parent == -1) {
				root = i;
			}
		}
		printList(treeSearch(tree, root, "preorder"), "Preorder");
		printList(treeSearch(tree, root, "inorder"), "Inorder");
		printList(treeSearch(tree, root, "postorder"), "Postorder");
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

class Node {
	int number;
	int parent = -1;
	int left;
	int right;
	Node(int number) {
		this.number = number;
	}
}
