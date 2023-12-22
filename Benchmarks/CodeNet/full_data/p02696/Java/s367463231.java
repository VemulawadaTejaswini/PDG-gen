import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Random;


public class Main {
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	/*
	 * 
	 *  floor(Ax/B)-A*floor(x/B)
	 * 
	 *   m <=x/B<m+1
	 *=> Am<=Ax/B<(m+1)A
	 *
	 *  このとき A*floor(x/B)=mA 
	 *  
	 * f=floor(Ax/B)-A*floor(x/B)
	 *  =floor(Ax/B)-mA
	 * 
	 * 0<=f<A
	 */
	
	void run() {
		FastScanner sc=new FastScanner();
		long A=sc.nextLong();//1<=A<=1e6
		long B=sc.nextLong();//1<=B<=1e12
		long N=sc.nextLong();//0<=x<=N<=1e12
		
		
		// 0<=x<=B のみを考えればよい
		long x=Math.min(N,B-1);
		System.out.println(A*x/B-A*(x/B));
		
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}




class FastScanner {
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	return (int)nextLong();
    }
}