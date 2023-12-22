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
			int id = scan.nextInt();
			int k = scan.nextInt();
			int pc = -1;
			for (int j = 0; j < k; j++) {
				int c = scan.nextInt();
				if (j == 0)
					t.setChild(id, c);
				else
					t.setRightSib(pc, c);
				t.setPar(c, id);
				pc = c;
			}
		}

		for (int i = 0; i < n; i++)
			t.printR(i);

		scan.close();
		System.exit(0);
	}
}

class Tree {
	private class Node {
		int Parent = -1;
		int LeftChild = -1;
		int RightSib = -1;

		public int getDepth() {
			if (Parent == -1)
				return 0;
			else
				return (node[Parent].getDepth() + 1);
		}

		public String getType() {
			if (Parent == -1)
				return "root";
			else if (LeftChild == -1)
				return "leaf";
			else
				return "internal node";
		}
	}

	private Node[] node;

	public Tree(int n) {
		node = new Node[n];
		for (int i = 0; i < n; i++) {
			node[i] = new Node();
		}
	}

	public void printR(int id) {
		System.out.print("node " + id + ": parent = " + node[id].Parent + ", depth = " + node[id].getDepth() + ", "
				+ node[id].getType() + ", [");
		if (node[id].LeftChild != -1) {
			System.out.print(node[id].LeftChild);
			for (int c = node[node[id].LeftChild].RightSib; c != -1; c = node[c].RightSib)
				System.out.print(", " + c);
		}
		System.out.println("]");
	}

	public void setChild(int id, int c) {
		node[id].LeftChild = c;
	}

	public void setRightSib(int id, int sib) {
		node[id].RightSib = sib;
	}

	public void setPar(int id, int par) {
		node[id].Parent = par;
	}

}