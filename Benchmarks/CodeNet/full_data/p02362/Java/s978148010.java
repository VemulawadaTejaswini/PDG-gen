

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		//0 origin
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int x = Integer.parseInt(tmpArray[2]);

		Edge edges[] = new Edge[m];

		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");
			int from = Integer.parseInt(tmpArray[0]);
			int to = Integer.parseInt(tmpArray[1]);
			int cost = Integer.parseInt(tmpArray[2]);

			edges[i] = new Edge(from, to, cost);
		}

		solve(edges, n, x);
	}

//	static final int INF = 10_000_001;

	static void solve(Edge[] edges,  int n, int x){
		//xからそれぞれのfarmへの帰り道の最短距離
		int[] dist = shortestPath(edges, n, x);

		if(dist == null){
			System.out.println("NEGATIVE CYCLE");
			return;
		}

		for(int i = 0; i < n; i++){
			if(dist[i] == INF){
				System.out.println("INF");
			}
			else {
				System.out.println(dist[i]);
			}
		}

	}

	static final int INF = Integer.MAX_VALUE;


	static int[] shortestPath(Edge[] edges, int n, int s){
		int dist[] = new int[n];

		Arrays.fill(dist, INF);
		dist[s] = 0;

		int e = edges.length;

		int k = 0;
		while(true){
			boolean update = false;

			for(int i = 0; i < e; i++){
				Edge edge = edges[i];
				if(dist[edge.from] != INF && dist[edge.to] > dist[edge.from] + edge.cost){
					dist[edge.to] = dist[edge.from] + edge.cost;
					update = true;

//					System.out.println("dist:"+edge.to+" is "+dist[edge.to]);

					if(k == n - 1){
						return null;
					}
				}
			}

			if(!update){
				break;
			}

			k++;
		}

		return dist;
	}
}
//
//class Distance implements Comparable<Distance>{
//	int dist;
//	int id;
//
//	Distance(int dist, int id){
//		this.dist = dist;
//		this.id = id;
//	}
//
//	@Override
//	public int compareTo(Distance d) {
//		return this.dist - d.dist;
//	}
//}

class Edge {
	int from;
	int to;
	int cost;

	Edge(int from, int to, int cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
}
