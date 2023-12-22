import java.io.*;
import java.util.*;

public class Main {
	
	static int depth[];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		Node tree[]=new Node[n];
		
		for(int i=0;i<n;i++) tree[i]=new Node();
		for(int i=0;i<n;i++) {
			int id=Integer.parseInt(in.next()),k=Integer.parseInt(in.next());
			
			int l=-1;
			for(int j=0;j<k;j++) {
				int c=Integer.parseInt(in.next());
				
				tree[c].parent=id;
				if(j==0) tree[id].left=c; //最も左
				if(l>-1)tree[l].right=c; //右兄弟
				
				l=c;
			}
		}
		
		depth=new int[n];
		
		//getroot
		int r=0;
		while(tree[r].parent!=-1)r++;
		setDepth(tree,r,0);
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			out.print("node "+i+": parent = "+tree[i].parent+", depth = "+depth[i]+", "+getType(tree,i)+", ");
			out.println(getChildren(tree,i));
		}
		out.flush();
	}
	
	static void setDepth(Node T[],int p, int d) {
		depth[p]=d;
		if(T[p].left!=-1)setDepth(T,T[p].left,d+1);
		if(T[p].right!=-1)setDepth(T,T[p].right,d);
	}
	
	static String getType(Node T[],int i) {
		if(T[i].parent==-1)return "root";
		else if(T[i].left==-1) return "leaf";
		else return "internal node";
	}
	
	static List<Integer> getChildren(Node T[],int i){
		List<Integer> clist=new ArrayList<>();
		i=T[i].left;
		while(i!=-1) {
			clist.add(i);
			i=T[i].right;
		}
		return clist;
	}

}

class Node{
	int parent=-1,left=-1,right=-1;
}
