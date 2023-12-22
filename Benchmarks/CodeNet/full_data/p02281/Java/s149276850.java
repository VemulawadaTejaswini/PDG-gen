import java.util.Scanner;
import java.util.Arrays;

class Main {
	static StringBuilder sb = new StringBuilder("");
	
	public static void main(String args[]) {
		run();
	}
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		Node[] nodes = new Node[num];
		boolean[] child = new boolean[num];
		Arrays.fill(child, true);
		
		//要素ごとの親と子の関係構築
		for(int i = 0; i < num; i ++ ){
			int id = scanner.nextInt();
			int left = scanner.nextInt();
			int right = scanner.nextInt();
			if (left != -1){
				child[left] = false;
			}
			if (right != -1){
				child[right] = false;
			}
			nodes[id] = new Node(id, left, right);
		}
		int root = 0;
		for (int i = 0; i < num; i++) {
			if (child[i]) {
				root = i;
			}
		}		
		
		output(nodes,root);//出力関数
		
		scanner.close();
	}
	
	public static void output(Node[] nodes , int root){
	   	//出力
		sb.append("Preorder\n");
		preParse(nodes, root);
 
		sb.append("\nInorder\n");
		inParse(nodes, root);
 
		sb.append("\nPostorder\n");
		postParse(nodes, root);
		System.out.println(sb);
	}
	//先行巡回
	public static void preParse(Node[] nodes, int root) {
		if (root == -1) return;
		
		sb.append(" ").append(root);
		preParse(nodes, nodes[root].left);
		preParse(nodes, nodes[root].right);
	}
	//中間巡回
	public static void inParse(Node[] nodes, int root) {
		if (root == -1) return;
		
		inParse(nodes, nodes[root].left);
		sb.append(" ").append(root);
		inParse(nodes, nodes[root].right);
	}
	//後行巡回
	public static void postParse(Node[] nodes, int root) {
		if (root == -1) return;
 
		postParse(nodes, nodes[root].left);
		postParse(nodes, nodes[root].right);
		sb.append(" ").append(root);
	}
}
class Node{
	public int id;
	public int parent;
	public int left;
	public int right;
	
	public Node(int id, int left, int right) {
		this.id = id;
		this.left = left;
		this.right = right;
	}
	
}

