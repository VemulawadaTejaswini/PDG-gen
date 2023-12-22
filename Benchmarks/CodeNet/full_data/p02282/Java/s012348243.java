import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Nodes mynodes = new Nodes(n+1);

		int[] pre = new int[n];
		int[] in = new int[n];

		for(int i = 0; i < n; i++)
			pre[i] = scan.nextInt();
		for(int i = 0; i < n; i++)
			in[i] = scan.nextInt();

		for(int i = 1; i < n; i++){
			for(int j = 0; j < n; j++){
				if(in[j] == pre[i-1]){
					break;
				}else if(in[j] == pre[i]){
					mynodes.setLeft(pre[i-1], pre[i]);
					break;
				}
			}
		}

		for(int i = 1; i < n; i++){
			for(int j = 0; j < n; j++){
				if(pre[j] == in[i-1]){
					mynodes.setRight(in[i-1], mynodes.getRoot(in[i]));
					break;
				}else if(pre[j] == in[i]){
					break;
				}
			}
		}

		int root = mynodes.getRoot(pre[0]);
		mynodes.printPost(root);
		System.out.println();
	}
}

class Node{
	int parent = -1;
	int left = -1;
	int right = -1;
}

class Nodes{

	Node[] nodes;

	public Nodes(int n){
		nodes = new Node[n];
		for(int i = 0; i < n; i++){
			nodes[i] = new Node();
		}
	}

	public int getRoot(int id){
		if(nodes[id].parent == -1)
			return id;
		return getRoot(nodes[id].parent);
	}

	boolean first = true;

	public void printPost(int id){
		if(id == -1)
			return;
		printPost(nodes[id].left);
		printPost(nodes[id].right);
		if(first){
			System.out.print(id);
			first = false;
		}else{
			System.out.print(" " + id);
		}
	}

	public void setLeft(int id, int left){
		nodes[id].left = left;
		nodes[left].parent = id;
	}

	public void setRight(int id, int right){
		nodes[id].right = right;
		nodes[right].parent = id;
	}
}