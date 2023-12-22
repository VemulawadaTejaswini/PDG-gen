import java.util.Scanner;
import java.io.IOException;
class Main {
  	
	static final int NIL = -1;
	static Node[] tree = new Node[100001];
	static int[] D = new int[100001];
	
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i< 100001; i++){
			tree[i] = new Node();
		}
		
		for(int i = 0; i < n; i++){
			tree[i].sibling = NIL;
			tree[i].parent = tree[i].sibling;
			tree[i].child = tree[i].parent;
		}
		
		int degree;
		int v;
		int s;
		int pre = 0;
		for(int i = 0; i < n; i++){
			v = scan.nextInt();
			degree = scan.nextInt();
			
			for(int j = 0; j < degree; j++){
				s = scan.nextInt();
				if(j == 0) tree[v].child = s;
				else tree[pre].sibling = s;
				
				pre = s;
				tree[s].parent = v;
			}
		}
		
		int r = 0;
		
		while(tree[r].parent != NIL){
			r = tree[r].parent;
		}
		depth(r, 0);
		
		for(int i = 0; i < n; i++){
			System.out.print("node " + i + ": parent = " + tree[i].parent + ", depth = " + D[i] + ",");
			if(tree[i].parent == NIL) System.out.print(" root, [");
			else if(tree[i].child == NIL) System.out.print(" leaf, [");
			else System.out.print(" internal node, [");
			
			r = tree[i].child;
			if(tree[i].child != NIL) System.out.print(tree[i].child);
			if(r < 0){
				
			}else{
				while(tree[r].sibling != NIL && tree[i].child != NIL){
					System.out.print(", " + tree[r].sibling);
					r = tree[r].sibling;
				}
			}
			System.out.println("]");
		}
		
		return;
	}
	
	public static void depth(int u, int p){
		D[u] = p;
		if(tree[u].sibling != NIL) depth(tree[u].sibling, p);
		if(tree[u].child != NIL) depth(tree[u].child, ++p);
	}
}

class Node{
	int parent;
	int child;
	int sibling;
}