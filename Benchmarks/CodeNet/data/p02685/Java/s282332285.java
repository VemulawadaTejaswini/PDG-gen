//--- pE ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		long n = reader.nl();
		long m = reader.nl();
		long k = reader.nl();
		long ans = 0;
		buildFact((int)n+1);
		for (int i=0; i<=k; i++) {
			ans += pm(m-1,n-1-i, mod) * m % mod * nCr((int)n-1, i) % mod;
			// out.println(ans);
			ans %= mod;
		}
		out.println(ans);
		return;
	}

	long[] fact;
	long[] fact_inv;
	long mod = (long)998244353;
	// long mod = (long)1e9+7;
	private void buildFact(int n) {
	    fact = new long[n+1];
	    fact_inv = new long[n+1];

	    fact[0] = 1;
		fact_inv[0] = 1;
	    for (int i=1; i<n+1; i++) {
	        fact[i] = fact[i-1] * i % mod;
	        fact_inv[i] = pm(fact[i], mod - 2, mod);
	    }
	    return;
	}

	private long nCr(int n, int r) {
	    return 1L * fact[n] * fact_inv[r] % mod * fact_inv[n - r] % mod;
	}

	private long pm(long x, long y, long mod) {
	    long res = 1;
	    x = x % mod;
	    while (y > 0) {
	        if ((y & 1) == 1) res = (res * x) % mod;
	        y = y >> 1;
	        x = (x * x) % mod;
	    }
	    return res;
	}



}


class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
