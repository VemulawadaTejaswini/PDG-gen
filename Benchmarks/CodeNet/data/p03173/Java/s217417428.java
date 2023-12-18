import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		
		long sum[] = new long[n+1];
		for(int i=0;i<n;i++)sum[i+1]=sum[i]+a[i];
		
		long dp[][] = new long[404][404];
		long inf = Long.MAX_VALUE/3;
		for(int i=0;i<404;i++)for(int j=0;j<404;j++) {
			if(i==j)dp[i][j]=0;
			else dp[i][j]=inf;
		}
		for(int i=0;i<402;i++) {//区間の幅
			for(int j=0;j<402;j++) {
				if(j+i>=n)break;
				for(int k=j;k<j+i;k++) {
					dp[j][j+i] = Math.min(dp[j][j+i],dp[j][k] + dp[k+1][j+i] + sum[j+i+1] - sum[j]);
				}
			}
		}
		System.out.println(dp[0][n-1]);
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