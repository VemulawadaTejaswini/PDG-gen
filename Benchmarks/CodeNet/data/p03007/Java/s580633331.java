import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		Arrays.sort(a);
		
		long ans[][] = new long[n-1][2];
		long now = a[0];
		for(int i=1;i<n-1;i++) {
			if(a[i+1]>=0) {
				if(now>=a[i]) {
					ans[i-1][0] = a[i];
					ans[i-1][1] = now;
				}
				else {
					ans[i-1][0] = now;
					ans[i-1][1] = a[i];	
				}				
				now = Math.min(a[i] - now,now - a[i]);
			}
			else {
				if(now<a[i]) {
					ans[i-1][0] = a[i];
					ans[i-1][1] = now;
				}
				else {
					ans[i-1][0] = now;
					ans[i-1][1] = a[i];	
				}		
				now = Math.max(a[i] - now,now - a[i]);
			}
		}
		//最後は引き算の大きい方を出力
		if(now >= a[n-1]) {
			ans[n-2][0] = now;
			ans[n-2][1] = a[n-1];
		}
		else {
			ans[n-2][0] = a[n-1];
			ans[n-2][1] = now;
		}
		now = Math.max(a[n-1] - now,now - a[n-1]);
		
		System.out.println(now);
		for(int i=0;i<n-1;i++) {
			System.out.println(ans[i][0] + " " + ans[i][1]);
		}
		
	}

	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
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