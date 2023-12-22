import java.util.*;
import java.io.*;

class SegmentTree{
	int n;
	long node[], lazy[];
	SegmentTree(int m){
		n = 1;
		while(n<m) {
			n<<=1;
		}
		node = new long[2*n-1];
		lazy = new long[2*n-1];
	}
		
	void add(int a, int b, int x, int k, int l, int r) {
		if(r < 0) r = n;//初期呼び出し用
		
		eval(k, l, r);//ここでなぜ必要？
		if(r<=a || b<=l) {
			return;
		}
		if(a<=l&&r<=b) {
			lazy[k] += x * (r - l);
			eval(k, l, r);//なぜ必要？
			return;
		}
		add(a, b, x, 2*k+1,l, (l+r)/2);
		add(a, b, x, 2*k+2,(l+r)/2, r);
		node[k] = node[2*k+1] + node[2*k+2];
	}
	
	long getSum(int a, int b, int k, int l, int r) {
		if(r<0) r = n;
		if(r<=a||b<=l) return 0;
		eval(k, l, r);
		if(a<=l&&r<=b) {
			return node[k];
		}
		long vl = getSum(a, b, 2*k+1, l, (l+r)/2);
		long vr = getSum(a, b, 2*k+2, (l+r)/2, r);
		return vl + vr;
	}
	
	void eval(int k, int l, int r) {
		if(lazy[k]!=0) {
			node[k] += lazy[k];
			if(r - l > 1) {
				lazy[2*k+1] += lazy[k]/2;
				lazy[2*k+2] += lazy[k]/2;
			}
		}
		lazy[k] = 0;
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
		SegmentTree st = new SegmentTree(n);
		for(int i=0;i<q;i++) {
			int a = fs.nextInt();
			if(a==0) {
				//区間加算
				int s = fs.nextInt()-1, t = fs.nextInt()-1, x = fs.nextInt();
				st.add(s, t+1, x, 0, 0, -1);
			}
			else {
				//区間最大値
				int s = fs.nextInt()-1, t = fs.nextInt()-1;
				long ans = st.getSum(s, t+1, 0, 0, -1);
				System.out.println(ans);
			}
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
