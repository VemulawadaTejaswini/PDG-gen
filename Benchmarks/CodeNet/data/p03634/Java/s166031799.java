import java.util.*;
import java.io.*;
public class Main {
	
	static ArrayList<Pair>[] graph;
	static int N;
	
	public static class Pair{
		int node;
		long dist;
		public Pair(int node, long dist) {
			this.node = node; this.dist = dist;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[N+1];
		for(int i = 1; i<=N; i++) graph[i] = new ArrayList<Pair>();
		
		for(int i = 1; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
			graph[a].add(new Pair(b, w)); graph[b].add(new Pair(a, w));
		}		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Q = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		long dist[] = Dijkstra(K);
		for(int q = 0; q<Q; q++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			System.out.println(dist[a]+dist[b]);
		}
				
	}
	
	public static long[] Dijkstra(int src) {
		
		long dist[] = new long[N+1];
		Arrays.fill(dist, Long.MAX_VALUE);
		dist[src] = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(src);
		while(!list.isEmpty()) {
			int crntnode = list.pop();
			for(Pair p : graph[crntnode]) {
				if(dist[p.node] > dist[crntnode] + p.dist) {
					dist[p.node] = dist[crntnode] + p.dist;
					list.add(p.node);
				}
			}
		}
		
		return dist;
		
	}
	

}
