import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		main.out.close();
	}
	// ======================================================================
	final long MOD = (int)(1e9) + 7;
	PriorityQueue<PP> PQ1 = new PriorityQueue<PP>(comparing(PP::getKey, reverseOrder())); 
	PriorityQueue<PP> PQ2 = new PriorityQueue<PP>(comparing(PP::getKey)); 
	public void solve() {
		int N = ni();
		int K = ni();
		int a;
		PP pp;
		boolean f = true;
		for (int i = 0; i < N; i++) {
			a = ni();
			pp = new PP(Math.abs(a), a);
			PQ1.add(pp);
			PQ2.add(pp);
			if(a >= 0)	f = false;
		}
		long ans = 1;
		if(f && K % 2 == 1) {	// マイナスになるので絶対値が小さいものを選ぶ
			while(K > 0) {
				ans = ((ans * PQ2.poll().key) % MOD);
				K--;
			}
			ans = (MOD - ans) % MOD;
			out.println(ans);
			return;
		}
		int minM = -(int)(1e9)+10;
		int minP = (int)(1e9)+10;
		int key, val;
		while(K > 0) {
			pp = PQ1.poll();
			key = pp.key;	// 絶対値
			val = pp.val;	// 値
			if(val == 0) {
				out.println(0);
				return;
			}
			ans = (ans * val) % MOD;
			if(val < 0) {
				minM = (key < Math.abs(minM) ? val : minM);
			} else {
				minP = (key < Math.abs(minP) ? val : minP);
			}
			K--;
		}
		if(ans >= 0) {
			out.println(ans);
			return;
		}
		int maxM = 0, maxP = 0;
		while(!PQ1.isEmpty()) {
			pp = PQ1.poll();
			if(pp.val > maxM)	maxM = pp.val;
			if(pp.val < maxP)	maxP = pp.val;
		}
		long ans1 = (((((ans * modinv(minM, MOD)) % MOD) * maxP) % MOD) + MOD) % MOD;
		long ans2 = (((((ans * modinv(minP, MOD)) % MOD) * maxM) % MOD) + MOD) % MOD;
		out.println(ans1 > ans2 ? ans1 : ans2);
	}
	// Set に入れるなら　PPKEY　を使う！
	class PP {
		public int key, val;
		public PP(int key, int val) {
			this.key = key;
			this.val = val;
		}
		public int getKey() {			return key;		}
		public void setKey(int key) {	this.key = key;	}
		public int getVal() {			return val;		}
		public void setVal(int val) {	this.val = val;	}
	}
	// a の mod m での逆元を返す
	long modinv(long a, long m) {
		long b = m, u = 1, v = 0, wk;
		while (b > 0) {
			long t = a / b;
			a -= t * b; wk = a; a = b; b = wk;
			u -= t * v; wk = u; u = v; v = wk;
		}
		u %= m; 
		if (u < 0) u += m;
		return u;
	}

	// ------------------------------------------
	// ライブラリ
	// ------------------------------------------
	// Print
	private PrintWriter out = new PrintWriter(System.out);
	
	// Scanner
	private FastScanner scan = new FastScanner();
	int ni(){ return scan.nextInt();}
	int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
	int[][] ni(int y, int x){int[][] a = new int[y][x];
	for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
	long nl(){return scan.nextLong();}
	long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
	long[][] nl(int y, int x){long[][] a = new long[y][x];
	for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
	String ns(){return scan.next();}
	String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
	String[][] ns(int y, int x){String[][] a = new String[y][x];
	for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
}
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}
