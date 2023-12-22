import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		treeNode[] tree=new treeNode[n];
		for(int i=0;i<n;i++)tree[i]=new treeNode();
		
		for(int i=0;i<n;i++) {
			int id=Integer.parseInt(in.next()),k=Integer.parseInt(in.next());
			
			int lb=-1;
			for(int j=0;j<k;j++) {
				int c=Integer.parseInt(in.next());
				
				tree[c].p=id;
				if(j==0)tree[id].lc=c;
				else tree[lb].rb=c;
				
				lb=c;
			}
		}
		
		/*for(int i=0;i<n;i++) {
			System.out.println(tree[i].p+" "+tree[i].lc+" "+tree[i].rb);
		}*/
		
		//print
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			out.print("node "+i+": ");
			out.print("parent = "+tree[i].p+", ");
			out.print("depth = "+depth(tree,i)+", ");
			out.print(nodeType(tree,i)+", ");
			out.println(printChildlen(tree,i));
			out.flush();
		}
	}
	
	static int depth(treeNode[] tree,int p) {
		int cnt=0,pos=p;
		
		while(tree[pos].p!=-1) {
			pos=tree[pos].p;
			cnt++;
		}
		
		return cnt;
	}

	static String nodeType(treeNode[] tree,int p) {
		if(tree[p].p==-1)return "root";
		else if(tree[p].lc==-1)return "leaf";
		else return "internal node";
	}
	
	static List<Integer> printChildlen(treeNode[] tree,int p){
		List<Integer> ls=new ArrayList<>();
		int pos=tree[p].lc;
		
		while(pos!=-1) {
			ls.add(pos);
			pos=tree[pos].rb;
		}
		
		return ls;
	}
}

class treeNode{
	int p=-1,lc=-1,rb=-1;//parent leftChildlen rightBrother
}

