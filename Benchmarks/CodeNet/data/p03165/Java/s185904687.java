import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int W;
	static String[][] dp;
	static int[] v;
	static int[] w;
	static int INF = Integer.MAX_VALUE / 2;
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		boolean[] ans = new boolean[s.length()];
		
		dp = new String[s.length()+1][t.length()+1];
		for(int i = 0; i <= s.length(); i++){
			for(int j = 0; j <= t.length(); j++)
				dp[i][j] = "";
		}
		
		for(int i = 1; i <= s.length(); i++){
			for(int j = 1; j <= t.length(); j++){
				
				if(dp[i][j].length() < dp[i-1][j].length()){
					dp[i][j] = dp[i-1][j];
				}
				
				if(dp[i][j].length() < dp[i][j-1].length()){
					dp[i][j] = dp[i][j-1];
				}
				
				if(s.charAt(i-1) == t.charAt(j-1) && dp[i][j].length() < dp[i-1][j-1].length() + 1){
					dp[i][j] = dp[i-1][j-1] + s.charAt(i-1);
				}
			}
		}
		
		System.out.println(dp[s.length()][t.length()]);
		
	}//end main
	
	/*
	public static int solve(int i){
		
	}
	*/
	
}//end Main

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
