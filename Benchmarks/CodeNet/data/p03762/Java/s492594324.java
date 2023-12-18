import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		int x[] = fs.nextIntArray(n);
		int y[] = fs.nextIntArray(m);
		long ans = 0;
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				long s = mul(i, sub(n,i)); //x方向の長方形の含み方
				long t = mul(j, sub(m,j));
				long sq = mul(x[i]-x[i-1],y[j]-y[j-1]);
				long res = mul(mul(s,t),sq);
				ans = plus(ans,res);
			}
		}
		System.out.println(ans);
	}
	//MOD culculations
	static long plus(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x + y) % mod;
		return res;
	}

	static long sub(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x - y + mod) % mod;
		return res;
	}

	static long mul(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * y % mod;
		return res;
	}

	static long div(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * modpow(y, mod - 2) % mod;
		return res;
	}

	//modの元での高速pow()
	static long modpow(long a, long p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			long halfP = p / 2;
			long root = modpow(a, halfP);
			return root * root % mod;
		} else
			return a * modpow(a, p - 1) % mod;
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