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
		// int t = reader.ni();
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	long mod = (long)1e9+7;
	private void run_case() {
		int n = reader.ni();
		int m = reader.ni();

		long res = 0;
		long[] cnt = new long[m+1];

		for (int i=m; i>=1; i--) {
			cnt[i] = power_mod(m / i, n, mod);
			for (int j=i+i; j<=m; j+=i) {
				cnt[i] = add(cnt[i], mod - cnt[j], mod);
			}
			res = add(res, 1L * cnt[i] * i % mod, mod);
		}

		System.out.println(res);
		return;
	}

	private long power_mod(long x, long y, long mod) {
	    long res = 1;
	    x = x % mod;
	    while (y > 0) {
	        if ((y & 1) == 1) res = (res * x) % mod;
	        y = y >> 1;
	        x = (x * x) % mod;
	    }
	    return res;
	}

	private long add(long a, long b, long mod) {
		a += b;
		a %= mod;
		return a;
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
