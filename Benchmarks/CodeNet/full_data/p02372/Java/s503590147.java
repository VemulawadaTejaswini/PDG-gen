import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		init(n);
		for (int i=0;i<n-1;i++) {
			int s = in.nextInt();
			int t = in.nextInt();
			int w = in.nextInt();
			adList[s].add(new P(t, w));
			adList[t].add(new P(s, w));
		}
		long[] height = height(n);
		for (int i=0;i<n;i++) {
			System.out.println(height[i]);
		}
	}
	
	///
	static List<P>[] adList;
	static long[] dist;
	static long[] height(int n) { // n is number of nodes
		long[] heights = new long[n];
		Arrays.fill(heights, Long.MIN_VALUE);
		for (int i=0;i<n;i++) {
			if (heights[i]>Long.MIN_VALUE) continue;
			dijkstra(i);
			long furthest = -1;
			int furthestIdx = -1;
			for (int j=0;j<n;j++) {
				if (furthest<dist[j]) {
					furthest = dist[j];
					furthestIdx = j;
				}
			}
			heights[i] = furthest;
			heights[furthestIdx] = furthest;
			Arrays.fill(dist, Long.MAX_VALUE);
		}
		return heights;
	}
	static void dijkstra(int s) { // s is start
		dist[s] = 0L;
		PriorityQueue<P> q = new PriorityQueue<P>();
		q.add(new P(s, 0L));
		
		while (!q.isEmpty()) {
			P cur = q.poll();
			if (dist[cur.index] < cur.dist)
				continue;
			for (P next : adList[cur.index]) {
				if (dist[next.index] > dist[cur.index] + next.dist) {
					dist[next.index] = dist[cur.index] + next.dist;
					q.add(new P(next.index, dist[next.index]));
				}
			}
		}
	}
	@SuppressWarnings("unchecked")
	static void init(int n) {
		adList = new List[n];
		for (int i=0;i<n;i++) {
			adList[i] = new ArrayList<P>();
		}
		dist = new long[n];
		Arrays.fill(dist, Long.MAX_VALUE);
	}
	static class P implements Comparable<P> {
		int index; long dist;
		public P(int index, long dist) {this.index = index; this.dist = dist;}
		public int compareTo(P p) {return this.dist < p.dist ? -1 : this.dist == p.dist ? 0 : 1;}
		public String toString() {return index+","+dist;}
	}
	// in adList, P.dist is distance from adjacent point
	// in q, P.dist is shortest path distance from start point
}