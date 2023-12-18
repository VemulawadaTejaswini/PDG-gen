import java.io.*;
import java.util.*;
public class Main {
	
	static final int INF = Integer.MAX_VALUE;
	static PriorityQueue<Vertex> pq = new PriorityQueue<>();
//	static boolean[] visited;
	static Vertex[] vs;
	
	static class Vertex implements Comparable<Vertex> {
		int index;
		int shortestDist;
		ArrayList<Integer> adj;
		ArrayList<Integer> actualAdj = new ArrayList<>();
		
		public Vertex(int i) {
			index = i;
			shortestDist = INF;
			adj = new ArrayList<>();
		}
		
		public int compareTo(Vertex v) {
			return Integer.compare(shortestDist, v.shortestDist);
		}
		
//		public String toString() {
//			return "" + index + " " + shortestDist;
//		}
	}
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int m = in.nextInt();
		
		vs = new Vertex[n];
		for (int i=0; i<n; i++)
			vs[i] = new Vertex(i);
		
		for (int i=0; i<m; i++) {
			int u = in.nextInt() - 1;
			int v = in.nextInt() - 1;
			vs[u].adj.add(v);
		}
		int s = in.nextInt() - 1, t = in.nextInt() - 1;
		
		for (Vertex v: vs) {
			boolean[] visited = new boolean[n];
			findPaths(v.index, v.index, 0, visited);
		}
		
		vs[s].shortestDist = 0;
		pq.add(vs[s]);
		while (!pq.isEmpty()) {
			Vertex v = pq.poll();
			for (int i: v.actualAdj) {
				if (vs[i].shortestDist > v.shortestDist + 1) {
					vs[i].shortestDist = v.shortestDist + 1;
					pq.add(vs[i]);
				}
			}
		}
		
		System.out.println(vs[t].shortestDist == INF ? -1 : vs[t].shortestDist);
		
	}
	
	public static void findPaths(int cur, int start, int dist, boolean[] visited) {
		if (dist == 3) {
			if (!visited[cur]) {
				visited[cur] = true;
				vs[start].actualAdj.add(cur);
			}
			return;
		}
		
		for (int i: vs[cur].adj)
			findPaths(i, start, dist+1, visited);
	}

	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}