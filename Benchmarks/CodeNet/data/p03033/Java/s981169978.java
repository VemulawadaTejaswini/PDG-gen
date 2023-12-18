import java.util.*;
import java.io.*;

class Person{
	int id, d;

	public Person(int id, int d) {
		super();
		this.id = id;
		this.d = d;
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), q = fs.nextInt();
		int ans[] = new int[q];
		Arrays.fill(ans, -1);
		int rw[][] = new int[n][3];
		for(int i=0;i<n;i++) {
			int s = fs.nextInt(), t = fs.nextInt(), x = fs.nextInt();
			rw[i][0] = s; rw[i][1] = t-1; rw[i][2] = x;
		}
		
		TreeSet<Person> ts = new TreeSet<>((p1,p2)->p1.d - p2.d);
		for(int i=0;i<q;i++) {
			int d = fs.nextInt();
			ts.add(new Person(i, d));
		}
		
		Arrays.sort(rw,(r1, r2)->r1[2] - r2[2]);
		
		for(int i=0;i<n;i++) {
			int s = rw[i][0], t = rw[i][1], x = rw[i][2];
			boolean ok = true;
			while(ok) {
				ok = false;
				Person p = ts.ceiling(new Person(n, s-x));
				if(p.d <= t - x) {
					ts.remove(p);
					ans[p.id] = x;
					ok = true;
				}
			}
		}
		for(int i=0;i<q;i++) {
			System.out.println(ans[i]);
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