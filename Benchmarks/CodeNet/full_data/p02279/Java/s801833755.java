
import java.io.*;
import java.util.*;

public class Main {
	
	static int depth[];
	static Node tree[];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		tree=new Node[n];
		
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
		
		//setDepth(r,0);
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			out.print("node "+i+": parent = "+tree[i].parent+", depth = "+getDepth(i)+", "+getType(i)+", ");
			out.println(getChildren(i));
		}
		out.flush();
	}
	
	static int getDepth(int i) {
		int d=0;
		while(tree[i].parent!=-1) {
			d++;
			i=tree[i].parent;
		}
		return d;
	}
	
	static void setDepth(int p, int d) {
		depth[p]=d;
		if(tree[p].left!=-1)setDepth(tree[p].left,d+1);
		if(tree[p].right!=-1)setDepth(tree[p].right,d);
	}
	
	static String getType(int i) {
		if(tree[i].parent==-1)return "root";
		else if(tree[i].left==-1) return "leaf";
		else return "internal node";
	}
	
	static List<Integer> getChildren(int i){
		List<Integer> clist=new ArrayList<>();
		i=tree[i].left;
		while(i!=-1) {
			clist.add(i);
			i=tree[i].right;
		}
		return clist;
	}

}

class Node{
	int parent=-1,left=-1,right=-1;
}
