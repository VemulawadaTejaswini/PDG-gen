import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = 1000000007;
	
	int N;
	int A;
	int[] x;
	long[][][] dp;
	int max;
	
	/* solve */
	void solve(){
		N = sc.nextInt();
		A = sc.nextInt();
		x = new int[N+1];
		for(int i = 1; i <= N; i++) x[i] = sc.nextInt();
		max = 50 * N;
		
		dp = new long[N+1][N+1][max+1];
		
		for(int i = 1; i <= N; i++){
			dp[i][1][x[i]] = 1;
		}
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= i; j++){
				for(int k = 0; k <= max; k++){
					if(x[i+1]+k <= max){
						dp[i+1][j+1][x[i+1]+k] += dp[i][j][k];
						dp[i+1][j][k] += dp[i][j][k];
					}else{
						dp[i+1][j][k] += dp[i][j][k];
					}
				}
			}
		}
		
		long count = 0;
		for(int i = 0; i <= N; i++) count += dp[N][i][i*A];
		
		System.out.println(count);
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
			System.out.printf("%7d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class Pair{
	int L, R;
	public Pair(int L, int R){
		this.L = L;
		this.R = R;
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
