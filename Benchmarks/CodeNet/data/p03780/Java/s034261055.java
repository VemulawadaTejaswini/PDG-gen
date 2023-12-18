import java.util.*;
import java.io.*;

public class Main {
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
		
//		long rsum[][] = new long[n+1][5001];
		//累積和にする
		for(int i=0;i<n+1;i++) {
			for(int j=5000;j>=1;j--) {
				rdp[i][j-1] += rdp[i][j];
			}
		}
		
		int ans = 0;
		long dp[][] = new long[2][5001];
		for(int i=0;i<2;i++)Arrays.fill(dp[i], 0L);
		dp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				dp[(i+1)&1][j] += dp[i&1][j];
				if(j+a[i]>5000) {
					dp[(i+1)&1][5000]+=dp[i&1][j];
				}
				else {
					dp[(i+1)&1][j+a[i]]+=dp[i&1][j];
				}
			}	
			long s = 0, t = 0;
			for(int j=0;j<5001;j++) {
				//selfなしでKを超える組み合わせの数
				s += dp[i&1][j] * rdp[n-i-1][(int)Math.max(0,k-j)];
				//selfを必ず使って、 Kを越える組み合わせの数
				t += dp[i&1][j] * rdp[n-i-1][(int)Math.max(0,k-j-a[i])];
			}
			if(s==t)ans++;	
		}
		
		System.out.println(ans);
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


