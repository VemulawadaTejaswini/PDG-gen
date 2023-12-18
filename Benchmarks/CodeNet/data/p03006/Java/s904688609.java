import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static int p[][];
	static boolean visited[];
	static int n;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		p = new int[n][2];
		for(int i=0;i<n;i++) {
			int x = fs.nextInt(), y = fs.nextInt();
			p[i][0] = x; p[i][1] = y;
		}
		
		if(n==1)System.out.println(1);
		
		Arrays.sort(p,(p1,p2)->{
			if(p1[0]==p2[0]) return p1[1] - p2[1];
			return p1[0] - p2[0];
		});
		
		List<int[]> ls = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				int t[] = {p[i][0] - p[j][0], p[i][1] - p[j][1]};
				ls.add(t);
			}
		}
		
		int ans = INF;
		for(int[] t:ls) {
			int v = t[0], w = t[1];
			visited = new boolean[n];
			int res = 0;
			
			for(int i=0;i<n;i++) {
				if(visited[i])continue;
				res++;
				dfs(i,v,w);
			}
			ans = Math.min(ans, res);
		}
		System.out.println(ans);
	}

	static void dfs(int x, int v, int w) {
		visited[x]=true;
		int nx = p[x][0] + v, ny = p[x][1] + w;
		for(int i=0;i<n;i++) {
			if(p[i][0]==nx&&p[i][1]==ny) {
				dfs(i, v, w);
				break;
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