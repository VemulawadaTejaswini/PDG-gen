import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] xlist = new int[n][2];
		int[][] ylist = new int[n][2];
		for(int i = 0; i < n; i++){
		    xlist[i][0] = i;
		    xlist[i][1] = sc.nextInt();
		    ylist[i][0] = i;
		    ylist[i][1] = sc.nextInt();
		}
		Arrays.sort(xlist, (s, t) -> Integer.compare(s[1], t[1]));
		Arrays.sort(ylist, (s, t) -> Integer.compare(s[1], t[1]));
		Graph g = new Graph(n);
		for(int i = 0; i < n-1; i++){
		    int from = xlist[i][0];
		    int to = xlist[i+1][0];
		    g.add(from, to, xlist[i+1][1] - xlist[i][1]);
		    from = ylist[i][0];
		    to = ylist[i+1][0];
		    g.add(from, to, ylist[i+1][1] - ylist[i][1]);
		}
		
		// 計算
		long result = 0;
		g.kruskal();
		result = g.sumWeight();
		
		// 出力
		System.out.println(result);
	}
}

class Graph {
	int n;
	ArrayList<Edge> edgeList;
	PriorityQueue<Edge> pq;
	UnionFind uf;

	public Graph (int n) {
		this.n = n;
		this.edgeList = new ArrayList<Edge>();
		this.pq = new PriorityQueue<Edge>((e1, e2) -> Integer.compare(e1.w, e2.w));
		this.uf = new UnionFind(n);
	}
	
	public void add(int from, int to, int w) {
		pq.add(new Edge(from, to, w));
	}
	
	public void add(int from, int to) {
		add(from, to, 1);
	}
	
	public void kruskal() {
		while(!pq.isEmpty()){
		    Edge now = pq.poll();
		    if(uf.union(now.from, now.to)) edgeList.add(now);
		}
	}
	
	public long sumWeight() {
	    long sum = 0L;
	    for(Edge e : edgeList){
	        sum += e.w;
	    }
	    return sum;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(Edge e : edgeList){
		    sb.append(e.toString());
		    sb.append("\n");
		}
		return sb.toString();
	}

	class Edge {
		int from;
		int to;
		int w;
		
		Edge(int from, int to, int w){
			this.from = from;
			this.to = to;
			this.w = w;
		}
		
		public String toString(){
			return "from:" + from + " to:" + to + " w:" + w;
		}
	}
	
	class Vertex {
		int id;
		long distance;
		
		Vertex(int id, long distance){
			this.id = id;
			this.distance = distance;
		}
		
		public String toString(){
			return "id:" + id + " distance:" + distance;
		}
	}
	
    class UnionFind {
    	int[] parent;
    	int[] rank;
    	int[] cnt;
	
    	UnionFind(int n){
    		this.parent = new int[n];
    		this.rank = new int[n];
    		this.cnt = new int[n];
    		for(int i = 0; i < n; i++){
    			parent[i] = i;
    			rank[i] = 0;
    			cnt[i] = 1;
    		}
    	}
	
    	public int find(int i){
    		if(i == parent[i]) return i;
    		parent[i] = find(parent[i]);
    		return parent[i];
    	}
    	
    	public boolean union(int x, int y){
    		int xRoot = find(x);
    		int yRoot = find(y);
    		if(xRoot == yRoot) return false;
    		if(rank[xRoot] < rank[yRoot]){
    			parent[xRoot] = yRoot;
    			cnt[yRoot] += cnt[xRoot];
    		}else if(rank[xRoot] > rank[yRoot]){
    			parent[yRoot] = xRoot;
    			cnt[xRoot] += cnt[yRoot];
    		}else{
    			parent[yRoot] = xRoot;
    			rank[xRoot]++;
    			cnt[xRoot] += cnt[yRoot];
    		}
    		return true;
    	}
    	
    	public boolean same(int x, int y){
    		return find(x) == find(y);
    	}

    	public int cnt(int x){
    		return cnt[find(x)];
    	}
    }
}
