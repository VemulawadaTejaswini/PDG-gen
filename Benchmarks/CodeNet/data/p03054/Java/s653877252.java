import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	int n = sc.nextInt();
    	int r = sc.nextInt();
    	int c = sc.nextInt();
    	
    	char[] S = sc.next().toCharArray();
    	char[] T = sc.next().toCharArray();
    	
    	int lup = r-1;
    	int ldown = h-r;
    	int lleft = c-1;
    	int lright = w-c;
    	
    	int up = 0;
    	int down = 0;
    	int left =0;
    	int right =0;
    	
    	boolean rem = true;
    	
    	loop: for(int i=0;i<n;i++){
    		if(S[i] == 'U'){
    			up++;
    		}
    		else if(S[i] == 'D'){
    			down++;
    		}
    		else if(S[i] == 'L'){
    			left++;
    		}
    		else{
    			right++;
    		}
    		
    		if(T[i] == 'U' && down > lup){
    			down--;
    		}
    		else if(T[i] == 'D' && up > ldown){
    			up--;
    		}
    		else if(T[i] == 'L' && right > lleft){
    			right--;
    		}
    		else if(left > lright){
    			left--;
    		}
    		
    		if(up>lup || down>ldown || left>lleft || right>lright){
    			rem = false;
    			break loop;
    		}
    	}
    	
    	
    	if(rem){
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