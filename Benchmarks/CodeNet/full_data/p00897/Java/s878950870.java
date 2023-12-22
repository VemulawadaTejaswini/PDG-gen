
import java.io.*;
import java.util.*;


public class Main {
	int N, M, cap;
	HashMap<String, Integer> cityToId;
	HashSet<Integer> gasstand;
	
	
	public void solve() {
		cityToId = new HashMap<>();
		gasstand = new HashSet<>();
		while(true){
			N = nextInt();
			M = nextInt();
			cap = nextInt();
			if(N == 0) break;
			cityToId.clear();
			gasstand.clear();
			Graph g1 = new Graph(N * 2);
			Graph g2 = new Graph(N * 2);
			int srcId = toId(next());
			int dstId = toId(next());
			gasstand.add(srcId);
			gasstand.add(dstId);
			for(int i = 0; i < N; i++){
				int i1 = toId(next());
				int i2 = toId(next());
				int w = nextInt();
				g1.addBiEdge(i1, i2, w);
			}
			
			for(int i = 0; i < M; i++){
				gasstand.add(toId(next()));
			}
			int[] dist = new int[cityToId.size()];
			
			for(int v1 : gasstand){
				dijkstra(g1, v1, dist);
				for(int v2 : gasstand){
					if(v1 == v2) continue;
					if(dist[v2] <= cap * 10){
						g2.addEdge(v1, v2, dist[v2]);
					}
				}
			}
			dijkstra(g2, srcId, dist);
			if(dist[dstId] == Integer.MAX_VALUE){
				out.println(-1);
			}else{
				out.println(dist[dstId]);
			}
		}
	}
	
	public void dijkstra(Graph g, int src, int[] dist){
		Arrays.fill(dist, Integer.MAX_VALUE);
		PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		queue.offer(new int[]{0, src});
		while(!queue.isEmpty()){
			int[] nn = queue.poll();
			if(dist[nn[1]] > nn[0]){
				dist[nn[1]] = nn[0];
				for(Edge e : g.nodes[nn[1]]){
					int d = nn[0] + e.weight;
					if(d < dist[e.to.idx]){
						queue.offer(new int[]{d, e.to.idx});
					}
				}
			}
		}
	}
	
	public int toId(String city){
		Integer val = cityToId.get(city);
		if(val == null){
			int nid = cityToId.size();
			cityToId.put(city, nid);
			return nid;
		}
		return val.intValue();
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

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(; i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(; i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
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

	private static int read() {
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return(bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}