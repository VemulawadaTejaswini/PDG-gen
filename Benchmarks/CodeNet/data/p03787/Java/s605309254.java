
import java.io.*;
import java.util.*;
 
public class Main{

	int N, M;
	UnionFind uf;
	Graph g;
	boolean[] tree;
	boolean[] reach;
	int[] color;
	long dsize;
	public void solve(){
		N = nextInt();
		M = nextInt();
		uf = new UnionFind(N);
		g = new Graph(N);
		for(int i = 0; i < M; i++){
			int u = nextInt() - 1;
			int v = nextInt() - 1;
			g.addBiEdge(u, v, 1);
			uf.union(u, v);
		}
		color = new int[N];
		Arrays.fill(color, -1);
		reach = new boolean[N];
		long ans = (long)N * (long)N;
		long sumt = 0;
		long sumn = 0;
		for(int i = 0; i < N; i++){
			if(color[i] == -1){
				dsize = 0;
				long ret = dfs(i, N + 1, 0);
				if(dsize > 1){
					ans -= dsize * dsize;
					if(ret == 1){
						ans += 1;
						if(sumt > 0) ans -= (sumt * dsize - 1) * 2;
						if(sumn > 0) ans -= (sumn * dsize - 1) * 2;
						sumt += dsize;
					}else{
						ans += 2;
						if(sumt > 0) ans -= (sumt * dsize - 1) * 2;
						if(sumn > 0) ans -= (sumn * dsize - 2) * 2;
						sumn += dsize;
					}
				}
			}
		}
		out.println(ans);
	}
	
	
	int dfs(int node, int prev, int c){
		if(color[node] != -1){
			if(color[node] == c){
				return 2;
			}else{
				return 1;
			}
		}else{
			dsize++;
			color[node] = c;
			if(g.nodes[node].size() == 0){
				return 1;
			}
			int min = 2;
			for(Edge e : g.nodes[node]){
				if(e.to.idx == prev) continue;
				min = Math.min(min, dfs(e.to.idx, node, (c + 1) % 2));
			}
			return min;
		}
	}
	
	class UnionFind{
		int[] tree;
		boolean[] multi;
		public UnionFind(int n){
			tree = new int[n];
			multi = new boolean[n];
			for(int i = 0; i < n; i++){
				tree[i] = -1;
			}
		}
		
		public int root(int x){
			if(tree[x] < 0) return x;
			else return tree[x] = root(tree[x]);
		}
		
		public boolean find(int x, int y){
			return root(x) == root(y);
		}
		
		public int union(int x, int y){
			x = root(x);
			y = root(y);
			if(x != y){
				if(tree[x] < tree[y]){
					tree[y] += tree[x];
					tree[x] = y;
					multi[y] = multi[x] | multi[y];
					return -tree[y];
				}else{
					tree[x] += tree[y];
					tree[y] = x;
					multi[x] = multi[x] | multi[y];
					return -tree[x];
				}
			}else{
				multi[x] = true;
			}
			return -tree[x];
		}
		
		public int size(int x){
			return -tree[root(x)];
		}
		public boolean isMulti(int x){
			return multi[root(x)];
		}
	}
	
	class Graph{
		Node[] nodes;
		public Graph(int n){
			nodes = new Node[n];
			for(int i = 0; i < n; i++){
				nodes[i] = new Node(i);
			}
		}
		public void addEdge(int from, int to, int weight){
			nodes[from].add(new Edge(nodes[from], nodes[to], weight));
		}
		public void addBiEdge(int n1, int n2, int weight){
			addEdge(n1, n2, weight);
			addEdge(n2, n1, weight);
		}
	}

	class Node extends ArrayList<Edge>{
		int idx;
		public Node(int idx){
			this.idx = idx;
		}
		
	}

	class Edge{
		Node from;
		Node to;
		int weight;
		public Edge(Node from, Node to, int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}

	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}