import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	static int n, k;
	static List<Integer> to[];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt(); k = fs.nextInt();
		to = new ArrayList[n];
		for(int i=0;i<n;i++) to[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			to[a].add(b);
			to[b].add(a);
		}
		long ans = dfs(0, -1, k, 0);
		System.out.println(ans);
	}
	static long dfs(int v, int p, int c, int d) {
		long res = c;
		if(d == 1) res++;
		int nxc = k - 2;
		for(int nx:to[v]) {
			if(nx == p)continue;
			res = mul(res, dfs(nx, v, nxc--, d+1));
		}
		return res;
	}
	
	static long plus(long x, long y) {
		return (x + y) % mod;
	}
	
	static long sub(long x, long y) {
		return (x - y + mod) % mod;
	}
	
	static long mul(long x, long y) {
		return (x * y)%mod;
	}
	
	static long div(long x, long y) {
		return x * modpow(y, mod - 2) % mod;
	}
	
	static long modpow(long x, long y) {
		if(y == 0) return 1;
		if(y%2==1) return (x * modpow(x, y-1))%mod;
		return modpow(x, y/2) * modpow(x, y/2) % mod;	
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