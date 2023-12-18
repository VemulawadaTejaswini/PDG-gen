import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	int MOD = 998244353;
	
	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int n = fs.nextInt();
		int[][] pts = new int[n][2];
		int[] x = new int[n], y = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = fs.nextInt();
			y[i] = fs.nextInt();
			pts[i][0] = x[i];
			pts[i][1] = y[i];
		}
		HashMap<Integer, Integer> mapX = new HashMap<>(), mapY = new HashMap<>();
		Arrays.sort(x); Arrays.sort(y);
		for(int a : x) mapX.put(a, mapX.size());
		for(int a : y) mapY.put(a, mapY.size());
		for(int i = 0; i < n; i++) {
			pts[i][0] = mapX.get(pts[i][0]);
			pts[i][1] = mapY.get(pts[i][1]);
		}

		Arrays.sort(pts, (a, b) -> Integer.compare(a[0], b[0]));
		int[][] regions = new int[4][n];
		
		int m = mapY.size();
		BIT ys = new BIT(m);
		for(int i = 0; i < n; i++) {
			int above = ys.sum(m)-ys.sum(pts[i][1]+1);
			int below = ys.sum(pts[i][1]);
			regions[0][i] = above;
			regions[2][i] = below;
			ys.upd(pts[i][1]+1, 1);
		}
		Arrays.fill(ys.tree, 0);
		for(int i = n-1; i >= 0; i--) {
			int above = ys.sum(m)-ys.sum(pts[i][1]+1);
			int below = ys.sum(pts[i][1]);
			regions[1][i] = above;
			regions[3][i] = below;
			ys.upd(pts[i][1]+1, 1);
		}
		
		int[] pow2 = new int[n+1];
		pow2[0] = 1;
		for(int i = 1; i <= n; i++) {
			pow2[i] = (2*pow2[i-1])%MOD;
		}
		
		int res = 0;
		for(int i = 0; i < n; i++) {
			int add = 0;
			int A = regions[0][i], B = regions[1][i];
			int C = regions[2][i], D = regions[3][i];
			int v1 = mult(sub(pow2[A+B], 1), sub(pow2[C+D], 1));
			v1 = mult(2, v1);
			add = add(add, v1);
			add = add(add, sub(pow2[A+B], 1));
			add = add(add, sub(pow2[C+D], 1));
			add = add(add, 1);
			
			v1 = mult(sub(pow2[B], 1), sub(pow2[D], 1));
			add = sub(add, v1);
			
			v1 = mult(sub(pow2[A], 1), sub(pow2[C], 1));
			add = sub(add, v1);
			
			res = add(res, add);
		}
		
		out.println(res);
		
		out.close();
	}
	
	int mult(long a, long b) {
		return (int)(a*b%MOD);
	}
	
	int sub(int a, int b) {
		a -= b;
		if(a < 0) a += MOD;
		return a;
	}
	
	int add(int a, int b) {
		a += b;
		if(a >= MOD) a -= MOD;
		return a;
	}

	class BIT {
		int n, log;
		int[] tree;
		BIT(int a) {
			n = a;
			log = Integer.numberOfTrailingZeros(Integer.highestOneBit(n))+1;
			tree = new int[n+1];
		}
		int sum(int i) {
			int res = 0;
			while(i > 0) {
				res += tree[i];
				i -= i &-i;
			}
			return res;
		}
		void upd(int i, long v) {
			while(i <= n) {
				tree[i] += v;
				i += i & -i;
			}
		}
		int walk(long sum) {
			long cur = 0;
			int idx = 0;
			for(int i = log; i >= 0; i--) {
				if(idx+(1<<i) > n) continue;
				int nxt = idx+(1<<i);
				if(cur+tree[nxt] < sum) {
					cur += tree[nxt];
					idx = nxt;
				}
			}
			return idx+1;
		}
	}
	
	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}
		
	}

}