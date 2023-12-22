

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Graph {

		List<List<Integer>> graph;
		boolean visited[];
		int nodes;
		int distance[];
		int point[];

		Graph(int nodes) {
			this.nodes = nodes;
			graph = new ArrayList<>();
			visited = new boolean[nodes + 1];
			distance = new int[nodes + 1];
			point = new int[nodes + 1];

			for (int i = 0; i <= nodes; i++) {
				graph.add(new ArrayList<>());
				distance[i] = -1;
			}

		}

		void addEdge(int a, int b) {
			graph.get(a).add(b);
			graph.get(b).add(a);
			point[a] = b;
		}

		void bfs(int u) {

			Queue<Integer> q = new LinkedList<>();
			q.add(u);
			distance[u] = 0;
			visited[u] = true;
			while (!q.isEmpty()) {

				int node = q.poll();
				List<Integer> neighbour = graph.get(node);

				for (int i : neighbour) {
					if (!visited[i]) {
						q.add(i);
						distance[i] = distance[node] + 1;
						visited[i] = true;
					}
				}

			}
		}
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Graph g = new Graph(n);
		
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			g.addEdge(u, v);
		}
		
		g.bfs(1);
		boolean flag = true;
		StringBuilder ans = new StringBuilder("");
		ans.append("Yes\n");
		
		for(int i = 2; i <= n; i++) {
			
			if(g.distance[i] != -1)
				ans.append(g.point[i] + "\n");
			else {
				flag = false;
				break;
			}
		}
		
		if(!flag)
			pr.println("No");
		else
			pr.println(ans);
		
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}