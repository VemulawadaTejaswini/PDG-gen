import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        int[] b = sc.nextIntArray(n);
        int[] c = sc.nextIntArray(n);
        
        Arrays.sort(c);
        Arrays.sort(b);
        
        int[] bs = new int[n];
        
        for(int i=0;i<n;i++){
        	int lb = upperBound(c,b[i]);
        	bs[i] = n-lb;
        }
        
        int[] Cb = cumulativeSumR(bs);
        
        int[] Ca = new int[n];
        
        for(int i=0;i<n;i++){
        	int la = upperBound(b,a[i]);
        	if(la<n){
            	Ca[i] = Cb[la];
        	}
        	else{
        		Ca[i] = 0;
        	}
        }
        
        System.out.println(sum(Ca));
    }
    
	//累積和
	static int[] cumulativeSum(int[] a){
		int[] cs = new int[a.length];
		cs[0] = a[0];
		for(int i=1;i<a.length;i++){
			cs[i] = cs[i-1] + a[i];
		}
		return cs;
	}
	//逆からの累積和
	static int[] cumulativeSumR(int[] a){
		int[] cs = new int[a.length];
		cs[a.length-1] = a[a.length-1];
		for(int i=a.length-2;i>=0;i--){
			cs[i] = cs[i+1] + a[i];
		}
		return cs;
	}
	
	//和
	static long sum(int[] a){
		long sum = 0;
		for(int i:a){
			sum += i;
		}
		return sum;
	}
 
	static int lowerBound(int[] a, int key){
		Integer[] ca = new Integer[a.length];
		
		for(int i=0;i<a.length;i++){
			ca[i] = a[i];
		}
		
		int idx = Arrays.binarySearch(ca, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	//upperBound
	static int upperBound(int[] a, int key){
		Integer[] ca = new Integer[a.length];
		
		for(int i=0;i<a.length;i++){
			ca[i] = a[i];
		}
		
		int idx = Arrays.binarySearch(ca, key, (x,y)->x.compareTo(y)>0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}