import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

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
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
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
	 * @param fac[]		: n! mod. p
	 * @param finv[]	: (n!)^(-1) mod. p
	 * @param MAX 		:
	 * @param MOD 		:
	 */

	static void hz_COMinit(long fac[],long finv[], long inv[],final int MAX, final long MOD) {
	    fac[0] = fac[1] = 1L;
	    finv[0] = finv[1] = 1L;
	    inv[1] = 1L;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[(int)(MOD%i)] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
	    }
	}
	/*
	static void hz_COMinit(long fac[], long finv[], long inv[],final int MAX, final long MOD) {
	    fac[0] = fac[1] = 1L;
	    finv[0] = finv[1] = 1L;
	    inv[1] = 1L;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = (BigInteger.valueOf(fac[i - 1]).multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD))).longValue();
	        inv[i] = (BigInteger.valueOf(MOD).subtract(BigInteger.valueOf(inv[(int)(MOD%i)]).multiply(BigInteger.valueOf(MOD/i)).mod(BigInteger.valueOf(MOD)))).longValue();
	        finv[i] = (BigInteger.valueOf(finv[i - 1]).multiply(BigInteger.valueOf(inv[i])).mod(BigInteger.valueOf(MOD))).longValue();
	    }
	}
	*/


	/**
	 * @Compute nCk(二項係数計算) mod. p
	 * @param fac[]		: n! mod. p
	 * @param finv[]	: (n!)^(-1) mod. p
	 * @return 			:nCk(二項係数計算) mod. p
	 */
	static long hz_COM(long fac[],long finv[], int n, int k, final long MOD){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n]*(finv[k]*finv[n - k] %MOD )%MOD;
	}
	/*
	static long hz_COM(long fac[],long finv[], int n, int k, final long MOD){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return BigInteger.valueOf(fac[n])
	    			.multiply(BigInteger.valueOf(finv[k])
	    					.multiply(BigInteger.valueOf(finv[n - k]))
	    					.mod(BigInteger.valueOf(MOD))
	    					)
	    			.mod(BigInteger.valueOf(MOD)).longValue();
	}
	*/

	static long hz_swap(long a, long b){
		if(a >= b) return a;
		else return b;
	}


	public static void main(String[] args){

		solve_abc075_c();
	}
  
	public static void solve_abc075_c(){

		FastScanner sc = new FastScanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		
		int[] a = new int[m + 1];
		int[] b = new int[m + 1];
		
		for(int i=1;i<=m;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i=1;i<=m;i++){
			
			solve_abc075_c_union_find uf = new solve_abc075_c_union_find(n);
			
			for(int j=1;j<=m;j++){
				if(j == i) continue;
				
				uf.unite(a[j], b[j]);
			}
			
			int id = 1;
			int root_1 = uf.findSet(id);
			boolean bridge = false;
			
			for(int j=2;j<=n;j++){
				if(uf.findSet(j) != root_1){
					bridge = true;
					break;
				}
			}
			
			if(bridge) ans++;
		}
		
		System.out.println(ans);
	}

  	public static class solve_abc075_c_union_find{

		int[] par;
		int[] rank;

		public solve_abc075_c_union_find(int size){
			this.par = new int[size + 1];
			this.rank = new int[size + 1];
			makeSet(size);
		}

		public void makeSet(int size){
			for(int i=1;i<=size;i++) par[i] = i;
			Arrays.fill(rank, 0);
		}
		
		public void unite(int x, int y){
			link(findSet(x), findSet(y));
		}
		
		public void link(int x, int y){
			if(rank[x] > rank[y]){
				par[y] = x;
			}
			else{
				par[x] = y;
				if(rank[x] == rank[y]) rank[y]++;
			}
		}

		public boolean same(int x, int y){
			if(findSet(x) == findSet(y)) return true;
			else return false;
		}

		public int findSet(int x){

			if(par[x] == x) return x;
			else return par[x] = findSet(par[x]);
		}
	}

}