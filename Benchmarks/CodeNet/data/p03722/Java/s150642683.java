import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Edge>> edge = new ArrayList<>();

		for (int i = 0; i < n; i++)
			edge.add(new ArrayList<>());

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			long c = Integer.parseInt(str[2]);
			edge.get(a).add(new Edge(b, c));
		}

		long dist[] = dijkstra(edge, 0);

		if (dist[n - 1] <= Long.MIN_VALUE)
			System.out.println("inf");
		else
			System.out.println(dist[n - 1]);
	}

	static long[] dijkstra(ArrayList<ArrayList<Edge>> edge, int s) {
		boolean used[] = new boolean[n];
		long dist[] = new long[n];
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		int count[] = new int[n];

		boolean loop = false;

		Arrays.fill(dist, Long.MIN_VALUE);
		used[s] = true;
		dist[s] = 0;
		pq.add(new Edge(s, 0));

		while (!pq.isEmpty()) {
			Edge e = pq.poll();

			if (dist[e.to] < e.cost)
				continue;

			for (Edge v : edge.get(e.to)) {
				if (dist[v.to] < dist[e.to] + v.cost) {
					dist[v.to] = dist[e.to] + v.cost;
					pq.add(new Edge(v.to, dist[v.to]));

				}

			}
			if (++count[e.to] >= n - 1) {
				loop = true;
				break;
			}
		}
		if (loop) {
			Arrays.fill(dist, Long.MIN_VALUE);
			return dist;
		}
		return dist;
	}

}

class Edge implements Comparable<Edge> {

	int to;
	long cost;

	public Edge(int to, long cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return (int) (this.cost - e.cost);
	}
}
