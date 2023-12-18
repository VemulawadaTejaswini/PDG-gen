
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static final long INF = 10000000000000000L;
	static int n;
	static List<Node>[] Edge;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		
		Edge = new ArrayList[n];
		
		for(int i = 0 ;i < n ;i++) {
			Edge[i] = new ArrayList<>();
		}
		
		for(int i = 0 ;i < n-1 ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int cost = Integer.parseInt(sc.next());
			
			Edge[a-1].add(new Node(b-1,cost));
			Edge[b-1].add(new Node(a-1,cost));
		}
		
		int q = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		long []d = dijkstra(k-1);
		
		for(int i = 0 ; i < q ;i++) {
			int x = Integer.parseInt(sc.next())-1;
			int y = Integer.parseInt(sc.next())-1;
			
			long ans = d[x] + d[y];
			System.out.println(ans);
		}

	}


static long[] dijkstra(int s){
	
	Queue <Pos> que = new PriorityQueue<Pos>();
	long[]d = new long [n]; //頂点sからの距離
	for(int i = 0 ; i < n ;i++) {
		d[i] = INF;
	}
	BitSet used = new BitSet(n);
	que.add(new Pos(0,s)); //初期値を代入、自身の距離は0
	d[s] = 0 ;				
	
	while(!que.isEmpty()) {
		Pos p = que.poll();		//
		int v = p.getTo();
		if(used.get(p.getTo())) {
			continue;
		}
		used.set(p.getTo());
		for(Node e : Edge[v]) {
			if(d[e.getTo()] > d[v] + e.getCost()) {
				d[e.getTo()] = (long)( d[v] + e.getCost());
				que.add(new Pos(d[e.getTo()],e.getTo()));
			}
		}
	}
	return d;	
}
}

class Pos implements Comparable<Pos>{

private long cost;
private int to;

public Pos (long cost, int to) {
	this.cost = cost;
	this.to = to;
}

public long getCost() {
	return cost;
}

public int getTo() {
	return to;
}

public void setCost(long cost) {
	this.cost = cost;
}

public void setTo(int to) {
	this.to = to;
}

@Override
public int compareTo(Pos o) {
	return Long.compare(cost, o.cost);
}

}
class Node{
private int to;
private int cost;

public Node(int to, int cost) {
	this.to = to;
	this.cost = cost;
}

public int getTo() {
	return to;
}

public int getCost() {
	return cost;
}

public void setTo(int to) {
	this.to = to;
}

public void setCost(int cost) {
	this.cost = cost;
}
}
