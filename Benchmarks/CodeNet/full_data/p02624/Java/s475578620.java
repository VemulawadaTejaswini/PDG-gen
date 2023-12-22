import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
	Sieve sv;
	public void solve() {
		int N = ni();
		sv = new Sieve(N);
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			ans += ((long)i * sv.count(i));
//			out.println(" i = " + i + "  count = " + sv.count(i));
		}
		out.println(ans);
	}
    //-----------------------------------												
    // 多くの数を素因数分解する場合に使うクラス												
    //-----------------------------------												
    class Sieve {												
    	int n;											
    	int[] f;					// エラトステネスの篩(ふるい）の変形（割った素数を保存する）						
    	List<Integer> primes = new ArrayList<>();					// 素数の配列						
    												
    	// 初期化　n 以下の数を素数判定する　→　これを作るのは１回だけ											
    	public Sieve(int n) {											
    		this.n = n;										
    		f = new int[n+10];										
    		for (int i = 0; i < f.length; i++) {										
			f[i] = i;					// 初期値として全て素数とする				
		}										
    		f[0] = f[1] = -1;						// ０，１は素数でない				
    		for(int i = 2; i*i <= n; i++) {										
    			if(f[i] != i)		continue;			// 素数でない				
    			primes.add(i);					// 素数を保存				
    			for (int j = i*i; j <= n; j += i) {									
				if(f[j] == j)		f[j] = i;		// 割った素数を保存（最初に割った素数）				
			}									
    		}										
    	}											
    	// 素数判定											
    	boolean isPrime(int x) {											
    		return f[x] == x;										
    	}											
    	// 素因数分解　引数  12 --> 2 * 2 * 3　３つ素数がセットされたリストを返す											
    	long count(int arg) {											
    		int x = arg;										
    		long ans = 1;
    		int cnt = 0, sv = -1;
    		while(x != 1) {										
    			if(f[x] == sv)	cnt++;
    			else {
    				ans *= (cnt+1);
    				cnt = 1;
    				sv = f[x];
    			}
    			if(f[x] == 0) {									
//    				out.println("zero devide  x = " + x + "  arg = " + arg);								
    				x = 1;								
    			} else {									
    				x /= f[x];								
    			}									
    		}										
    		if(cnt != 0)	ans *= (cnt+1);
    		return ans;										
    	}											
    	List<Integer> factorList(int arg) {											
    		int x = arg;										
    		List<Integer> ans = new ArrayList<>();										
    		while(x != 1) {										
    			ans.add(f[x]);									
    			if(f[x] == 0) {									
//    				out.println("zero devide  x = " + x + "  arg = " + arg);								
    				x = 1;								
    			} else {									
    				x /= f[x];								
    			}									
    		}										
    		return ans;										
    	}											
    	// 素因数分解　引数　12 --> 2 * 2 * 3  Map で　(2, 2) (3, 1) を返す											
    	Map<Integer, Integer> factor(int x) {											
    		Map<Integer, Integer> ans = new HashMap<>();										
    		List<Integer> flist = factorList(x);										
    		if(flist.size() == 0)	return ans;									
    		for(int p : flist) {										
    			ans.merge(p, 1, Integer::sum);									
    		}										
    		return ans;										
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
