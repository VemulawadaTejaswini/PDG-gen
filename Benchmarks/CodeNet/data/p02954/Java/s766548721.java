
import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        char[] str = sc.next().toCharArray();
        int[] score = new int[str.length];
        for (int i = 0; i < str.length; i++) {
        	int cnt = 0;
        	int pos = i;
        	//ゾーン時
        	while(true) {
        	if ((str[pos] == 'R' && str[pos + 1] == 'L' )|| (str[pos] == 'L' && str[pos - 1] == 'R') ) {
        		if (cnt % 2 == 0) {
        			score[pos]++;
        		} else {
        			if (str[pos] == 'R') score[pos + 1]++; 
        			else score[pos - 1]++;
        		}
        		break;
        	}
        	//非ゾーン時
              else {
        		cnt++;
        		if (str[pos] == 'R') pos++;
        		else pos--;
        	  }
        	}    	
        }
        
        for (int i: score)
        	out.print(i + " ");
        
    }
static class FastScanner {
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
}
