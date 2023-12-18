import java.io.*;
import java.util.*;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	int N, Z, W;
	int[] a;
	int[][] dp;
	int[][] num;
	
	/* solve */
	void solve(){
		N = sc.nextInt();
		Z = sc.nextInt();
		W = sc.nextInt();
		a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		
		dp = new int[N+1][2];
		num = new int[N+1][2];
		
		dp[0][0] = Z;
		dp[0][1] = W;
		
		for(int i = 1; i <= N; i++){
			//先手
			int max = -1;
			for(int k = i; k >= 1; k--){
				if(max < Math.abs(a[N-i+k-1] - dp[i-k][1])){
					max = Math.abs(a[N-i+k-1] - dp[i-k][1]);
					dp[i][0] = a[N-i+k-1];
					num[i][0] = k;
				}
			}
			
			//後手
			int min = 2000000001;
			for(int k = i; k >= 1; k--){
				if(min > Math.abs(a[N-i+k-1] - dp[i-k][0])){
					min = Math.abs(a[N-i+k-1] - dp[i-k][0]);
					dp[i][1] = a[N-i+k-1];
					num[i][1] = k;
				}
			}
		}
		
		int nokori = N;
		int x = Z, y = W;
		for(int i = 1; nokori > 0; i++){
			int selectNum = 1;
			if(i % 2 == 1){
				selectNum = num[nokori][0];
				x = dp[nokori][0];
				
			}else{
				selectNum = num[nokori][1];
				y = dp[nokori][1];
			}
			nokori -= selectNum;
		}
		System.out.println(Math.abs(x-y));
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws IOException {
		new Main().m();
	}
	
	void m() throws IOException {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		//out = new PrintWriter(System.out);
		solve();
		//out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

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
