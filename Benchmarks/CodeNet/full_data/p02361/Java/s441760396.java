import java.util.*;
import java.io.*;

public class Main{

	static class P implements Comparable {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Object o) {
			P p = (P)o;
			if (this.x == p.x && this.y == p.y) return 0;
			if (this.x < p.x || (this.x == p.x && this.y < p.y)) return -1;
			return 1;
		}
	}

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int R = sc.nextInt();
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> w = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < V; i++) {
			g.add(new ArrayList<Integer>());
			w.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			g.get(s).add(t);
			w.get(s).add(d);
		}

		PriorityQueue<P> que = new PriorityQueue<P>();
		ArrayList<Integer> dist = new ArrayList<Integer>();
		for (int i = 0; i < V; i++) {
			dist.add(1500000007);
		}
		que.add(new P(0, R));

		while(!que.isEmpty()) {
			P p = que.poll();
			int d = p.x;
			int c = p.y;

			if (d > dist.get(c)) continue;
			dist.set(c, d);

			for (int i = 0; i < g.get(c).size(); i++) {
				int n = g.get(c).get(i);
				int ww = w.get(c).get(i);
				que.add(new P(d + ww, n));				
			}
		}

		for (int i = 0; i < V; i++) {
			if (dist.get(i) >= 1500000000) System.out.println("INF");
			else System.out.println(dist.get(i));
		}
	}
}


