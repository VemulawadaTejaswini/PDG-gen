import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	
	static int n;
	static long x, ans;
	static long thick[], pnum[];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		x = fs.nextLong();

		thick = new long[51];
		thick[0] = 1;
		for(int i=0;i<50;i++) {
			thick[i+1] = 2 * thick[i] + 3;
		}
		
		pnum = new long[51];
		pnum[0] = 1;
		for(int i=0;i<50;i++) {
			pnum[i+1] = 2 * pnum[i] + 1;
		}
	
		dfs(x, n);
		System.out.println(ans);
	}
	static void dfs(long x, int l) {
		if(x == 1) {
			if(l==0)ans++;
			return;
		}
		if(x == thick[l]) {
			ans += pnum[l];
			return;
		}
		if(x >= (thick[l]+1)/2) {
			ans += pnum[l-1]; 
			ans += 1;
			if(x == (thick[l]+1)/2) return;
			dfs(x- (thick[l]+1)/2, l-1);
		}
		else {
			dfs(x-1, l-1);
		}
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