import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	/**
	 * Compute n! mod. p, (n!)^(-1) mod.p
	 *
	 * @param fac[]
	 *            : n! mod. p
	 * @param finv[]
	 *            : (n!)^(-1) mod. p
	 * @param MAX
	 *            :
	 * @param MOD
	 *            :
	 */

	static void hz_COMinit(long fac[], long finv[], long inv[], final int MAX, final long MOD) {
		fac[0] = fac[1] = 1L;
		finv[0] = finv[1] = 1L;
		inv[1] = 1L;
		for (int i = 2; i < MAX; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[(int) (MOD % i)] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	/*
	 * static void hz_COMinit(long fac[], long finv[], long inv[],final int MAX,
	 * final long MOD) { fac[0] = fac[1] = 1L; finv[0] = finv[1] = 1L; inv[1] =
	 * 1L; for (int i = 2; i < MAX; i++){ fac[i] = (BigInteger.valueOf(fac[i -
	 * 1]).multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD))).
	 * longValue(); inv[i] =
	 * (BigInteger.valueOf(MOD).subtract(BigInteger.valueOf(inv[(int)(MOD%i)]).
	 * multiply(BigInteger.valueOf(MOD/i)).mod(BigInteger.valueOf(MOD)))).
	 * longValue(); finv[i] = (BigInteger.valueOf(finv[i -
	 * 1]).multiply(BigInteger.valueOf(inv[i])).mod(BigInteger.valueOf(MOD))).
	 * longValue(); } }
	 */

	/**
	 * @Compute nCk(二項係数計算) mod. p
	 * @param fac[]
	 *            : n! mod. p
	 * @param finv[]
	 *            : (n!)^(-1) mod. p
	 * @return :nCk(二項係数計算) mod. p
	 */
	static long hz_COM(long fac[], long finv[], int n, int k, final long MOD) {
		if (n < k)
			return 0;
		if (n < 0 || k < 0)
			return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
	/*
	 * static long hz_COM(long fac[],long finv[], int n, int k, final long MOD){
	 * if (n < k) return 0; if (n < 0 || k < 0) return 0; return
	 * BigInteger.valueOf(fac[n]) .multiply(BigInteger.valueOf(finv[k])
	 * .multiply(BigInteger.valueOf(finv[n - k])) .mod(BigInteger.valueOf(MOD))
	 * ) .mod(BigInteger.valueOf(MOD)).longValue(); }
	 */

	static int hz_swap(int a, int b) {
		if (a >= b)
			return a;
		else
			return b;
	}

	static long hz_swap(long a, long b) {
		if (a >= b)
			return a;
		else
			return b;
	}

	// mod上での差分
	static long hz_modSub(long a, long b, long mod) {
		long v = a - b;
		if (v < 0)
			v += mod;
		return v % mod;
	}

	// mod上での割算
	static long hz_modDiv(long a, long b, long mod) {
		return (a % mod) * hz_modInv(b, mod) % mod;
	}

	// 逆元
	static long hz_modInv(long a, long mod) {
		return hz_modPow(a, mod - 2L, mod);
	}

	// mod上での累乗
	static long hz_modPow(long n, long k, long mod) {

		long result = 1L;

		// k を右シフトしつつ n を 2 乗していく
		while (k > 0L) {
			// k の最下ビットが 1 なら、今の n を答えに掛ける
			if ((k & 1L) == 1L)
				result = (result * n) % mod;
			n = n * n % mod;
			k >>= 1L;
		}

		return result;
	}

	// Union Find Tree
	static class HZ_UF {

		public int[] par;
		public int[] rank;

		public HZ_UF(int n) {
			this.par = new int[n + 1];
			this.rank = new int[n + 1];

			Arrays.fill(par, -1);
			Arrays.fill(rank, 0);
		}

		public void unite(int x, int y) {
			link(root(x), root(y));
		}

		public boolean link(int x, int y) {
			if (x == y)
				return false;
			if (rank[x] > rank[y]) {
				par[x] += par[y];
				par[y] = x;
			} else {
				par[y] += par[x];
				par[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
			return true;
		}

		public boolean isSame(int x, int y) {
			return root(x) == root(y);
		}

		public int root(int x) {
			if (par[x] < 0)
				return x;
			else
				return x = root(par[x]);
		}

		public int size(int x) {
			return -par[root(x)];
		}
	}

	public static void main(String[] args) {

		solve_abc176_d();
	}
  
  	public static void solve_abc176_d() {

		FastScanner sc = new FastScanner(System.in);
		
		int[][] warp = new int[1001][1001];
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int ch = sc.nextInt();
		int cw = sc.nextInt();
		int dh = sc.nextInt();
		int dw = sc.nextInt();
		
		for(int i=1;i<=h;i++){
			String s = sc.next();
			for(int j=1;j<=w;j++){
				if(s.charAt(j-1) ==  '.'){
					warp[i][j] = Integer.MAX_VALUE;
				}
				else{
					warp[i][j] =-1;
				}
			}
		}
		
		PriorityQueue<solve_abc176_d_pos> pq
			= new PriorityQueue<>((p1,p2)->Integer.compare(p1.num,p2.num));
		
		solve_abc176_d_pos start = new solve_abc176_d_pos(0, ch, cw);
		
		pq.offer(start);
		warp[ch][cw] = 0;
		
		while(!pq.isEmpty()){
			
			solve_abc176_d_pos now = pq.poll(); 
			
			int x0 = now.x;
			int x1 = now.x - 1;
			int x2 = now.x + 1;
			int y0 = now.y;
			int y1 = now.y - 1;
			int y2 = now.y + 1;
			
			int numWarpNow = now.num;
			
			//System.out.println(x0 + "\t" + y0 + "\t" + numWarpNow);
			
			if(x1 >= 1 && warp[x1][y0] > numWarpNow){
				warp[x1][y0] = warp[x0][y0];
				pq.offer(new solve_abc176_d_pos(numWarpNow, x1, y0));
			}
			if(x2 <= h  && warp[x2][y0] > numWarpNow){
				warp[x2][y0] = warp[x0][y0];
				pq.offer(new solve_abc176_d_pos(numWarpNow, x2, y0));
			}
			if(y1 >= 1 && warp[x0][y1] > numWarpNow){
				warp[x0][y1] = warp[x0][y0];
				pq.offer(new solve_abc176_d_pos(numWarpNow, x0, y1));
			}
			if(y2 <= w  && warp[x0][y2] > numWarpNow){
				warp[x0][y2] = warp[x0][y0];
				pq.offer(new solve_abc176_d_pos(numWarpNow, x0, y2));
			}
			
			for(int i=-2;i<=2;i++){
				if(!((x0+i >= 1) && (x0+i <= h))) continue;
				for(int j=-2;j<=2;j++){
					if(!((y0+j >= 1) && (y0+j <= w))) continue;
					
					if(warp[x0+i][y0+j] > numWarpNow + 1){
						warp[x0+i][y0+j] = numWarpNow + 1;
						pq.offer(new solve_abc176_d_pos(numWarpNow+1, x0+i, y0+j));
					}
				}
			}
			
		}
		
		if(warp[dh][dw] == Integer.MAX_VALUE) warp[dh][dw] = -1;
		
		System.out.println(warp[dh][dw]);
		
		//while pq != isEmpty
		
		// pos = pq.poll
		
		//if  warp[x+1][y] > warp
			// warp[x+1][y] = warp
			// pq.offer(pos);
		
		// for i = -2 ,+2
			//for j = -2 to +2
				//if warp[x+i][y+j] > warp
		
	}
	
	public static class solve_abc176_d_pos{
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		solve_abc176_d_pos(int num, int x, int y){
			this.num = num;
			this.x = x;
			this.y = y;
		};
		int num;
		int x;
		int y;
	}
	
}