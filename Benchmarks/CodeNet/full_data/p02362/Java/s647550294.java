import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int INF = 20000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numEdge = sc.nextInt();
		int start = sc.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>(num);
		for(int i = 0; i < num; i++){
			graph.add(new ArrayList<Edge>());
		}
		for(int i = 0; i < numEdge; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			graph.get(u).add(new Edge(u, v, w));
		}

		try {
			long[] dist = bellmanford(graph, start);
			for (int i = 0; i < num; i++)
				System.out.println(dist[i] >= INF ? "INF" : dist[i]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

	private static long[] bellmanford(ArrayList<ArrayList<Edge>> graph, int start) throws Exception{
		int numVerticles = graph.size();
		long[] dist = new long[numVerticles];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		for(int i = 0; i <= numVerticles; i++){
			boolean fail = i == numVerticles;
			boolean noUpdate = true;
			for(int u = 0; u < numVerticles; u++){
				for(Edge e : graph.get(u)){
					int v = e.v;
					long newLength = dist[u] + e.weight;
					if(newLength < dist[v]){
						if(fail) throw new Exception("NEGATIVE CYCLE");
						dist[v] = newLength;
						noUpdate = false;
					}
				}
			}
			if(noUpdate) break;
		}
		return dist;
	}
}

class Edge {
	int u;
	int v;
	int weight;

	public Edge(int u, int v, int weight) {
		this.u = u;
		this.v = v;
		this.weight = weight;
	}
}