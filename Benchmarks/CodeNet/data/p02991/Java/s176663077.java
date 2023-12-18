import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class State implements Comparable<State>{
	int v, cost;
	public State(int V, int c) {
		v = V; cost = c;
	}
	public int compareTo(State s) {
		return cost - s.cost;
	}
}

class Edge implements Comparable<Edge>{
	int s, t, w;
	public Edge(int S, int T, int W) {
		s = S; t = T; w = W;
	}
	public int compareTo(Edge e) {
		return w - e.w;
	}
}

class Main{
	static int INF = Integer.MAX_VALUE/2; // INF 問題により変えよう
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		LinkedList<Edge>[] edges = new LinkedList[N];
		for(int i = 0; i < N; i++) edges[i] = new LinkedList<Edge>();
		for(int i = 0; i < M; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			edges[u - 1].add(new Edge(u - 1, v - 1, 1));
		}
		int S = sc.nextInt() - 1, T = sc.nextInt() - 1;

		int[][] d = new int[N][3]; // d[i][j]: 頂点iに到達する最短距離 condition: 最短距離を3で割った余りがjのとき
		for(int i = 0; i < N; i++) for(int j = 0; j < 3; j++) d[i][j] = INF;
		PriorityQueue<State> que = new PriorityQueue<State>();
		que.add(new State(S, 0));

		while(!que.isEmpty()){
			State now = que.poll();
			int point = now.v;
			if(d[point][now.cost % 3] != INF) continue;
			d[point][now.cost % 3] = now.cost;
			for(Edge edge : edges[point]) {
				if(d[edge.t][(now.cost + edge.w) % 3] == INF) {
					que.add(new State(edge.t, now.cost + edge.w));
				}
			}
		}
		System.out.println((d[T][0] == INF) ? -1 : d[T][0] / 3);

	}
}