import java.util.*;
import java.io.*;

class Edge{
	int from, to, cost;
	public Edge(int from, int to, int cost) {
		super();
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	
	static List<Integer> to[], rto[];
	static boolean canReach[], canGoal[];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt(), p = fs.nextInt();
		Edge es[] = new Edge[m];
		//到達可能性を調べるために、グラフを作成する。
		to = new ArrayList[n];
		rto = new ArrayList[n];
		for(int i=0;i<n;i++) {
			to[i] = new ArrayList<>();
			rto[i] = new ArrayList<>();
		}
		canReach = new boolean[n];
		canGoal = new boolean[n];
		for(int i=0;i<m;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1, c = fs.nextInt();
			//bellmanのループで使うEdgeリスト
			c = -c;
			c += p;
			es[i] = new Edge(a,b,c);
			//グラフの作成
			to[a].add(b);
			rto[b].add(a);
		}
		
		dfs(0,to,canReach);
		dfs(n-1,rto,canGoal);
		
		int dist[] = new int[n];
		Arrays.fill(dist,INF);
		dist[0] = 0;
		boolean ok = true;
		int cnt = 0;
		while(ok) {
			ok = false;
			for(int i=0;i<m;i++) {
				int from = es[i].from, to = es[i].to, cost = es[i].cost;
				if(!(canReach[from]&&canGoal[to]))continue;
				if(dist[from] + cost < dist[to]) {
					dist[to] = dist[from] + cost;
					ok = true;
				}
			}
			cnt ++;
			if(cnt>n) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(Math.max(-dist[n-1],0));
	}
	
	static void dfs(int v , List<Integer> to[], boolean reach[]) {
		reach[v] = true;
		for(int next:to[v]) {
			if(reach[next]=true)continue;
			dfs(next, to, reach);
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