import java.util.*;
import java.io.*;

//dpによる解法：この前に半分全列挙で解いた

class Med{
	int a, b, c;

	public Med(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}


public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), ma = fs.nextInt(), mb = fs.nextInt();
		Med ms[] = new Med[n];
		for(int i=0;i<n;i++) {
			int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
			ms[i] = new Med(a,b,c);
		}
		
		int dp[][][] = new int[n+1][410][410];
		int inf = Integer.MAX_VALUE/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<410;j++)for(int k=0;k<410;k++) dp[i][j][k]=inf;
		}
		dp[0][0][0] = 0;
		for(int i=1;i<n+1;i++) {
			int a = ms[i-1].a, b = ms[i-1].b, c = ms[i-1].c;
			for(int j=0;j<405;j++) {
				for(int k=0;k<405;k++) {
					if(j-a<0||k-b<0)continue;
					dp[i][j][k] = Math.min(dp[i-1][j][k], dp[i-1][j-a][k-b] + c);
				}
			}
		}
		
		int ans = inf;
		for(int i=0;i<n;i++) {
			for(int j=0;j<410;j++)for(int k=0;k<410;k++) {
				if(dp[i][j][k]==inf)continue;
				if(i==0&&j==0)continue;
				if(j*mb - k*ma==0) ans = Math.min(ans, dp[i][j][k]);
			}
		}
		if(ans == inf)System.out.println(-1);
		else System.out.println(ans);
		
		
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
