import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	static String s;
	static String t;
	static int[][][] dp;
	static int INF = Integer.MAX_VALUE / 2;
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		dp = new int[s.length()+1][t.length()+1][4];		
		
		for(int i = 1; i <= s.length(); i++){
			for(int j = 1; j <= t.length(); j++){
				
				if(dp[i][j][0] < dp[i-1][j][0]){
					dp[i][j][0] = dp[i-1][j][0];
					dp[i][j][1] = dp[i-1][j][1];
					dp[i][j][2] = i-1;
					dp[i][j][3] = j;
				}
				
				if(dp[i][j][0] < dp[i][j-1][0]){
					dp[i][j][0] = dp[i][j-1][0];
					dp[i][j][1] = dp[i][j-1][1];
					dp[i][j][2] = i;
					dp[i][j][3] = j-1;
				}
				
				if(s.charAt(i-1) == t.charAt(j-1) && dp[i][j][0] < dp[i-1][j-1][0] + 1){
					dp[i][j][0] = dp[i-1][j-1][0] + 1;
					dp[i][j][1] = i-1;
					dp[i][j][2] = i-1;
					dp[i][j][3] = j-1;
				}
			}
		}
		
		int len = dp[s.length()][t.length()][0];
		int indexA = dp[s.length()][t.length()][1];
		int indexAp = -1;
		int indexS = dp[s.length()][t.length()][2];
		int indexT = dp[s.length()][t.length()][3];
		
		StringBuilder ans = new StringBuilder();
		
		if(len == 0){
			System.out.println();
			return;
		}
		
		while(true){
			if(indexA != indexAp) ans.append(s.charAt(indexA));
			indexAp = indexA;
			indexA = dp[indexS][indexT][1];
			indexS = dp[indexS][indexT][2];
			indexT = dp[indexS][indexT][3];
			if(indexS == 0 || indexT == 0) break;
		}
		System.out.println(ans.reverse());
		
		
	}//end main
	
	/*
	public static int solve(int i, int j){
		
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
