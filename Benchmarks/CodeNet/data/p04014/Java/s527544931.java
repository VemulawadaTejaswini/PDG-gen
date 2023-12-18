import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = 1000000007;
	
	/* solve */
	void solve(){
		long n = sc.nextLong();
		long s = sc.nextLong();
		
		if(n == s){
			System.out.println(n+1);
			return;
		}
		
		/*
		 * 2桁で表せない場合
		 * O(sqrt(n))で全探索
		 */
		long nextB = 0;
		for(long b = 2; b * b <= n; b++){
			long nn = n;
			int sum = 0;
			while(nn != 0){
				sum += nn % b;
				nn /= b;
			}
			if(sum == s){
				System.out.println(b);
				return;
			}
			nextB = b;
		}
		
		if(n - s < 0){
			System.out.println(-1);
			return;
		}
				
		/*
		 * 2桁で表す場合、 表し方をx2x1とすると
		 * b * x2 + x1 = n
		 *     x2 + x1 = s
		 * 
		 * n = b * x2 * x1 >= b * x2 > x2 ^ 2
		 * より、
		 * x2 <= sqrt(n)
		 * の範囲で全探索するとO(sqrt(n))
		 */
		for(long x2 = 1; x2 * x2 <= n; x2++){
			long x1 = s - x2;
			if(x1 < 0) continue;
			if((n - x1) % x2 != 0) continue;
			
			long b = (n - x1) / x2;
			if(x1 >= b || x2 >= b) continue;
			
			System.out.println(b);
			return;
		}
		
		System.out.println(-1);
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
