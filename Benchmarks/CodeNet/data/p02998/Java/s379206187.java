import java.util.*;
import java.io.*;

class P{
	int x, y;
	public P(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";
	static int cnt;
	static Set<Integer> xset, yset;
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		P ps[] = new P[n];
		for(int i=0;i<n;i++) {
			int x = fs.nextInt(), y = fs.nextInt();
			ps[i] = new P(x,y);
		}
		Map<Integer,TreeSet<Integer>> mx = new HashMap<>();
		Map<Integer,TreeSet<Integer>> my = new HashMap<>();
		Map<Integer, Boolean> xused = new HashMap<>();
		Map<Integer, Boolean> yused = new HashMap<>();
		for(int i=0;i<n;i++) {
			int x = ps[i].x, y = ps[i].y;
			if(!mx.containsKey(x))mx.put(x,new TreeSet<Integer>());
			mx.get(x).add(y);
			xused.put(x, false);
			if(!my.containsKey(y))my.put(y,new TreeSet<Integer>());
			my.get(y).add(x);
			yused.put(y, false);
		}
		
		long ans = 0;
		for(int key:mx.keySet()) {
			if(xused.get(key))continue;
			xused.put(key,true);
			xset = new HashSet<>();
			yset = new HashSet<>();
			cnt = 0;
			ArrayDeque<Integer> xq = new ArrayDeque<>();
			ArrayDeque<Integer> yq = new ArrayDeque<>();
			xset.add(key);
			xq.add(key);
			while(!xq.isEmpty()) {
				TreeSet<Integer> xt = mx.get(xq.poll());
				for(int y:xt) {
					cnt++;
					if(yused.get(y)) continue;	
					yused.put(y, true);
					yset.add(y);
					yq.add(y);
				}
				while(!yq.isEmpty()) {
					//cnt++;
					TreeSet<Integer> yt = my.get(yq.poll());
					for(int x:yt) {
						if(xused.get(x))continue;
						xused.put(x, true);
						xset.add(x);
						xq.add(x);
					}
				}
			}
			if(xset.size()<=1||yset.size()<=1)continue;
			ans += (long)xset.size() * yset.size() - cnt;
		}
		System.out.println(ans);
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