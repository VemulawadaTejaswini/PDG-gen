
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m;
	LinkedList<E>[] edges;
	boolean[] f;
	
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt(); m = sc.nextInt();
			int l = sc.nextInt(), k = sc.nextInt(), from = sc.nextInt(), to = sc.nextInt();
			if( (n|m|l|k|from|to) == 0 ) break;
			f = new boolean[n]; edges = new LinkedList[n];
			for(int i=0;i<n;i++) edges[i] = new LinkedList<E>();
			for(int i=0;i<l;i++) f[sc.nextInt()] = true;
			
			for(int i=0;i<k;i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				edges[a].add(new E(b, c));
				edges[b].add(new E(a, c));
			}
			
			int t = dijkstra(from, to);
			System.out.println((t>=0? t: "Help!"));
		}
	}
	
	int dijkstra(int from, int to) {
		int[][] cost = new int[n][m+1];
		for(int[] a: cost) fill(a, INF);
		cost[from][m] = 0;
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		que.add(new Node(from, m, 0));
		for(;!que.isEmpty();) {
			Node now = que.poll();
			if(now.v == to) return now.t;
			if(cost[now.v][now.m] != now.t) continue;
			for(E edge: edges[now.v]) for(int i=0;i<(f[now.v]? m-now.m+1:1);i++) {
				if( now.m+i-edge.c >= 0 && cost[edge.t][now.m+i-edge.c] > now.t + i + edge.c ) {
					debug(edge.t, m, m+i-edge.c, cost[edge.t][now.m+i-edge.c], now.t + i + edge.c);
					cost[edge.t][now.m+i-edge.c] = now.t + i + edge.c;
					que.add(new Node(edge.t, now.m+i-edge.c, now.t+i+edge.c));
				}
			}
		}
		
		return -1;
	}
	
	class Node implements Comparable<Node> {
		int t, m, v;
		Node(int v, int m, int t) {
			this.v = v;
			this.m = m;
			this.t = t;
		}
		@Override
		public int compareTo(Node o) {
			// TODO 自動生成されたメソッド・スタブ
			return t - o.t;
		}
	}
	
	class E {
		int t, c;
		E(int t, int c) {
			this.t = t;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}