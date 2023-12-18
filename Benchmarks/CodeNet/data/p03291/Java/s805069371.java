import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String S = fs.next();
		int len = S.length();
		long dp[][] = new long[len][3];
		int qcnt = 0;
		if(S.charAt(0)=='A') dp[0][0]=1;
		if(S.charAt(0)=='B') dp[0][1]=1;
		if(S.charAt(0)=='C') dp[0][2]=1;
		if(S.charAt(0)=='?') {
			dp[0][0] = 1;
			qcnt++;
		}
		for(int i=1;i<len;i++) {
			if(S.charAt(i)=='A') {
				dp[i][0]=dp[i-1][0] + modpow(3,qcnt);
				dp[i][0]%=mod;
				dp[i][1]=dp[i-1][1];
				dp[i][2]=dp[i-1][2];
				
			}
			if(S.charAt(i)=='B') {
				dp[i][1]=dp[i-1][1] + dp[i-1][0];
				dp[i][1]%=mod;
				dp[i][0]=dp[i-1][0];
				dp[i][2]=dp[i-1][2];

			}
			if(S.charAt(i)=='C') {
				dp[i][2]=dp[i-1][2] + dp[i-1][1];
				dp[i][2]%=mod;
				dp[i][0]=dp[i-1][0];
				dp[i][1]=dp[i-1][1];
			}
			if(S.charAt(i)=='?') {
				
				dp[i][0]=3 * dp[i-1][0] %mod + modpow(3,qcnt);
				dp[i][1]=3 * dp[i-1][1] %mod + dp[i-1][0];
				dp[i][2]=3 * dp[i-1][2] %mod + dp[i-1][1];	
				dp[i][0]%=mod;
				dp[i][1]%=mod;
				dp[i][2]%=mod;
				
				qcnt++;
			}
		}
		System.out.println(dp[len-1][2]);
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