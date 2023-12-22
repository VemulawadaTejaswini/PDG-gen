import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Edge> pQue = new PriorityQueue<Edge>(11,COMPARATOR);

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			String[] str = line.substring(1).split(" ");
			for (int j=0; j<n; j++) {
				int cost = Integer.parseInt(str[j]);
				if (cost != -1){
					Edge edge = new Edge(cost,i,j);
					pQue.add(edge);
				}
			}
		}

		UnionFind forest = new UnionFind(n);
		int ans = 0;

		while (pQue.size() != 0) {
			Edge edge = pQue.poll();
			if (!forest.same(edge.node1,edge.node2)) {
				forest.unite(edge.node1,edge.node2);
				ans += edge.cost;
			}
		}

		System.out.println(ans);

		br.close();
	}

	static class Edge {
		int cost;
		int node1;
		int node2;

		Edge(int cost,int node1,int node2){
			this.cost = cost;
			this.node1 = node1;
			this.node2 = node2;
		}
	}

	public static final Comparator<Edge> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<Edge>{
		public int compare(Edge x,Edge y){
			return (x.cost > y.cost) ? 1 : ((x.cost == y.cost) ? 0 : -1);
		}
	}
}

class UnionFind {

	int[] node;

	UnionFind(int n){
		node = new int[n];
		for (int i=0; i<n; i++)
			node[i] = i;
	}

	int find(int x){
		if(node[x] == x)
			return x;
		return node[x] = find(node[x]);
	}

	boolean same(int x,int y){
		return find(x) == find(y);
	}

	void unite(int x,int y){
		if (find(x) == find(y))
			return;
		node[find(x)] = find(y);
	}
}