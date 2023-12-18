import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	static int n;
	static List<Integer> to[];
	static int memo[];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		to = new ArrayList[n];
		for(int i=0;i<n;i++) to[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			to[a].add(b);
			to[b].add(a);
		}
		memo = new int[n];
		Arrays.fill(memo, -1);
		dfs(0,-1,0);
		int a = 0, b = 0;
		for(int i=0;i<n;i++) {
			if(memo[i] == 0) {
				a ++ ;
			}
			else if(memo[i] == 1) {
				b ++ ;
			}
		}
		
		int m = n/3;
		//bを大きい方にする
		
		int ans[] = new int[n];
		
		int on = (n+2)/3;
		int tn = (n+1)/3;
		int thn = n/3;
		
		int one = 1;
		int two = 2;
		int th = 3;
		if(a<=m) {
			for(int i=0;i<n;i++) {
				if(memo[i]==0) {
					ans[i] = th;
					th += 3;
					thn --;
				}
				else {
					if(on > 0) {
						ans[i] = one;
						one += 3;
						on--;
					}
					else if(tn > 0){
						ans[i] = two;
						two += 3;
						tn--;
					}
					else {
						ans[i] = th;
						th += 3;
						thn --;
					}
				}
			}
		}
		else if(b<=m) {
			for(int i=0;i<n;i++) {
				if(memo[i]==1) {
					ans[i] = th;
					th += 3;
					thn --;
				}
				else {
					if(on > 0) {
						ans[i] = one;
						one += 3;
						on--;
					}
					else if(tn > 0){
						ans[i] = two;
						two += 3;
						tn--;
					}
					else {
						ans[i] = th;
						th += 3;
						thn --;
					}
				}
			}
		}
		else {
			for(int i=0;i<n;i++) {
				if(memo[i]==1) {
					if(on > 0) {
						ans[i] = one;
						one += 3;
						on--;
					}
					else {
						ans[i] = th;
						th += 3;
						thn --;
					}
				}
				else if(memo[i]==0){
					if(tn > 0){
						ans[i] = two;
						two += 3;
						tn--;
					}
					else {
						ans[i] = th;
						th += 3;
						thn --;
					}
				}	
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}


	//rootノードからの距離と、各ノードの親を配列に格納
	static void dfs(int v, int p, int d) {
		if(d%2==0) memo[v] = 0;
		else memo[v] = 1;
		for(int to:to[v]) {
			if(to == p)continue;
			dfs(to, v, d + 1);
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
