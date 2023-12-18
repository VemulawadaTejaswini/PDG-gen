import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static ArrayList<ArrayList<Edge>> edge;
	static long dist[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);

		edge = new ArrayList<>();
		dist = new long[n];

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);

			edge.get(a).add(new Edge(b, c));
			edge.get(b).add(new Edge(a, c));
		}

		str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]) - 1;

		dfs(k, -1, 0);

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]) - 1;
			int y = Integer.parseInt(str[1]) - 1;

			System.out.println(dist[x] + dist[y]);
		}
	}

	static void dfs(int s, int p, long add) {
		dist[s] = add;

		for (int i = 0; i < edge.get(s).size(); i++) {
			if (edge.get(s).get(i).to == p) {
				continue;
			}
			dfs(edge.get(s).get(i).to, s, add + edge.get(s).get(i).cost);
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

	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}