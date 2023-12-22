import java.util.*;
public class Main {
    
    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    List<List<Node>> ls=new ArrayList<>();
	    
	    for(int i=0;i<n;i++)ls.add(new ArrayList<Node>());
	    for(int i=0;i<n;i++) {
		int u=Integer.parseInt(in.next()),k=Integer.parseInt(in.next());
		for(int j=0;j<k;j++) {
		    int v=Integer.parseInt(in.next()),
			c=Integer.parseInt(in.next());
		    ls.get(u).add(new Node(v,c));
		}
	    }
	    
	    int visit[]=new int[n],parent[]=new int[n],d[]=new int[n];
	    for(int i=0;i<n;i++) {
		parent[i]=-1; d[i]=Integer.MAX_VALUE;
	    }
	    d[0]=0;
		
	    while(true) {
		int u=-1,min=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
		    if(visit[i]<2 && d[i]<min) {
			min=d[i];
			u=i;
		    }
		}
		
		if(u==-1)break;
		visit[u]=2;
		
		for(int i=0;i<ls.get(u).size();i++) {
		    Node v=ls.get(u).get(i);
		    if(visit[v.v]<2 && d[u]+v.c<d[v.v]) {
			d[v.v]=d[u]+v.c;
			parent[v.v]=u;
			visit[v.v]=1;
		    }
		}
	    }
	    
	    for(int i=0;i<n;i++)System.out.println(i+" "+d[i]);
    }
    
}

class Node{
    int v,c;
    Node(int a,int b){
	v=a;
	c=b;
    }
}
