import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int field[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				field[i][j] = fs.nextInt();
			}
		}
		int s = field[0][0] + field[1][1] + field[2][2];
		int t = field[0][1] + field[1][2] + field[2][0];
		int u = field[0][2] + field[1][0] + field[2][1];
		if(s == t && t == u)System.out.println("Yes");
		else System.out.println("No");
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