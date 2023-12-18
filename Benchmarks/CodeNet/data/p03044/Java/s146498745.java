import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static int ans[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ans = new int[n];

		ArrayList<ArrayList<Edge>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			String str[] = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]) - 1;
			int v = Integer.parseInt(str[1]) - 1;
			int w = Integer.parseInt(str[2]);

			list.get(u).add(new Edge(v, w));
			list.get(v).add(new Edge(u, w));
		}

		dfs(0, -1, 0, list);
		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
	}

	static void dfs(int v, int parent, int color, ArrayList<ArrayList<Edge>> edge) {
		ans[v] = color;

		for (Edge e : edge.get(v)) {
			if (e.to == parent)
				continue;
			if (e.cost % 2 == 0) {
				dfs(e.to, v, 0, edge);
			} else {
				dfs(e.to, v, 1, edge);
			}
		}
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