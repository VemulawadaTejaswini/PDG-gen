import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Edge>> edges = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			edges.add(new ArrayList<>());
			for (int j = 0; j < n; j++) {
				int a = Integer.parseInt(str[j + 1]);
				if (a == -1)
					a = Integer.MAX_VALUE;

				edges.get(i).add(new Edge(j, a));
			}
		}

		int ans = prime(edges, n);
		System.out.println(ans);
	}

	static int prime(ArrayList<ArrayList<Edge>> edges, int n) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		boolean used[] = new boolean[n];

		int sum = 0;

		pq.add(new Edge(0, 0));

		while (!pq.isEmpty()) {
			Edge e = pq.poll();

			if (used[e.to])
				continue;

			used[e.to] = true;
			sum += e.cost;
			pq.addAll(edges.get(e.to));
		}
		return sum;
	}
}

class Edge implements Comparable<Edge> {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}
