import java.util.*;
import java.io.*;

//二部マッチングによる解法
class Edge{
	int to, cap, rev;
	public Edge(int to, int cap, int rev) {
		super();
		this.to = to;
		this.cap = cap;
		this.rev = rev;
	}
}

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	static int n;
	static List<Edge> graph[];
	static int s, t;
	static boolean used[];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		int red[][] = new int[n][2];
		int blue[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			int a = fs.nextInt(), b = fs.nextInt();
			red[i][0] = a; red[i][1] = b;
		}
		for(int i=0;i<n;i++) {
			int a = fs.nextInt(), b = fs.nextInt();
			blue[i][0] = a; blue[i][1] = b;
		}
		graph = new ArrayList[2 * n + 2];
		//0~n-1の頂点が赤、n~2n-1の頂点が青。
		for(int i=0;i<2 * n + 2;i++)graph[i] = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(red[i][0]<blue[j][0]&&red[i][1]<blue[j][1]) {
					addEdge(i, n + j, 1);
				}
			}
		}
		s = 2 * n; t = s + 1;
		for(int i=0;i<n;i++) {
			addEdge(s,i,1);
			addEdge(i+n,t,1);
		}
		
		int ans = 0;
		used = new boolean[2 * n + 2];
		while(true) {
			Arrays.fill(used, false);
			int d = dfs(s,INF);
			if(d == 0)break;
			ans += d;
		}
		System.out.println(ans);
	}

	static int dfs(int v, int f) {
		if(v == t) return f;
		used[v] = true;
		for(Edge e:graph[v]) {
			if(e.cap<=0||used[e.to])continue;
			int d = dfs(e.to,Math.min(e.cap, f));
			if(d>0) {
				e.cap -= d;
				graph[e.to].get(e.rev).cap += d;
				return d;
			}
		}
		return 0;
	}
	
	static void addEdge(int x, int y, int cap) {
		graph[x].add(new Edge(y,cap,graph[y].size()));
		graph[y].add(new Edge(x,0,graph[x].size()-1));
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