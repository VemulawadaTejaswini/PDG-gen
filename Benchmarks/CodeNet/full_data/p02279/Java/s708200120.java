import java.util.Scanner;

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
		while(c!=-1){
			System.out.print(c);
			c = nodes[c].right;
			if(c!=-1) System.out.print(", ");
		}
	}
	public void printNode(int id){
		System.out.print("node " + id + ": ");
		System.out.print("parent = " + nodes[id].parent + ", ");
		System.out.print("depth = " + getDepth(id) + ", ");
		if(nodes[id].parent == -1)
			System.out.print("root, ");
		else if(nodes[id].left == -1)
			System.out.print("leef, ");
		else
			System.out.print("internal node, ");
		System.out.print("[");
		printChildren(id);
		System.out.println("]");
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Nodes mynodes = new Nodes();
		Node[] nodes = new Node[n];
		mynodes.nodes = nodes;
		for(int i = 0;i<n;i++){
			nodes[i] = new Node(i);
		}
		int l = 0;
		for(int i=0;i<n;i++){
			int id = in.nextInt();
			int k = in.nextInt();
			for(int j=0;j<k;j++){
				int c = in.nextInt();
				if(j==0){
					nodes[id].left = c;
					l = c;
				}
				//????????????????????????
				else nodes[l].right = c;
				l = c;
				nodes[c].parent = id;
			}
		}
		for(int j=0;j<n;j++){
			mynodes.printNode(j);
		}
	}
}