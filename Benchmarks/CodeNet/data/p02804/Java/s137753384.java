import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), k = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		
		Arrays.sort(a);
		long ans = 0;
		
		//combを事前に用意する。
		long comb[] = new long[n+1];
		comb[k-1]=1;
		for(int i=k;i<=n;i++) {
			//comb[i] = mul(comb[i-1], div(n + 1, n+2-k));
			comb[i] = fermatComb(i, k-1);
		}
		
		
		for(int i=0;i<n;i++) {
			int s = i; //自分より小さいものの個数
			int l = n - i - 1; //自分より大きいものの個数
			//minになる回数
			long nmin = 0;
			if(k-1>l) nmin = 0;
			else {
				//l個からk-1個選べばいい
				//nmin = fermatComb(l, k-1);
				nmin = comb[l];
			}
			ans = suv(ans, mul(a[i], nmin));
			
			//maxになる回数
			long nmax = 0;
			if(k-1>s) nmax = 0;
			else {
				//l個からk-1個選べばいい
				//nmax = fermatComb(s, k-1);
				nmax = comb[s];
			}
			ans = plus(ans, mul(a[i], nmax));
			
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

	static long suv(long x, long y) {
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
	
	//Fermat Combination
	static long fermatComb(long a, long b) {
		if (b > a - b)
			return fermatComb(a, a - b);
		long ansMul = 1, ansDiv = 1;
		for (int i = 0; i < b; i++) {
			ansMul *= (a - i);
			ansMul %= mod;
			ansDiv *= (i + 1);
			ansDiv %= mod;
		}
		long ans = ansMul * modpow(ansDiv, mod - 2) % mod;
		return ans;
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