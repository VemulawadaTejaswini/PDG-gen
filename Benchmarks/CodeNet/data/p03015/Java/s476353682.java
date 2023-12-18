import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	static int[] plus;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();

        String input = sc.next();
        
        if(!input.substring(1,input.length()).contains("0")){
            System.out.println(iterationPowMod(3,input.length()));
        }
        else if(!input.substring(1,input.length()).contains("1")){
            System.out.println((iterationPowMod(3,input.length()) +2) % mod);
        }
        else{
            BigInteger l = new BigInteger(input,2);
            
            plus = new int[l.bitCount()+1];
            plus[0] = 1;
            
            for(int i=1;i<l.bitCount()+1;i++){
            	plus[i] = plus[i-1] << 1;
            	plus[i] %= mod;
            }
            
            l = l.add(BigInteger.ONE);
            
            System.out.println(a(l));
        }
        
    }
    
    int a(BigInteger n){
    	if(n == BigInteger.ZERO){
    		return 0;
    	}
    	int bitnum = n.bitCount();
    	BigInteger floor2 = n.shiftRight(1);
    	int saiki = a(floor2);
    	saiki = (saiki+saiki) % mod + saiki;
    	saiki %= mod;
    	
    	if(n.getLowestSetBit() == 0){
    		saiki += plus[bitnum-1];
    		saiki %= mod;
    	}
    	
    	return saiki;
    }
    
	static int iterationPowMod(long x, long n){
		int mod = 1000000007;
	    long sum = 1;
	    while(n>0){
	        if((n&1)== 1){  //ビットが立っていたら
	            sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
	            sum %= mod;
	        }
	        x *= x;              //((x^2)^2)^2・・・
	        x %= mod;
	        n >>= 1;
	    }
	    return (int)sum;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}