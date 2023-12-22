import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;

public class Main {	

	static int[] F;
	
	public static void main(String[] args) throws Exception {
		
		//int N = scan.nextInt();
		//long L = scan.nextLong();
		//double D = scan.nextDouble();
		//char[] A = scan.next().toCharArray();
		
		int N = scan.nextInt();
		F = new int[100001];
		F[1] = 1;
		char[] X = scan.next().toCharArray();
		long cnt_1 = 0;
		for(char c : X){
			if(c=='1')cnt_1++;
		}

		long mod_1 = cnt_1 - 1;
		long mod_2 = cnt_1 + 1;
		long base_mod_1 = 0;
		long base_mod_2 = 0;
		long[] tow_mod_1 = new long[N];
		long[] tow_mod_2 = new long[N];

		for(int  d=0; d<N; d++){

			tow_mod_1[d] = modPow(2, d, mod_1);
			tow_mod_2[d] = modPow(2, d, mod_2);
		}
		for(int d=0; d<N; d++){
			
			if(X[N-1-d] == '1' ){
				base_mod_1 += tow_mod_1[N-1-d];
				base_mod_2 += tow_mod_2[N-1-d];
				base_mod_1 %= mod_1;
				base_mod_2 %= mod_2;
				
			}
		}
		
		long mod = 0;
		long base_mod;
		for(int i=0 ;i<N; i++){
			if(X[i]=='0'){
				X[i] = '1'; 
				mod = mod_2;
				base_mod = base_mod_2;
				base_mod += tow_mod_2[N-1-i];
			}else{
				X[i] = '0'; 
				mod = mod_1;
				base_mod = base_mod_1;
				base_mod -= tow_mod_1[N-1-i];
				
			}
			base_mod +=mod;
				base_mod %= mod;

				out.println(1+ F[(int)base_mod]);
			
			if(X[i]=='0'){
				X[i] = '1'; 
				cnt_1++;
			}else{
				X[i] = '0'; 
				cnt_1--;
			}
		}
		
		out.flush();
	}

	static int f(int n){
		if(n==0) return 0;
		if(n == 1) return 1;
		if(F[n] != 0) return F[n];
		String str = Integer.toString(n, 2);
		char[] tmp = str.toCharArray();
		int cnt_1 = 0;
		for(char c : tmp){
			if(c=='1')cnt_1++;
		}
		int new_n = n%cnt_1;
		return F[n] = f(new_n) + 1;
	}

	static long modPow(long x, long n, long mod){
		long sum = 1;
		while(n>0){
			if((n&1) == 1 ){
				sum = sum * x % mod;
			}
			x = (x * x) % mod;
			n >>= 1;
		}
		return sum;
	}

	static FastScanner scan = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);			 
	static long MOD = 1_000_000_007;

	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int[] dx8 = {1,-1,0,0,1,1,-1,-1};
	static int[] dy8 = {0,0,1,-1,1,-1,1,-1};

	//GCD最大公約数を返す
	static long gcd(long a, long b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	//aとbの最小公倍数を返す
	static long lcm (long a, long b) {
		return ((a/gcd(a,b))*b);
	}
	
	//入力
	//https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
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
}
