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
		long max = 0;
		for(int i = 0; i < N; i++){
			A[i] = sc.nextLong();
		}
		int maxLen = 60;
		int[] countBitOne = new int[maxLen];
		
		for(int i = 0; i < N; i++){
			long a = A[i];
			for(int j = 0; j < maxLen; j++){
				if(a % 2 == 1) countBitOne[j]++;
				else countBitOne[j]--;
				a /= 2;
			}
		}
		
		//Kを考慮しない最適なbit列
		boolean[] bit = new boolean[maxLen];
		//最適な場合の10進数での値
		long res = 0;
		//Kのbit列
		boolean[] k = new boolean[maxLen];
		
		long base = 1;
		long kk = K;
		for(int i = 0; i < maxLen; i++){
			if(kk % 2 == 1) k[i] = true;
			else k[i] = false;
			kk /= 2;
			
			if(countBitOne[i] > 0) bit[i] = false;
			else if(countBitOne[i] < 0) bit[i] = true;
			else bit[i] = false;
			
			if(bit[i]) res += base;
			base *= 2;
		}
		
		//最適な場合がK以下ならそのまま計算して出力
		if(res <= K){
			System.out.println(calc(res));
			return;
		}
		
		/*
		for(int i = maxLen-1; i >= 0; i--) System.out.print((k[i]) ? "1" : "0");
		System.out.println();
		for(int i = maxLen-1; i >= 0; i--) System.out.print((bit[i]) ? "1" : "0");
		System.out.println();
		*/
		
		//
		long ans = 0;
		for(int i = maxLen-1; i >= 0; i--){
			if(!k[i]) continue;
			
			long sum = 0;
			base = 1;
			for(int j = 0; j < maxLen; j++){
				if(i > j){
					sum += (bit[j]) ? base : 0;
				}else if(i < j){
					sum += (k[j]) ? base : 0;
				}else{
					sum += 0;
				}
				base *= 2;
			}
			//System.out.println(Long.toBinaryString(sum));
			
			ans = Math.max(ans, calc(sum));
		}
		
		ans = Math.max(ans, calc(K));
		//System.out.println(Long.toBinaryString(K));
		ans = Math.max(ans, calc(0));
		//System.out.println(Long.toBinaryString(0));
		
		System.out.println(ans);
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
