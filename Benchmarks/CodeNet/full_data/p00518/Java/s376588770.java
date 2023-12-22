import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);
    static String[] B = new String[] {"000","001","010","011","100","101","110","111"};
    public static void main(String[] args) {
    	int n = sc.nextInt();
    	String m = sc.next();
    	int[][] dp = new int[n][1 << 3];
    	//000 JOI
    	for(int i = 0; i < 1 << 3; i++) {
    		
    		if(B[i].charAt(JOI(m.charAt(0))) == '1' && B[i].charAt(0) == '1') {
    			dp[0][i] = 1;
    		}
    	}
    	
    	for(int i = 1; i < n; i++) {
    		for(int j = 0; j < 1 << 3; j++) {
    			if(B[j].charAt(JOI(m.charAt(i))) == '1') {
    				for(int k = 0; k < 1 << 3; k++) {
    					if((k & j) != 0) {
    						dp[i][j] += dp[i-1][k] % 10007;
    					}
    				}
    			}
    		}
    	}
    	int sum = 0;
    	for(int i = 0; i < 1 << 3; i++) {
    		sum += dp[n-1][i] % 10007;
    	}
    	out.println(sum % 10007);
    	out.flush();
    	
    	
    }
    
    static int JOI(char a) {
    	if(a == 'J') return 0;
    	if(a == 'O') return 1;
    	return 2;
    }
    
    static String B(String a) {
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < 3- a.length(); i++) {
    		sb.append("0");
    	}
    	sb.append(a);
    	return sb.toString();
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
     
    public double nextDouble() {
        return Double.parseDouble(next());
    }
     
 
}