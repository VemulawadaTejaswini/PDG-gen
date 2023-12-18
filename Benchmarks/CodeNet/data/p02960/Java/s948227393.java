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
        
        char[] c = sc.next().toCharArray();

        
        int n = c.length;
        
        int[] s = new int[n];
        
        for(int i=0;i<n;i++){
        	int j = n-i-1;
        	switch(c[j]){
        	case '?': s[i] = -1;break;
        	case '1': s[i] = 1;break;
        	case '2': s[i] = 2;break;
        	case '3': s[i] = 3;break;
        	case '4': s[i] = 4;break;
        	case '5': s[i] = 5;break;
        	case '6': s[i] = 6;break;
        	case '7': s[i] = 7;break;
        	case '8': s[i] = 8;break;
        	case '9': s[i] = 9;break;
        	}
        }
        
        long[][] dp = new long[13][n];
        
        if(s[0]==-1){
        	for(int i=0;i<=9;i++){
        		dp[i][0] = 1;
        	}
        }
        else{
        	dp[s[0]][0] = 1;
        }
        
        for(int i=1;i<n;i++){
            if(s[i]==-1){
            	for(int k=0;k<=9;k++){
        			int mul = k*iterationPowMod(10,i)%13;
            		for(int l=0;l<13;l++){
            			dp[(l+mul)%13][i] += dp[l][i-1];
            			dp[(l+mul)%13][i] %= mod;
            		}
            	}
            }
            else{
        		for(int l=0;l<13;l++){
        			int mul = s[i]*iterationPowMod(10,i)%13;
        			dp[(l+mul)%13][i] += dp[l][i-1];
        			dp[(l+mul)%13][i] %= mod;
        		}
            }
        }
        
        out.println(dp[5][n-1]);
        
        out.flush();
    }
    
	static void print(int[] a){
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println(a[a.length-1]);
	}
	
	static int iterationPowMod(long x, long n){
		int m = 13;
	    long sum = 1;
	    while(n>0){
	        if((n&1)== 1){  //ビットが立っていたら
	            sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
	            sum %= m;
	        }
	        x *= x;              //((x^2)^2)^2・・・
	        x %= m;
	        n >>= 1;
	    }
	    return (int)sum;
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