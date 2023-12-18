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
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int d = sc.nextInt()-1;
        
        String str = sc.next();
        char[] s = str.toCharArray();

        int maefrom;
        int usirofrom;
        int maeto;
        int usiroto;
        
        if(a<b){
        	maefrom = a;
        	usirofrom = b;
        	maeto = c;
        	usiroto = d;
        }
        else{
        	maefrom = b;
        	usirofrom = a;
        	maeto = d;
        	usiroto = c;
        }
        
        boolean can;
        if(maeto<usiroto){ //交差しない
        	can = canReach(maefrom,maeto,s) && canReach(usirofrom,usiroto,s);
        }
        else{
        	can = canReach(maefrom,maeto,s) && canReach(usirofrom,usiroto,s) && haveSpace(usirofrom,usiroto,str);
        }
        
        if(can){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
    
    boolean canReach(int from, int to, char[] s){
    	int now = from;
    	
    	while(now != to){
    		if(s[now+1]!='#'){
    			now += 1;
    		}
    		else if(s[now+2]!='#'){
    			now += 2;
    		}
    		else{
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    boolean haveSpace(int usirofrom, int usiroto, String str){
    	int l = str.length();
    	
    	String str1 = str.substring(usirofrom-1, Math.min(usiroto+2,l));
    	
    	boolean e1 = str1.contains("...");
    	
    	return e1;
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