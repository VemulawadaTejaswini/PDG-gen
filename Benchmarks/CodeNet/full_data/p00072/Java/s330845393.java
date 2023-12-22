import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while(true) {
			int ans = 0;
			Scanner sc = new Scanner(System.in);
			int V = sc.nextInt();
			if (V==0) {
				break;
			}
			int E = sc.nextInt();
			Edge[] G = new Edge[E];
			for(int i=0;i<E;i++) {
				String s[] = sc.next().split(",");
				int u = Integer.parseInt(s[0]);
				int v = Integer.parseInt(s[1]);
				int c = Integer.parseInt(s[2])/100-1;
				G[i] = new Edge(u,v,c);
			}
			Arrays.sort(G);
			UnionFind unionfind = new UnionFind(V);
			for(int i=0;i<E;i++) {
				if (!unionfind.isConnected(G[i].u, G[i].v)) {
					//System.out.println(unionfind);
					unionfind.union(G[i].u, G[i].v);
					//System.out.println(unionfind);
					ans += G[i].cost;
				}
			}
			System.out.println(ans);
		}
	}
}
class Edge implements Comparable<Edge>{
	int u;
	int v;
	int cost;
	public Edge(int u,int v,int cost) {
		this.u = u;
		this.v = v;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost-o.cost;
	}
}
class UnionFind {
	private int[] data;
	public UnionFind(int size) {
		data = new int[size];
		Arrays.fill(data, -1);
	}
	public void union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (data[y] < data[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
	public int size(int x) {
		return -data[root(x)];
	}
	public String toString() {
		return Arrays.toString(data);
	}
}