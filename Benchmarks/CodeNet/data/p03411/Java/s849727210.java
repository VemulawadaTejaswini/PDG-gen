import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = {-1,-1,-1,0,0,1,1,1}, DY8 = {-1,0,1,-1,1,-1,0,1};
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int red[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			int a = fs.nextInt(), b = fs.nextInt();
			red[i][0] = a; red[i][1] = b;
		}
		int blue[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			int c = fs.nextInt(), d = fs.nextInt();
			blue[i][0] = c; blue[i][1] = d;
		}
		
		int cnt = 0;
		Arrays.sort(red, (r1,r2)->r1[0]-r2[0]);
		Arrays.sort(blue, (r1,r2)->r1[0]-r2[0]);
		
		boolean used[] = new boolean[n];
		
		for(int i=n-1;i>=0;i--) {
			int bx = blue[i][0], by = blue[i][1];
			for(int j=n-1;j>=0;j--) {
				if(used[j])continue;
				int rx = red[j][0], ry = red[j][1];
				if(rx<bx&&ry<by) {
					used[j] = true;
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		
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