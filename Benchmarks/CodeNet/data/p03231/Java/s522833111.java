import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	static long[] P = new long[51];
	static long[] L = new long[51];
	
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		long lcm = lcm(N, M);
		
		long len = lcm;
		StringBuilder X = new StringBuilder();
		boolean canMake = true;
		for(int i = 0; i < len && canMake; i++){
			
			
			if(i % (len / N) == 0 && i % (len / M) == 0){
				int ln = i / (int)(len / N);
				int lm = i / (int)(len / M);
				
				if(S[ln] == T[lm]){
					X.append(S[ln]);
				}else{
					canMake = false;
				}
			}else if(i % (len / N) == 0){
				int ln = i / (int)(len / N);
				X.append(S[ln]);
			}else if(i % (len / M) == 0){
				int lm = i / (int)(len / M);
				X.append(T[lm]);
			}else{
				X.append("#");
			}
		}
		
		if(canMake){
			System.out.println(X.length());
			return;
		}
		
		System.out.println(-1);
	}
	
	public static long lcm(long a, long b){
		return a / gcd(a, b) * b; //オーバーフローに注意
	}
	
	public static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
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
