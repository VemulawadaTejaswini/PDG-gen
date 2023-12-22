import java.util.*;
class TreeNode{
	int l,r;
	int p;
	public TreeNode(){
		l = -1;
		r = -1;
		p =-1;
	}
}

public class Main {
	static int  MAX=10000;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeNode[] T= new TreeNode[MAX];
		for(int i=0;i<n;i++){
			T[i] = new TreeNode();
		}
		for(int i=0;i<n;i++){
			int v,l,r;
			v = sc.nextInt();
			l = sc.nextInt();
			r = sc.nextInt();
			T[v].l =l;
			T[v].r = r;
			if(T[v].l!=-1) T[l].p= v;
			if(T[v].r!=-1) T[r].p= v;
		}
		int root=0;
		for(int i=0;i<n;i++) if(T[i].p==-1) root=i;
		System.out.println("Preorder");
		preOrder(T,root);
		System.out.println();
		System.out.println("Inorder");
		inOrder(T,root);
		System.out.println();
		System.out.println("Postorder");
		postOrder(T,root);
		
	}
	public static void preOrder(TreeNode[] T,int u){
		if(u==-1) return;
		System.out.print(" "+u);
		preOrder(T,T[u].l);
		preOrder(T,T[u].r);
	}
	public static void	inOrder(TreeNode[] T,int u){
		if(u==-1) return;
		inOrder(T,T[u].l);
		System.out.print(" "+u);
		inOrder(T,T[u].r);
	}
	public static void	postOrder(TreeNode[] T,int u){
		if(u==-1) return;
		postOrder(T,T[u].l);
		postOrder(T,T[u].r);
		System.out.print(" "+u);
	}
}