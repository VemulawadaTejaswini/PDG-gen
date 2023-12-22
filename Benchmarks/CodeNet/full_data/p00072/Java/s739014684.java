import java.util.*;

class Edge implements Comparable<Edge> {
	
	public int u, v, w;
	Edge(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}
	
	@Override
	public int compareTo(Edge e) {
		return this.w - e.w;
	}
	
	public String toString() {
		return this.u + " " + this.v + " " + this.w;
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static int[] parent, rank;
	static Edge[] es;
	
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		m = sc.nextInt();
		es = new Edge[m];
		for (int i = 0; i < m; i++) {
			String[] ps = sc.next().split(",");
			es[i] = new Edge(Integer.parseInt(ps[0]), Integer.parseInt(ps[1]), Integer.parseInt(ps[2]));
		}
		parent = new int[n];
		rank = new int[n];
		return true;
	}
	
	static void solve(){
		Arrays.sort(es);
		int res = 0;
		init(n);
		for (int i = 0; i < m; i++) {
			Edge e = es[i];
			if (!same(e.u, e.v)) {
				unite(e.u, e.v);
				res += (e.w / 100) - 1;
			}
		}
		System.out.println(res);
	}

	static void init(int n){
		for(int i = 0; i < n; i++){
			parent[i] = i;
			rank[i] = 0;
		}
	}
	
	static int find(int x){
		if(parent[x] == x){
			return x;
		}else{
			return parent[x] = find(parent[x]);
		}
	}
	
	static void unite(int x, int y){
		x = find(x);
		y = find(y);
		if(x == y)return;
		
		if(rank[x] < rank[y]){
			parent[x] = y;
		}else{
			parent[y] = x;
			if(rank[x] == rank[y])rank[x]++;
		}
	}
	
	static boolean same(int x, int y){
		return find(x) == find(y);
	}
}