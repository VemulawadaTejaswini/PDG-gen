import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int MAX = 1000000;
		boolean[] isPrime = new boolean[MAX+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i <= MAX; i++){
			if(isPrime[i]){
				for(int j = i + i; j <= MAX; j += i)
					isPrime[j] = false;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x == 0) break;
			int[] v = new int[n+1];
			for(int i = 1; i <= n; i++) v[i] = sc.nextInt();
			
			int[][] dp = new int[n+1][x+1];
			int ans = -1;
			
			System.gc();
			
			for(int i = 1; i <= n; i++){
				for(int j = 0; j <= x; j++){
					dp[i][j] = dp[i-1][j];
					
					if(j - v[i] >= 0){
						int num = j / v[i];
						dp[i][j] = dp[i-1][j - v[i] * num] + v[i] * num;
					}
					
					if(i == n){
						if(isPrime[dp[n][j]]){
							ans = dp[n][j];
						}
					}
				}
			}
			
			if(ans == -1)
				System.out.println("NA");
			else
				System.out.println(ans);
			
			
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

