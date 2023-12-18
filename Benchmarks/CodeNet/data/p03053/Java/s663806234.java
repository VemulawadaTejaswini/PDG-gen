import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	
    	boolean[][] a = new boolean[h][w];
    	
    	boolean end = true;
    	
    	for(int i=0;i<h;i++){
    		char[] c = sc.next().toCharArray();
    		for(int j=0;j<w;j++){
    			if(c[j]=='#'){
        			a[i][j] = true;
    			}
    			else{
    				a[i][j] = false;
    				end = false;
    			}
    		}
    	}
    	
    	int count = 0;
    	
    	while(end == false){
    		
    		boolean[][] b = new boolean[h][w];
    		
    		for(int i=0;i<h;i++){
    			b[i] = a[i].clone();
    		}
    		
    		count += 1;
    		end = true;
    		
    		for(int i=0;i<h;i++){
    			for(int j=0;j<w;j++){
    				if(b[i][j]==false){
    					if(i!=0 && b[i-1][j]==true){
    						a[i][j] = true;
    					}
    					else if(i!=h-1 && b[i+1][j]==true){
							a[i][j] = true;
    					}
    					else if(j!=0 && b[i][j-1]==true){
							a[i][j] = true;
    					}
    					else if(j!=w-1 && b[i][j+1]==true){
							a[i][j] = true;
							break;
    					}
    					else{
    						end = false;
    					}
    				}
    			}
    		}
    		
    		
    	}
    	
    	System.out.println(count);


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