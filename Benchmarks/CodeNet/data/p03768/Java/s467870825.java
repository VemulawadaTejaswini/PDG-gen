import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A{

	static final Scanner	s	=new Scanner(System.in);

	static int				n, m, q;
	static boolean			checked[];
	static Node				nodes[];

	public static void main(String args[]){
		n=s.nextInt();
		m=s.nextInt();
		if(n>2000||m>2000||q>2000)// judge reject
			return;

		checked=new boolean[n];

		nodes=new Node[n];
		for(int i=0; i<n; i++)
			nodes[i]=new Node(i);
		int bufa, bufb;
		for(int i=0; i<m; i++){
			bufa=s.nextInt()-1;
			bufb=s.nextInt()-1;
			nodes[bufa].edge.add(nodes[bufb]);
			nodes[bufb].edge.add(nodes[bufa]);
		}

		q=s.nextInt();

		int v,d,c;
		for(int i=0;i<q;i++) {
			v=s.nextInt()-1;
			d=s.nextInt();
			c=s.nextInt();

			Arrays.fill(checked,false);
			checked[v]=true;
			function(nodes[v],0,d,c);
		}
		Arrays.stream(nodes).forEach(n->System.out.println(n.color));
	}

	static Node buf;
	static void function(Node n,int curDepth,int maxDepth,int color) {
		n.color=color;
		if(curDepth==maxDepth)
			return;
		for(int i=0;i<n.edge.size();i++) {
			buf=n.edge.get(i);
			if(!checked[buf.no]) {
				checked[buf.no]=true;
				function(buf,curDepth+1,maxDepth,color);
			}
		}
	}
}

class Node{

	int				no, color=0;
	ArrayList<Node>	edge=new ArrayList<>();

	Node(int no){
		this.no=no;
	}
}
