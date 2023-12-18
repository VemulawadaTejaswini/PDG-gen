import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
    	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int q = sc.nextInt();
        long B = 0;
        int lmed = Integer.MAX_VALUE;
        PriorityQueue<Integer> l = new PriorityQueue<Integer>(Comparator.reverseOrder());
        PriorityQueue<Integer> r = new PriorityQueue<Integer>();
        long lsum = 0;
        long rsum = 0;
        
        for(int i=0;i<q;i++){
        	if(sc.nextInt() == 1){	//更新
        		int a = sc.nextInt();
        		B += sc.nextInt();
        		
        		if(a<=lmed){
        			l.offer(a);
        			lsum += a;
        		}
        		else{
        			r.offer(a);
        			rsum += a;
        		}
        		
        		if(l.size()>r.size()+1){
        			int move = l.poll();
        			lsum -= move;
        			r.offer(move);
        			rsum += move;
        		}
        		else if(l.size()<r.size()){	//常に奇数はl側
        			int move = r.poll();
        			rsum -= move;
        			l.offer(move);
        			lsum += move;
        		}

        		lmed = l.peek();
        	}
        	else{	//求値
        		long ans = B;

    			ans += lmed*l.size() - lsum;
    			ans += rsum - lmed*r.size();
    			
        		out.println(lmed + " " + ans);
        	}
        }
        
        out.flush();
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
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