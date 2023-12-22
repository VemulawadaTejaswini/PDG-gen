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
	// ======================================================================
	int H, W, SH, SW, GH, GW;
	char[][] C;
	boolean[][] F;
	Deque<PPKEY> DQ = new ArrayDeque();
	int[][] d = { {-1, 0}, {0, -1}, {0, 1}, {1, 0} };
	boolean check(int sh, int sw) {
//		out.println("check : sh = " + sh + "  sw = " + sw);
		if(sh == GH && sw == GW)	return true;
		DQ.clear();
		DQ.addLast(new PPKEY(sh, sw));
		PPKEY pp;
		int h, w;
		while(!DQ.isEmpty()) {
			pp = DQ.pollFirst();
			for (int i = 0; i < 4; i++) {
				h = pp.key + d[i][0];
				w = pp.val + d[i][1];
				if(h < 0 || h >= H || w < 0 || w >= W)	continue;
				if(h == GH && w == GW)					return true;
				if(C[h][w] == '#' || F[h][w])			continue;
				F[h][w] = true;
				setUsed.add(new PPKEY(h, w));
				DQ.addLast(new PPKEY(h, w));
			}
		}
		return false;
	}
	Set<PPKEY> setUsed = new HashSet();
	Set<PPKEY> set = new HashSet();
	public void solve() {
		H = ni();		W = ni();
		SH = ni()-1;	SW = ni()-1;
		GH = ni()-1;	GW = ni()-1;
		C = new char[H][];
		for (int i = 0; i < H; i++)		C[i] = ns().toCharArray();
		F = new boolean[H][W];
		set.add(new PPKEY(SH, SW));
		int h, w;
		for (int i = 0; ; i++) {
			setUsed.clear();
			for(PPKEY pp : set) {
				h = pp.key;		w = pp.val;
				F[h][w] = true;
				setUsed.add(new PPKEY(h, w));
				if(check(h, w)) {
					out.println(i);
					return;
				}
			}
			set.clear();
			for(PPKEY pp : setUsed) {
				h = pp.key;		w = pp.val;
				for (int j = -2; j <= 2; j++) {
					for (int j2 = -2; j2 <= 2; j2++) {
						if(h+j < 0 || h+j >= H 
							|| w+j2 < 0 || w+j2 >= W)			continue;
						if(C[h+j][w+j2] == '#' || F[h+j][w+j2])	continue;
						set.add(new PPKEY(h+j, w+j2));
					}
				}
			}
			if(set.isEmpty())	break;
			setUsed.clear();
		}
		out.println("-1");
	}
	// HashMap のキーに使う　→　Set に入れるのもこれ（PPでは値での比較が行われない）
	public class PPKEY{
		private final int key, val;
		public PPKEY(int key, int val) {
			this.key = key;
			this.val = val;
		}
		public int getKey() {
			return key;
		}
		public int getVal() {
			return val;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof PPKEY) {
				PPKEY dest = (PPKEY) obj;
				return this.key == dest.key && this.val == dest.val;
			} else {
				return false;
			}
		}
		@Override
		public int hashCode() {
			return Objects.hash(key, val);
		}
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
