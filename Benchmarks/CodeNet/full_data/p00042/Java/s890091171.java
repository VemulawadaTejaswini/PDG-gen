import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		for(int caseNum = 1 ;; caseNum++){
			int W = sc.nextInt();			
			if(W == 0) break;
			int N = sc.nextInt();
			int[] v = new int[N+1];
			int[] w = new int[N+1];
			for(int i = 1; i <= N; i++){
				String[] in = sc.next().split(",");
				v[i] = Integer.valueOf(in[0]);
				w[i] = Integer.valueOf(in[1]);
			}
			
			int[][] dp = new int[N+1][W+1];
			
			for(int i = 0; i <= N; i++)
				dp[i][0] = 0;
			for(int j = 0; j <= W; j++)
				dp[0][j] = 0;
			
			for(int i = 1; i <= N; i++){
				for(int j = w[i]; j <= W; j++){
					dp[i][j] = Math.max(dp[i-1][j-w[i]] + v[i], dp[i-1][j]);
				}
			}
			
			int maxValue = dp[N][W];
			int minWeight = W;
			for(int j = W; j >= 0; j--){
				if(dp[N][j] == maxValue) minWeight = j;
				else break;
			}
			
			System.out.println("Case " + caseNum + ":");
			System.out.println(maxValue);
			System.out.println(minWeight);
			System.out.flush();
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

