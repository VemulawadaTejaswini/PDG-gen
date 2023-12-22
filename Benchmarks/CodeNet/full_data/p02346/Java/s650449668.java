import java.util.Scanner;

class Node{
	int Hcover;
	int Lcover; 
	int min;
	Node parent;
	Node left;
	Node right;
	public Node(){
		parent=null;
		left=null;
		right=null;
	}
	
	public Node(int l,int h,int m){
		Hcover=h;
		Lcover=l;
		min=m;
		parent=null;
		left=null;
		right=null;
	}

	public boolean between(int a){
		return (Lcover<=a)&&(a<=Hcover);
	}
}

public class Main {
	static Node table[]=new Node[100001];

	public static Node cousei(Node n,int l,int h,int m){
		Node mob=new Node(l,h,m);
		mob.parent=n;
		if(h>l){
			mob.left=cousei(mob,l, (h+l)/2, m);
			mob.right=cousei(mob,(h+l)/2+1, h, m);
		}
		if(h==l) table[h]=mob;
		return mob;
	}

	public static int find(Node n,int l,int h){
		//System.out.println("f:"+n.Lcover+"to"+n.Hcover+":"+n.min+"::"+l+"to"+h);
		if(n.Lcover==l&&n.Hcover==h)return n.min;

		if(n.left.between(l)&&n.left.between(h)){
			return find(n.left, l, h);
		}else if(n.right.between(l)&&n.right.between(h)){
			return find(n.right, l, h);
		}else{
			return find(n.left, l, n.left.Hcover)+find(n.right, n.right.Lcover,h);
		}
	}

	public static void update(Node n,int p,int x,int bef){
		//int i=0;
		for(Node it=n;it!=null;it=it.parent){
			//i++;
			//System.out.println(i+"??????");
				it.min=it.left.min+it.right.min;
		}
	}

	public static void main(String[] args) {
		Node root=new Node();
		int n;
		int q;
		Scanner stdin=new Scanner(System.in);
		n=stdin.nextInt();
		q=stdin.nextInt();
		root.min=0;
		root.Hcover=n;
		root.Lcover=1;
		root.parent=null;
		root.left=cousei(root,1,(n+1)/2,root.min);
		root.right=cousei(root,(n+1)/2+1,n,root.min);
		for(int XXX=0;XXX<q;XXX++){
			int com=stdin.nextInt();
			int x=stdin.nextInt();
			int y=stdin.nextInt();
			if(com==0){
				// update
				int m=table[x].min;
				table[x].min+=y;
				update(table[x].parent, x, y,m);
				//prin(root);
			}else{
				// find
				System.out.println(find(root, x, y));
			}
		}
		stdin.close();
	}

}