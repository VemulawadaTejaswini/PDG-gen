import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;

    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = sc.nextIntArray(n);
        int[] t = sc.nextIntArray(m);
        
        System.out.println(solve(s,t));
    }
    
	static long solve(int[] x, int[] y){
		long[][] dp = new long[x.length+1][y.length+1]; //xのi+1文字目とyのj+1文字目までを使ったときのCSの数
		
		for(int i=0;i<x.length+1;i++){
			dp[i][0] = 1;
		}
		for(int i=0;i<y.length+1;i++){
			dp[0][i] = 1;
		}
		
		for(int i=1;i<x.length+1;i++){
			for(int j=1;j<y.length+1;j++){
				if(x[i-1] == y[j-1]){ //indexがテーブルとズレている
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
					dp[i][j] %= mod;
				}
				else{
					dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
					dp[i][j] %= mod;
				}
			}
		}
		
		return mod(dp[x.length][y.length],mod);
	}

	//負の数に対応したmod
	static long mod(long a, long mod) {
		return (a % mod + mod) % mod;
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
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}