import java.util.*;
import static java.lang.Math.*;

public class Main {
    
    static int[] a;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Tree tr = new Tree(n, false);
		for(int i = 0; i < n-1; i++){
		    int from = sc.nextInt()-1;
		    int to = sc.nextInt()-1;
		    tr.add(from, to);
		}
		
		// 計算
		//int result = 0;
		long[] result = tr.dfs(0);
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(result[i]);
		}
		//System.out.println(result);
	}
}

class Tree {
	int n;
	boolean directed;
	ArrayList<Edge>[] adjList;
	int m;
	long[] dist;
	int start;
	int[] prev;
	ArrayList<Integer> path;
	long INF = 1001001001001001001L;

	public Tree (int n, boolean directed) {
		this.n = n;
		this.m = 0;
		this.directed = directed;
		this.adjList = new ArrayList[n];
		for(int i = 0; i < n; i++){
			adjList[i] = new ArrayList<Edge>();
		}
	}
	
	public void add(int from, int to) {
		add(from, to, 1);
	}
	public void add(int from, int to, int w) {
		adjList[from].add(new Edge(from, to, w));
		this.m++;
		if(!directed){
			adjList[to].add(new Edge(to, from, w));
			this.m++;
		}
	}
	
	public long[] dfs(int start) { // O(M)
		this.start = start;
		this.prev = new int[n];
		Arrays.fill(prev, -1);
		this.dist = new long[n];
		Arrays.fill(dist, INF);

		long[] ans = new long[n];
		int[] list = new int[n];
		Arrays.fill(list, Integer.MAX_VALUE);
		dfsFunc(start, null, list, ans);
		
		return ans;
	}
	
	private void dfsFunc(int now, Edge e, int[] list, long[] ans) {
	    if(e == null){
	        dist[now] = 0;
	        prev[now] = now;
	    }else{
	        dist[now] = dist[e.from] + e.w;
	        prev[now] = e.from;
	    }
	    
	    int index = binarySearch(list, Main.a[now], true);
	    int old = list[index];
	    list[index] = Main.a[now];
		ans[now] = binarySearch(list, Integer.MAX_VALUE, true);
		
		for(Edge next : adjList[now]){
		    if(e != null && next.to == e.from) continue;
		    dfsFunc(next.to, next, list, ans);
		}
		list[index] = old;
	}

	public int binarySearch(int[] array, int n, boolean isStrict){
		int index = 0;
		int l = -1;
		int r = array.length;
		while(r-l > 1){
			int c = (r + l)/2;
			
			if(n < array[c] || (isStrict && n == array[c])){
				r = c;
			}else{
				l = c;
			}
		}
		index = r;
		return index;
	}
	
	public ArrayList<Integer> pathTo(int to){
		this.path = new ArrayList<Integer>();
		pathToRec(to);
		return path;
	}
	
	private void pathToRec(int to){
		if(to != start) pathToRec(prev[to]);
		path.add(to);
		return;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(ArrayList<Edge> list : adjList){
			for(Edge e : list){
				sb.append(e.toString());
				sb.append("\n");
			}
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
}


