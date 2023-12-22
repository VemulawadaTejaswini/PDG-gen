import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.*;




class Main {

	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int[][] p = new int[d][n];
		for(int i = 0; i < d; i++) {
			for(int j = 0; j < n; j++) {
				p[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[d+1][100001]; //i-1??\??????????????????j?????£??????i??\??????????????????MAX
		for(int i = x+1; i < dp[0].length; i++) {
			dp[0][i] = -1;
		}
		for(int i = 0; i < d; i++) {
			int max = -1;
			for(int j = 0; j < dp[i].length; j++) {
				if(dp[i][j] == -1) continue;
				dp[i+1][j] = Math.max(dp[i+1][j],j);
				for(int k = 0; k < n; k++) {
					int tmp = j / p[i][k];
					int tmpj = j - tmp * p[i][k];
					if(i+1 < d) dp[i+1][j] = Math.max(dp[i+1][tmpj] + p[i+1][k] * tmp, dp[i+1][j]);
					else dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j]);
					max = Math.max(max, dp[i+1][j]);
				}
			}
			for(int j = max+1; j < dp[i].length; j++) {
				dp[i+1][j] = -1;
			}
		}
		int max = 0;
		for(int i = dp[d].length-1; i >= 0; i--) {
			if(dp[d][i] != -1) {
				max = i;
				break;
			}
		}
		System.out.println(max);
		
		
	}
	


	
	static class FastScanner {
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
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
	        if (!hasNext()) throw new NoSuchElementException();
	        int n = 0;
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
	}
}