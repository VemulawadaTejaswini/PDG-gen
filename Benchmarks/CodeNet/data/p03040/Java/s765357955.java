import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
         
        int q = sc.nextInt();
        double mean = 0;
        long bsum = 0;
        long asum = 0;
        boolean count = false;
        int before = 0;
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<q;i++){
        	int type = sc.nextInt();
        	if(type == 1){
        		int na = sc.nextInt();
        		int nb = sc.nextInt();
        		
        		if(!count){
        			count = true;
        			before = na;
        		}
        		else{
        			count = false;
        			asum += Math.abs(na-before);
        		}
        		
        		sortedInsert(al, na);
        		
        		bsum += nb;
        	}
        	else{
        		int idx = al.size()/2-1;
        		idx = Math.max(idx, 0);
        		int mx = al.get(idx);
        		System.out.print(mx + " ");
        		

        		System.out.println(asum + bsum);
        	}
        }
        


    }
    
	//lowerBound
	static int lowerBound(Integer[] a, int key){
		int idx = Arrays.binarySearch(a, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	static int lowerBound(ArrayList<Integer> a, int key){
		int idx = Collections.binarySearch(a, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	
	//ソートを崩さず挿入（lowerBoundが必要）
	static void sortedInsert(ArrayList<Integer> l, int key){
		int idx = lowerBound(l,key);
		l.add(idx,key);
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}