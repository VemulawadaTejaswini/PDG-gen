import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N,M;
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		Node V[] = new Node[N];
		for(int i=0;i<N;i++) {
			V[i] = new Node(i);
		}
		
		for(int i=0;i<M;i++) {
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			V[u-1].connect(V[v-1],w);
		}

		Node ins[] = new Node[N];
		HashSet<Pair<Node,Node>> edge = new HashSet();

		for(int i=0;i<N;i++) {

			for(int a=0;a<N;a++) {
				ins[a] =  V[a].clone();
			}

			//initialize Queue
			PriorityQueue<Node> pq = new PriorityQueue<>(new MyComparator());
			//select start point
			ins[i].reload_dist(0);
			pq.add(ins[i]);
			while(pq.size()>0) {
				Node current = pq.poll();
				if(current.prev != null) {
					edge.add(new Pair<Node, Node>(current,current.prev));
				}
				for(Node key : current.child.keySet()) {
					if(!key.visited) {
						pq.add(key);
						key.reload_dist(current.d+current.child.get(key));
						key.reload_prev(current);
						key.visit();
					}
					else if(current.d+current.child.get(key)<key.d) {
						key.reload_dist(current.d+current.child.get(key));
						key.reload_prev(current);
					}

				}
			}

		}
		out.println(M-edge.size());


		out.flush();
	}





}

class Node{
	int id;
	double d;
	boolean visited = false;
	Node prev = null;
	//TreeMap<Key,Value> means edges. Key is the node which is next to this,and Value is weigth of edge.
	public HashMap<Node,Integer> child = new HashMap<>();
	public Node(int id) {
		this.id = id;
		this.d = Integer.MAX_VALUE;
		this.visited = false;
	}

	public void connect(Node v,int w) {
		child.put(v,w);
	}

	public void visit() {
		this.visited = true;
	}

	public void reload_dist(double dist) {
		this.d = dist;
	}

	public void reload_prev(Node v) {
		this.prev = v;
	}

	@Override public Node clone() {
		return new Node(this.id);
	}
}

class MyComparator implements Comparator<Node>{
	@Override public int compare(Node u,Node v) {

		int num1 = u.id;
		int num2 = v.id;
		if(num1 > num2) {
			return 1;
		}
		else if(num1 < num2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

class Pair<A, B> {
	public final A car;
	public final B cdr;
	public Pair(A car_, B cdr_) {car = car_; cdr = cdr_;}

	private static boolean eq(Object o1, Object o2) {return o1 == null ? o2 == null : o1.equals(o2);}
	private static int hc(Object o) {return o == null ? 0 : o.hashCode();}

	@Override public boolean equals(Object o) {
		if (! (o instanceof Pair)) return false;
		Pair<?, ?> rhs = (Pair<?, ?>) o;
		return eq(car, rhs.car) && eq(cdr, rhs.cdr);
	}
	@Override public int hashCode() {return hc(car) ^ hc(cdr);}
}