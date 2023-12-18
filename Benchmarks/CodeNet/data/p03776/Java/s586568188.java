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
	Map<Long, Integer> map = new TreeMap<>(Collections.reverseOrder());
	public void solve() {
		int N = ni();
		int A = ni();
		int B = ni();
		long v;
		for (int i = 0; i < N; i++) {
			v = nl();
			map.merge(v, 1, Integer::sum);
		}
		double avg = 0, wk;
		long ans = 0, comCnt;
		int cnt, val;
		make_comb_dp(50);
		for (int i = A; i <= B; i++) {
			cnt = i;
			wk = 0;
			comCnt = 1;
			for(long key : map.keySet()) {
				val = map.get(key);
				if(val >= cnt) {
					wk += key * cnt;
					comCnt = combination(val, cnt); 
					break;
				}
				wk += key * val;
				cnt -= val;
			}
			wk /= i;
			if(avg < wk) {
				avg = wk;
				ans = comCnt;
			} else if(avg == wk) {
				ans += comCnt;
//				out.println(" i = " + i + "  comCnt = " + comCnt + "  ans = " + ans);
			}
		}
		out.println(String.format("%.7f", avg));
		out.println(ans);
	}
	
	// パスカルの三角形を作る				
	long[][] dp;				
	public void make_comb_dp(int n) {				
	    dp = new long[n+1][n+1];				
	    for(int i = 0; i < n+1; i++) {				
	        dp[i][0] = 1L;				
	        dp[i][i] = 1L;				
	    }				
	    for(int i = 2; i < n+1; i++) {				
		    for(int j = 1; j < i; j++) {			
	            dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];				
		    }			
	    }
	    initFlag = true;
	}				
	// 二項係数を返す				
	boolean initFlag = false;				
	public long combination(int n, int k) {				
		if(!initFlag){			
			make_comb_dp(n);		
			initFlag = true;		
		}			
		return(dp[n][k]);			
	}				

	// ------------------------------------------
	// ライブラリ
	// ------------------------------------------
	// Print
	private PrintWriter out = new PrintWriter(System.out);

	// Scanner
	private FastScanner scan = new FastScanner();

	int ni() {
		return scan.nextInt();
	}

	int[] ni(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
		return a;
	}

	int[][] ni(int y, int x) {
		int[][] a = new int[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ni();
			}
		}
		return a;
	}

	long nl() {
		return scan.nextLong();
	}

	long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nl();
		}
		return a;
	}

	long[][] nl(int y, int x) {
		long[][] a = new long[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = nl();
			}
		}
		return a;
	}

	String ns() {
		return scan.next();
	}

	String[] ns(int n) {
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = ns();
		}
		return a;
	}

	String[][] ns(int y, int x) {
		String[][] a = new String[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ns();
			}
		}
		return a;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

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
