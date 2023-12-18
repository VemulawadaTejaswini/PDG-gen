import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main {
	
	//MOD、階乗・MODの逆元・階乗の逆元のテーブル
	static int MAX_FAC = 510000;
	static int MOD = 1000000007;
	static long[] fac = new long[MAX_FAC];
	static long[] finv = new long[MAX_FAC];
	static long[] inv = new long[MAX_FAC];
	
	public static void main(String[] args) throws IOException {
		//FastScanner sc = new FastScanner(new FileInputStream("input.txt"));
		FastScanner sc = new FastScanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = 1;
		
		//初期化
		initComb();
		
		long m = M;
		for (int i = 2; i * i <= m; i++) {
			if (m % i == 0) {
				int count = 0;
				while (m % i == 0) {
					m /= i;
					count++;
				}
				//System.out.println(i + " ^ " + count);
				//N-1+count C count
				ans = (ans * comb((int)N-1+count, count)) % MOD;
			}
		}
		if(m > 1){
			//System.out.println(n + " ^ " + 1);
			ans = (ans * N) % MOD;
		}
		
		System.out.println(ans);
	}
	
	//テーブルの初期化
	public static void initComb(){
		fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
		for (int i = 2; i < MAX_FAC; ++i) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	
	//nCk % MOD
	public static long comb(int n, int k){
		return fac[n] * finv[k] % MOD * finv[n - k] % MOD;
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public double nextDouble() { return Double.parseDouble(next());}
}