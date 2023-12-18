import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		long N = fs.nextInt(), M = fs.nextInt(), K = fs.nextInt();
		
		long sumM = (M-1)*M%mod*(M+1)%mod *((N*N)%mod);
		sumM %= mod;
		sumM = sumM * modpow(6, mod-2) % mod;
		
		long sumN = (N-1)*N%mod*(N+1)%mod *((M*M)%mod);
		sumN %= mod;
		sumN = sumN * modpow(6, mod-2) % mod;
		
		long comb = fermatComb(N*M-2, K-2); 
		
		long ans = (sumM + sumN)%mod * comb %mod;
		System.out.println(ans);
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
	static long modpow(long a, int p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			int halfP = p / 2;
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
