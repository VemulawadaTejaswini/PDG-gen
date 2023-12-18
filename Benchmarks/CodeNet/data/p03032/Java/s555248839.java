import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
         
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        jlist l = new jlist();

        for(int i=0;i<n;i++){
        	l.addLast(sc.nextInt());
        }
        
        int torun = Math.min(n, k);
        int ans = 0;
        
        for(int fnum=0;fnum<=torun;fnum++){
        	for(int lnum=0;lnum<=torun-fnum;lnum++){
        		int posableNega = k-fnum-lnum;
        		int sum = 0;
        		ArrayList<Integer> negative = new ArrayList<>();
        		
        		for(int i=0;i<fnum;i++){
        			int p = l.checkF(i);
        			sum += p;
        			if(p<0){
        				negative.add(p);
        			}
        		}
        		for(int i=0;i<lnum;i++){
        			int p = l.checkL(i);
        			sum += p;
        			if(p<0){
        				negative.add(p);
        			}
        		}
        		Collections.sort(negative);
        		
        		for(int i=0;i<Math.min(posableNega,negative.size());i++){
        			sum -= negative.get(i);
        		}
        		
        		ans = Math.max(ans,sum);
        	}
        }
        

        System.out.println(ans);
        
    }
    

}

class jlist{
	ArrayList<Integer> q;
	
	public jlist(){
		q = new ArrayList<>();
	}
	
	void addFirst(int value){
		q.add(0,value);
	}
	
	void addLast(int value){
		q.add(value);
	}
	
	int checkF(int i){
		return q.get(i);
	}
	
	int checkL(int i){
		return q.get(q.size()-1-i);
	}
	
	int pollFirst(){
		return q.remove(0);
	}
	
	int pollLast(){
		return q.remove(q.size()-1);
	}
	
	int pollMax(){
		if(checkF(0)>checkL(0)){
			return pollFirst();
		}
		else{
			return pollLast();
		}
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