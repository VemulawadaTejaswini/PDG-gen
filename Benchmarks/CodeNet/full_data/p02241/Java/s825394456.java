import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {

	static List<List<Edge>> graph;
	static int vNum;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		 graph = new  ArrayList<>();
		vNum = n;
		List<Edge> edgelist = new ArrayList<>();
		for (int j = 0; j < n; j++) {
			String[] str = br.readLine().split(" ");
			edgelist = new ArrayList<>();
			for (int k = 1; k <=n; k++) {
				if(Integer.parseInt(str[k]) != -1){
				edgelist.add(new Edge(k-1, Integer.parseInt(str[k])));
				}
			}
			graph.add(edgelist);
		}

		System.out.println(prim());
	}

	static class Edge implements Comparable<Edge> {
		int to;
		int cost;

		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}

		public int compareTo(Edge o) {
			// TODO ?????????????????????????????????????????????
			return this.cost - o.cost;
		}
	}

	static int prim() {
		int total = 0;
		Queue<Edge> que = new PriorityQueue<Edge>();
		que.offer(new Edge(0, 0));
		boolean[] use = new boolean[vNum];
		while (!que.isEmpty()) {
			Edge e = que.poll();
			if (use[e.to]) {
				continue;
			}
			use[e.to] = true;
			total += e.cost;
			for (Edge e2 : graph.get(e.to)) {
				que.offer(e2);
			}
		}
		return total;
	}

}