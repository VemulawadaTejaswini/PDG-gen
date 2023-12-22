import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		Btree tree=new Btree(n);
		
		for(int i=0;i<n;i++) {
			int id=Integer.parseInt(in.next());
			int L=Integer.parseInt(in.next()), R=Integer.parseInt(in.next());
			
			if(L!=-1) {
				tree.T[id].l=L;
				tree.T[L].p=id;
			}
			if(R!=-1) {
				tree.T[id].r=R;
				tree.T[R].p=id;
			}
		}
		
		char odr[]= {'f','m','l'};
		String str[]= {"Preorder","Inorder","Postorder"};
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<3;i++) {
			List<Integer> res=tree.walk(odr[i]);
			out.println(str[i]);
			for(int j=0;j<res.size();j++)out.print(" "+res.get(j));
			out.println();
		}
		out.flush();
	}
}

class BtreeNode{
	int p=-1,l=-1,r=-1;
}

class Btree{
	static BtreeNode T[];	
	static List<Integer> A;
	
	Btree(int n){
		T=new BtreeNode[n];
		for(int i=0;i<n;i++)T[i]=new BtreeNode();
	}
	
	static List<Integer> walk(char o){
		A=new ArrayList<>();
		if(o=='f') fw(0);
		else if(o=='m')mw(0);
		else if(o=='l')lw(0);
		return A;
	}
	
	private static void fw(int i) {
		A.add(i);
		if(T[i].l!=-1)fw(T[i].l);
		if(T[i].r!=-1)fw(T[i].r);
	}
	
	private static void mw(int i) {
		if(T[i].l!=-1)mw(T[i].l);
		A.add(i);
		if(T[i].r!=-1)mw(T[i].r);
	}
	
	private static void lw(int i) {
		if(T[i].l!=-1)lw(T[i].l);
		if(T[i].r!=-1)lw(T[i].r);
		A.add(i);
	}
}
