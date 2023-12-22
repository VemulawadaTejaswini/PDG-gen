import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int v = fs.nextInt(), e = fs.nextInt();
		int graph[][] = new int[v][v];
		for(int i=0;i<v;i++) {
			Arrays.fill(graph[i], INF);
		}
		for(int i=0;i<e;i++) {
			int s = fs.nextInt(), t = fs.nextInt(), d = fs.nextInt();
			graph[s][t] = d;
		}
		
		int dp[][] = new int[1<<v][v];
		for(int i=0;i<1<<v;i++) {
			Arrays.fill(dp[i],INF);
		}
		dp[(1<<v)-1][0] = 0;
		for(int i=(1<<v)-2;i>=0;i--) {
			//今いる町
			for(int j=0;j<v;j++) {
				//次にたどり着く町
				for(int k=0;k<v;k++) {
					//次にたどり着く町が、訪問済でない場合
					if((i>>k&1)==0) {
						//今の町からゴールは、次の町からゴールまでの距離に、今の町から次の町の距離の和
						dp[i][j] = Math.min(dp[i][j], dp[i|1<<k][k] + graph[j][k]);
					}
				}
			}
		}
		if(dp[0][0] == INF)System.out.println(-1);
		else System.out.println(dp[0][0]);
		
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
