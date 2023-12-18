import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static final Scanner	s	=new Scanner(System.in);

	static int				n, m, q;
	static boolean			checked[];
	static Node				nodes[];

	public static void main(String args[]){
		n=s.nextInt();
		m=s.nextInt();

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

		if(n>3000||m>3000||q>3000)// judge reject
			return;

		int v,d,c;
		for(int i=0;i<q;i++) {
			v=s.nextInt()-1;
			d=s.nextInt();
			c=s.nextInt();

			function(nodes[v],d,c);
		}
		Arrays.stream(nodes).forEach(n->System.out.println(n.color));
	}

	static ArrayDeque<Node> deque=new ArrayDeque<>();
	static Node buf;
	static void function(Node n,int maxDepth,int color) {
		deque.clear();
		Arrays.fill(checked,false);
		int curDepth=0;

		checked[n.no]=true;
		n.color=color;
		deque.add(n);

		while(curDepth<=maxDepth&&!deque.isEmpty()) {
			curDepth++;
			for(int i=deque.size();i>0;i--) {
				n=deque.poll();
				n.color=color;
				for(int j=0;j<n.edge.size();j++) {
					buf=n.edge.get(j);
					if(!checked[buf.no]) {
						checked[buf.no]=true;
						deque.add(buf);
					}
				}
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
