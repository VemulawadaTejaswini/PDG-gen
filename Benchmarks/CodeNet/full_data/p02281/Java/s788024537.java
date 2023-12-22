import java.util.*;

class TwoNode{
	int p;
	int l,r;
	TwoNode(){
		p = -1;
		l = r = -1;
	}
}

public class Main {
	Scanner sc = new Scanner(System.in);
	TwoNode[] T;
	int n;
	int id, left, right;
	int root;
	
	public void input() {
		n = sc.nextInt();
		T = new TwoNode[n];
		for(int i=0; i<n; i++) { T[i] = new TwoNode(); }
	}
	
	public void solve() {
		for(int i=0; i<n; i++) {
			id = sc.nextInt();
			left = sc.nextInt();
			right = sc.nextInt();
			if(left != -1) {T[left].p = id;}
			if(right != -1) {T[right].p = id;}
			T[id].l = left;
			T[id].r = right;
		}
	}
	
	public void output() {
		for(int i=0; i<n; i++) { if(T[i].p == -1) root = i; }
		System.out.println("Preorder");
		preOutput(root);
		System.out.println("\nInorder");
		inOutput(root);
		System.out.println("\nPostorder");
		postOutput(root);
		System.out.println();
	}
	
	public void preOutput(int u) {
		if(u == -1) {
			return;
		}else {
			System.out.print(" "+u);
			preOutput(T[u].l);
			preOutput(T[u].r);
		}
	}
	
	public void inOutput(int u) {
		if(u == -1) {
			return;
		}else {
			inOutput(T[u].l);
			System.out.print(" "+u);
			inOutput(T[u].r);
		}
	}
	
	public void postOutput(int u) {
		if(u == -1) {
			return;
		}else {
			postOutput(T[u].l);
			postOutput(T[u].r);
			System.out.print(" "+u);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.solve();
		obj.output();
	}
}

