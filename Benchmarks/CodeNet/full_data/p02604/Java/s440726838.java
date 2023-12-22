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
	// =====================================================================
	final long INF = (long)(1e18);
	int N;
	int[] X, Y, P;
	TreeSet<Integer> setX = new TreeSet();
	TreeSet<Integer> setY = new TreeSet();
	long calc() {
		long ans = 0, lenX, lenY;
		Integer wk;
		for (int i = 0; i < N; i++) {
			if(setX.contains(X[i]) || setY.contains(Y[i]))	continue;
			// Ｘ方向の距離
			wk = setX.higher(X[i]);
			lenX = Math.abs((wk == null ? INF : wk) - X[i]);
			wk = setX.lower(X[i]);
			lenX = Math.min(lenX, Math.abs((wk == null ? INF : wk) - X[i]));
			// Ｙ方向の距離
			wk = setY.higher(Y[i]);
			lenY = Math.abs((wk == null ? INF : wk) - Y[i]);
			wk = setY.lower(Y[i]);
			lenY = Math.min(lenY, Math.abs((wk == null ? INF : wk) - Y[i]));
			ans += Math.min(lenX*P[i], lenY*P[i]);
		}
		return ans;
	}
	public void solve() {
//		long start = System.currentTimeMillis();
//		out.println("-- start --");
//		long mid = start, end;

		N = ni();
		X = new int[N];
		Y = new int[N];
		P = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = ni();
			Y[i] = ni();
			P[i] = ni();
		}
		int cnt;
		long ans, wcnt1=0, wcnt2;
		
		for (int k = 0; k <= N; k++) {		// 15

//			end = System.currentTimeMillis();
//			out.println(" 2 --> time  " + (end - mid) + " ms");
//			mid = end;

			ans = INF;
			wcnt2 = 0;
			for (int i = 0; i < (int)(1 << N); i++) {
				if(Integer.bitCount(i) != k)	continue;
				for (int j = 0; j < (int)(1<<k); j++) {		// Ｘ固定で引く　／　Ｙ固定で引く　の組み合わせ
					setX.clear();	setX.add(0);
					setY.clear();	setY.add(0);
					cnt = 0;
					for (int j2= 0; j2 < N; j2++) {
						if((i & (int)(1<<j2)) == 0)		continue;
						if((j & (int)(1<<cnt)) == 0)	setX.add(X[j2]);
						else							setY.add(Y[j2]);
						cnt++;
					}
					ans = Math.min(ans, calc());
					wcnt2++;
				}
			}
			out.println(ans);
//			out.println(" 処理回数　　" + wcnt2);
			wcnt1 += wcnt2;
		}
//		end = System.currentTimeMillis();
//		out.println(" 処理回数のトータル　　" + wcnt1);
//		out.println(" --> time  " + (end - start) + " ms");
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
