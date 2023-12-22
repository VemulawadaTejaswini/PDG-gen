import java.util.*;

class Node{
	int id;
	int parent, left, right;
	public Node(int id){
		this.id = id;
		this.parent = -1;
		this.left = -1;
		this.right = -1;
	}
}

class Nodes{

	Node[] nodes;

	public void printPre(int id){
		if(id == -1)
			return;
		System.out.print(" " + id);
		printPre(nodes[id].left);
		printPre(nodes[id].right);
	}

	public void printIn(int id){
		if(id == -1)
			return;
		printIn(nodes[id].left);
		System.out.print(" " + id);
		printIn(nodes[id].right);
	}

	public void printPost(int id){
		if(id == -1)
			return;
		printPost(nodes[id].left);
		printPost(nodes[id].right);
		System.out.print(" " + id);
	}
}

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node[] nodes = new Node[n];
		Nodes mynodes = new Nodes();
		mynodes.nodes = nodes;
		for(int i = 0; i < n; i++)
			nodes[i] = new Node(i);
		for(int i = 0; i < n; i++){
			int id = scan.nextInt();
			int left = scan.nextInt();
			int right = scan.nextInt();
			if(left != -1){
				nodes[id].left = left;
				nodes[left].parent = id;
			}
			if(right != -1){
				nodes[id].right = right;
				nodes[right].parent = id;
			}
		}

		int root = 0;
		while(nodes[root].parent != -1)
			root = nodes[root].parent;

		System.out.print("Preorder\n");
		mynodes.printPre(root);
		System.out.print("\nInorder\n");
		mynodes.printIn(root);
		System.out.print("\nPostorder\n");
		mynodes.printPost(root);
		System.out.println();
	}
}