import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
	FastScanner sc = new FastScanner();
	
	int a1 = sc.nextInt();
	int b1 = sc.nextInt();
	int a2 = sc.nextInt();
	int b2 = sc.nextInt();
	int a3 = sc.nextInt();
	int b3 = sc.nextInt();
	
	boolean can;
	
	int[] dig = new int[4];
	
	dig[a1-1] += 1;
	dig[a2-1] += 1;
	dig[a3-1] += 1;
	dig[b1-1] += 1;
	dig[b2-1] += 1;
	dig[b3-1] += 1;
	
	int odd = 0;
	for(int i=0;i<4;i++){
		if(!(dig[i]%2 == 0)){
			odd += 1;
		}
	}
	
	if(odd==0 || odd==2){
		can = true;
	}
	else{
		can = false;
	}

	if(can){
	    System.out.println("YES");
	}
	else{
	    System.out.println("NO");
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