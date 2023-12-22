import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0) return;
			int[] c = new int[m];
			for(int i=0; i<m; i++){
				c[i] = in.nextInt();
			}
			int[] x = new int[n];
			for(int i=0; i<n; i++){
				x[i] = in.nextInt();
			}
			Queue<Node> qu = new PriorityQueue<Node>();
			BitSet used = new BitSet(n*600);
			qu.add(new Node(0, 128, 0));
//			int bestX = 0;
//			long bestCost = 1L<<60; 
			while(!qu.isEmpty()){
				Node nd = qu.poll();
				if(used.get(nd.id)) continue;
				if(nd.x == n){
					System.out.println(nd.cost);
					break;
				}
//				if(nd.x > bestX){
//					bestX = nd.x;
//					bestCost = nd.cost;
//				}else if(nd.x == bestX){
//					bestCost = Math.min(bestCost, nd.cost);
//				}
				used.set(nd.id);
				for(int i=0; i<m; i++){
					int nh = nd.h + c[i];
					if(nh > 255) nh = 255;
					else if(nh < 0) nh = 0;
					qu.add(new Node(nd.x+1, nh, nd.cost + sq(x[nd.x]-nh)));
				}
			}
		}
	}
	
	public static int sq(int a){
		return a*a;
	}
}

class Node implements Comparable<Node>{
	int x;
	int id;
	int h;
	long cost;
	public Node(int x, int h, long cost) {
		this.x = x;
		this.h = h;
		id = x*256+h;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		long sign = cost - o.cost;
		// AOJ??§compare???????????????????????§??????
//		return Long.compare(cost, o.cost);
		return sign < 0 ? -1 : sign == 0 ? 0 : 1;
	}
}