import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = 1000000007;
	final int INF = Integer.MAX_VALUE / 2;
	
	int N;
	long K;
	long[] A;
	
	/* solve */
	void solve(){
		N = sc.nextInt();
		K = sc.nextLong();
		A = new long[N];
		int maxBit = 42;
		int[] countBitOne = new int[maxBit];
		
		for(int i = 0; i < N; i++){
			A[i] = sc.nextLong();
			long a = A[i];
			for(int j = 0; j < maxBit; j++){
				if(a % 2 == 1) countBitOne[j]++;
				else countBitOne[j]--;
				a /= 2;
			}
		}
		
		//for(int i = 0; i < maxBit; i++) System.out.println(countBitOne[i]);
		
		boolean[] bit = new boolean[maxBit];
		long base = 1;
		long res = 0;
		for(int i = 0; i < maxBit; i++){
			if(countBitOne[i] >= 0) bit[i] = false;
			else bit[i] = true;
			
			if(bit[i]) res += base;
			
			base *= 2;
		}
		
		//System.out.println(Long.toBinaryString(res));
		
		if(res <= K){
			System.out.println(calc(res));
			return;
		}
		
		for(int i = maxBit-1; i >= 0; i--){
			res &= ~(1L<<i);
			//System.out.println(Long.toBinaryString((~(1L<<i))));
			//System.out.println(Long.toBinaryString(res));
			if(res <= K){
				System.out.println(calc(res));
				return;
			}
		}
		
		System.out.println(calc(res));
		
		/*
		for(long i = 0; i <= K; i++){
			long sum = 0;
			for(int j = 0; j < N; j++){
				//System.out.println((i ^ A[j]));
				sum += i ^ A[j];
			}
			System.out.println(i + " " + sum);
		}
		*/
	}
	
	long calc(long K){
		long res = 0;
		for(int i = 0; i < N; i++) res += K ^ A[i];
		return res;
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
