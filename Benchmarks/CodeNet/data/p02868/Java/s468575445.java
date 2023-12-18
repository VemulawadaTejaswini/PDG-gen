import java.util.*;
import java.io.*;

class Edge{
	int to,cost;
	public Edge(int to, int cost) {
		super();
		this.to = to;
		this.cost = cost;
	}
}

class Vertex{
	int id;
	long dist;
	public Vertex(int id, long dist) {
		super();
		this.id = id;
		this.dist = dist;
	}
}


public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	static int n, m;
	static List<Edge> graph[];
	static long dist[];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt(); m = fs.nextInt();
		graph = new ArrayList[n];
		for(int i=0;i<n;i++)graph[i] = new ArrayList<Edge>();
		for(int i=0;i<m;i++) {
			int l = fs.nextInt()-1, r = fs.nextInt()-1, c = fs.nextInt();
			graph[l].add(new Edge(r,c));
		}
		for(int i=1;i<n;i++) {
			graph[i].add(new Edge(i-1,0));
		}
		dist = new long[n];
		Arrays.fill(dist, LINF);
		dist[0] = 0;
		dijkstra(0);
		
		if(dist[n-1]==LINF) System.out.println(-1);
		else System.out.println(dist[n-1]);
	}

	static void dijkstra(int v) {
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>((p1,p2)->{
			if(p1.dist==p2.dist) return 0;
			return p1.dist - p2.dist<0? -1 : 1;
		});
		
		pq.add(new Vertex(v,0));
		while(!pq.isEmpty()) {
			Vertex now = pq.poll();
			int id = now.id; 
			long d = now.dist;
			if (dist[id] < d)continue; 
			for(Edge e : graph[id]) {
				int to = e.to;
				if(dist[to] > dist[id] + e.cost) {
					dist[to] = dist[id] + e.cost;
					pq.add(new Vertex(to, dist[to]));
				}
			}
		}
		
	}
	
	
	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}