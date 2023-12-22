import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			ArrayList<ArrayList<Edge>> edges = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				edges.add(new ArrayList<>());
			}

			double x[] = new double[n];
			double y[] = new double[n];
			double z[] = new double[n];
			double r[] = new double[n];

			for (int i = 0; i < n; i++) {
				String str[] = br.readLine().split(" ");
				x[i] = Double.parseDouble(str[0]);
				y[i] = Double.parseDouble(str[1]);
				z[i] = Double.parseDouble(str[2]);
				r[i] = Double.parseDouble(str[3]);
			}

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					double dist = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])
							+ (z[i] - z[j]) * (z[i] - z[j]));

					dist = dist - (r[i] + r[j]);
					if (dist < 0)
						dist = 0;
					
					edges.get(i).add(new Edge(j, dist));
					edges.get(j).add(new Edge(i, dist));
				}
			}

			double sum = prime(edges, n);
			System.out.println(String.format("%.3f", sum));
		}
	}

	static double prime(ArrayList<ArrayList<Edge>> edges, int n) {
		boolean[] done = new boolean[n];

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(0, 0));

		double totalCost = 0;
		while (!q.isEmpty()) {
			Edge e = q.poll();
			if (done[e.to]) {
				continue;
			}

			done[e.to] = true;
			totalCost += e.cost;
			q.addAll(edges.get(e.to));
		}

		return totalCost;
	}
}

class Edge implements Comparable<Edge> {

	int to;
	double cost;

	public Edge(int to, double cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		if (this.cost > e.cost)
			return 1;
		else if (this.cost < e.cost)
			return -1;

		return 0;
	}
}
