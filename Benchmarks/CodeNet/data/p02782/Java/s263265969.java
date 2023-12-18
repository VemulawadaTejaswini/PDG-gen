import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int r1 = fs.nextInt(), c1 = fs.nextInt();
		int r2 = fs.nextInt(), c2 = fs.nextInt();

		//必ず横長の長方形で扱うために、場合によって入れ替え
		if(c2 - c1 > r2 - r1) {
			//2の交換
			int t = r2;
			r2 = c2;
			c2 = t;
			//1の交換
			int s = r1;
			r1 = c1;
			c1 = s;
		}
		
		pre_factrials(200020);
		long rs[] = new long[r2-r1+1];
		long cs[] = new long[c2-c1+1];
		
		for(int i=0;i<=c2-c1;i++) {
			cs[i] = fastFermatComb(c1+r1+i, r1);
		}
		for(int i=0;i<=r2-r1;i++) {
			rs[i] = fastFermatComb(c1+r1+i, c1);
		}
		
		long ans = cs[0];
		
		for(int i=1;i<=c2-c1;i++) {
			long t = mul(cs[i],(r2-r1+1));
			ans = plus(ans,t);
		}
		for(int i=1;i<=r2-r1;i++) {
			long t = mul(rs[i],(c2-c1+1));
			ans = plus(ans,t);
		}
		System.out.println(ans);
		
	}
	
	//Fast Fermat Combination
	static long factorials[];

	static void pre_factrials(int n) {
		factorials = new long[n + 1];
		factorials[0] = 1;
		for (int i = 0; i < n; i++) {
			factorials[i + 1] = mul(i + 1, factorials[i]);
		}
	}

	static long fastFermatComb(long a, long b) {
		if (factorials.length == 0)
			System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
		long af = factorials[(int) a];
		long bf = factorials[(int) b];
		long abf = factorials[(int) (a - b)];
		long res = af * modpow(bf, mod - 2) % mod * modpow(abf, mod - 2) % mod;
		return res;
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