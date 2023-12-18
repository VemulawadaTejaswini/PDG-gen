import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt() , k = fs.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = fs.nextInt();
		}
		
		long rdp[][] = new long[n+1][5001];


		
		rdp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				rdp[i+1][j] += rdp[i][j];
				if(j+a[n-1-i]>5000) {
					rdp[i+1][5000]+=rdp[i][j];
				}
				else {
					rdp[i+1][j+a[n-1-i]]+=rdp[i][j];
				}
			}	
		}
		
		long rsum[][] = new long[n+1][5001];
		
		for(int i=0;i<n+1;i++) {
			rsum[i][5000] = rdp[i][5000];
			for(int j=5000;j>=1;j--) {
				rsum[i][j-1] = rsum[i][j] + rdp[i][j-1];
			}
		}
		
		//long dp[][] = new long[n+1][5001];
		long dp[][] = rdp;
		for(int i=0;i<n;i++)Arrays.fill(dp[i], 0L);
		dp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				dp[i+1][j] += dp[i][j];
				if(j+a[i]>5000) {
					dp[i+1][5000]+=dp[i][j];
				}
				else {
					dp[i+1][j+a[i]]+=dp[i][j];
				}
			}	
		}

		int ans = 0;
		for(int i=0;i<n;i++) {
			long s = 0, t = 0;
			for(int j=0;j<5001;j++) {
				//selfなしでKを超える組み合わせの数
				s += dp[i][j] * rsum[n-i-1][(int)Math.max(0,k-j)];
				//selfを必ず使って、 Kを越える組み合わせの数
				t += dp[i][j] * rsum[n-i-1][(int)Math.max(0,k-j-a[i])];
			}
			if(s==t)ans++;
		}
		
		
		System.out.println(ans);
		
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


