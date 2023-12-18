import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static long[][] d;
	static int[]r;
	static long ans = 100000000000000l;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		r = new int[R];
		for(int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
		}
		int[] A = new int[M];
		int[] B = new int[M];
		long[] C = new long[M];
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextLong();
		}
		sc.close();
		d = new long[R][N];
		for(int i = 0; i < R; i++) {
			d[i] = dijkstra(N, r[i], A, B, C, true);
		}
		long min = 100000000000000l;
		List<Data> list = new ArrayList<Data>();
		for(int i = 0; i < R; i++) {
			list.add(new Data(i, r[i]));
		}
		for(int i = 0; i < r.length; i++) {
			Data v = list.get(i);
			list.remove(i);
			List<Data> list1 = new ArrayList<Data>();
			for(Data j : list) {
				list1.add(j);
			}
			rec(v, list1, 0);
			list.add(i, v);
		}
//		for(int i = 0; i < R; i++) {
//			for(long t : d[i]) {
//				System.out.print(t + " ");
//			}
//			System.out.println();
//		}
		System.out.println(ans);
	}
	static class Data{
		int id, r;
		public Data(int id, int r) {
			this.id = id;
			this.r = r;
		}
	}
	public static void rec(Data v, List<Data> list, long k) {
		if(list.size() == 0) {
			ans = Math.min(ans, k);
		}else {
			int idx = 0;
			Data next = new Data(0, 0);
			long min = 100000000000000l;
			for(int i = 0; i < list.size(); i++) {
				int u = list.get(i).r;
				if(d[v.id][u] < min) {
					idx = i;
					min = d[v.id][u];
					next = list.get(i);
				}
			}
			list.remove(idx);
			k += min;
			rec(next, list, k);
		}
	}
	/**
	 * ダイクストラ法 (優先度付きキュー)
	 * @param N 頂点数 (0 ~ N-1)
	 * @param t 始点
	 * @param from, to 辺
	 * @param cost 辺のコスト
	 * @param flag true なら無向辺、 false なら有向辺
	 * @return d t から各頂点への最短距離
	 */
	public static long[] dijkstra(int N, int t, int[] from, int[] to, long[] cost, boolean flag) {
		final int WHITE = 0;
	    final int GRAY = 1;
	    final int BLACK = 2;
	    final long INF = 100000000000000l;
		long[] d = new long[N];
		int[] color = new int[N];
		@SuppressWarnings("unchecked")
		ArrayList<Node>[] adj = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			d[i] = INF;
			color[i] = WHITE;
			adj[i] = new ArrayList<Node>();
		}
		int E = from.length;
		for(int i = 0; i < E; i++) {
			adj[from[i]].add(new Node(to[i], cost[i]));
			if(flag)adj[to[i]].add(new Node(from[i], cost[i]));

		}
		Queue<Node> pq = new PriorityQueue<Node>(new MyComparator());
		d[t] = 0;
		pq.add(new Node(t, 0l));
		while(!pq.isEmpty()) {
			Node f = pq.poll();
			int u = f.id;
			color[u] = BLACK;
			if(d[u] < f.cost) continue;
			for(int j = 0; j < adj[u].size(); j++) {
				int v = adj[u].get(j).id;
				if(color[v] == BLACK) continue;
				d[v] = d[u] + adj[u].get(j).cost;
				pq.add(new Node(v, d[v]));
				color[v] = GRAY;
			}
		}
		return d;
	}
	static class Node{
		int id;
		long cost;
		public Node(int id, long cost) {
			this.id = id;
			this.cost = cost;
		}
	}
	static class MyComparator implements Comparator<Node>{
		@Override
        public int compare(Node v1, Node v2) {
			if(v1.cost < v2.cost) {
				return -1;
			}else if(v1.cost == v2.cost) {
				return 0;
			}else {
				return 1;
			}
		}
	}
}