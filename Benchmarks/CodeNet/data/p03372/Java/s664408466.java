import java.io.*;
import java.util.*;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		long C = sc.nextLong();
		long[] x = new long[N+1];
		int[] v = new int[N+1];
		long[] sumLeft = new long[N+1];
		long[] sumRight = new long[N+1];
		long[] sumLeftMax = new long[N+1];
		long[] sumRightMax = new long[N+1];
		long[] sumLeftTurnMax = new long[N+1];
		long[] sumRightTurnMax = new long[N+1];
		
		for(int i = 1; i <= N; i++){
			x[i] = sc.nextLong();
			v[i] = sc.nextInt();
			sumLeft[i] = sumLeft[i-1] + v[i];
		}
		for(int i = 1; i <= N; i++){
			sumRight[i] = sumRight[i-1] + v[N-i+1];
		}
		
		for(int i = 1; i <= N; i++){
			sumLeftMax[i] = Math.max(sumLeftMax[i-1], sumLeft[i] - x[i]);
			sumRightMax[i] = Math.max(sumRightMax[i-1], sumRight[i] - (C - x[N-i+1]));
		}
		for(int i = 1; i <= N; i++){
			sumLeftTurnMax[i] = Math.max(sumLeftTurnMax[i-1], sumLeft[i] - 2 * x[i] + sumRightMax[N-i]);
			sumRightTurnMax[i] = Math.max(sumRightTurnMax[i-1], sumRight[i] - 2 * (C - x[N-i+1]) + sumLeftMax[N-i]);			
		}
		
		long max = Math.max(Math.max(sumLeftMax[N], sumRightMax[N]), Math.max(sumLeftTurnMax[N], sumRightTurnMax[N]));
		System.out.println(max);
		
	}//end main
	
}//end Main

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
