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

	public int getDepth(int id){
		int d = 0;
		int u = nodes[id].parent;
		while(u != -1){
			u = nodes[u].parent;
			d++;
		}
		return d;
	}

	public void printChildren(int id){
		int c = nodes[id].left;
		while(c != -1){
			System.out.printf("%d", c);
			c = nodes[c].right;
			if(c != -1)
				System.out.printf("%s ", ",");
		}
	}

	public void printNode(int id){
		System.out.printf("%s %d: ", "node", id);
		System.out.printf("%s %d, ", "parent =", nodes[id].parent);
		System.out.printf("%s %d, ", "depth =", getDepth(id));
		if(nodes[id].parent == -1)
			System.out.printf("%s, ", "root");
		else if(nodes[id].left == -1)
			System.out.printf("%s, ", "leaf");
		else
			System.out.printf("%s, ", "internal node");
		System.out.printf("%s", "[");
		printChildren(id);
		System.out.printf("%s\n", "]");
	}
}

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Nodes mynodes = new Nodes();
		Node[] nodes = new Node[n];
		mynodes.nodes = nodes;
		for(int i = 0; i < n; i++)
			nodes[i] = new Node(i);
		int l = 0;
		for(int i = 0; i < n; i++){
			int id = scan.nextInt();
			int k = scan.nextInt();
			for(int j = 0; j < k; j++){
				int c = scan.nextInt();
				if(j == 0){
					nodes[id].left = c;
				}else
					nodes[l].right = c;
				l = c;
				nodes[c].parent = id;
			}
		}

		for(int j = 0; j < n; j++)
			mynodes.printNode(j);
	}
}