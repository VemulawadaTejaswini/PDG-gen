import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Node T[];
	int root;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T = new Node[n];
		for(int i = 0; i < n; i++) {
			T[i] = new Node(-1);
		}
		for(int i = 0; i < n; i++) {
			int id = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			T[id].left = l;
			T[id].right = r;
			if(l != -1) T[l].parent = id;
			if(r != -1) T[r].parent = id;
		}
		for(int i = 0; i < n; i++) {
			if(T[i].parent == -1) root = i;
		}
		
		//Preorder巡回
		System.out.println("Preorder");
		preParse(root);
		System.out.println();
		
		//Inorder巡回
		System.out.println("Inorder");
		inParse(root);
		System.out.println();
		
		//Postorder巡回
		System.out.println("Postorder");
		postParse(root);
		System.out.println();
		
		sc.close();
	}
	void preParse(int u) {
		if(u == -1) return;
		System.out.print(" " + u);
		preParse(T[u].left);
		preParse(T[u].right);
	}
	
	void inParse(int u) {
		if(u == -1) return;
		inParse(T[u].left);
		System.out.print(" " + u);
		inParse(T[u].right);
	}
	
	void postParse(int u) {
		if(u == -1) return;
		postParse(T[u].left);
		postParse(T[u].right);
		System.out.print(" " + u);
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
class Node {
	int left, right, parent;
	public Node(int parent) {
		this.parent = parent;
	}
}
