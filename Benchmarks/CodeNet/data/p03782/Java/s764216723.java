import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
       	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = sc.nextintArray(n);
        
        int ans = lowerBound(1,0,n-1,a,k);
        
        out.println(ans);
        out.flush();
    }
    
    static int isNeed(int r, int[] a, int k){
    	if(k-a[r] <= 0){
    		return 1;
    	}
    	int save = a[r];
    	a[r] = 0;
    	
    	boolean[][] dp = new boolean[a.length][k];
    	
    	dp[0][0] = true;
    	if(a[0] < k){
        	dp[0][a[0]] = true;
    	}
    	
    	for(int i=1;i<a.length;i++){
    		for(int j=0;j<k-save;j++){
    			if(dp[i-1][j]){
    				dp[i][j] = true;
    			}
    			else if(j-a[i]>=0 && dp[i-1][j-a[i]]){
    				dp[i][j] = true;
    			}
    		}
    		for(int j=k-save;j<k;j++){
    			if(dp[i-1][j]){
    	        	a[r] = save;
            		return 1;
    			}
    			else if(j-a[i]>=0 && dp[i-1][j-a[i]]){
    	        	a[r] = save;
            		return 1;
    			}
    		}
    	}
    	//なし
    	a[r] = save;
    	return 0;
    }
    
	static int lowerBound(long key, int from, int to, int[] a, int k){
		if(from == to){
			if(isNeed(from,a,k)<key){
				return from+1;
			}
			else{
				return from;
			}
		}
		int m = (from+to+1)/2;	//オーバーフロー対策なし
		int am = isNeed(m,a,k);
		
		if(key<=am){
			return lowerBound(key,from,m-1,a,k);
		}
		else{
			return lowerBound(key,m,to,a,k);
		}
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
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
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}