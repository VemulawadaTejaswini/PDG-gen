import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Map.Entry;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	static StringBuilder S;
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		S = new StringBuilder(sc.next());
		
		if(S.length() == 1){
			System.out.println(0);
			return;
		}
		
		int count = 0;
		while(!isAll()){
			int L = 0;
			char cL = S.charAt(0);
			while(S.charAt(L) == cL) L++;
			int R = 0;
			char cR = S.charAt(S.length()-1);
			while(S.charAt(S.length()-1-R) == cR) R++;
			
			if(L > R){
				String bw = (cL == 'B') ? "W" : "B";
				for(int i = 0; i <= L - 1; i++) S.replace(i, i+1, bw);
				S.insert(0, bw);
			}else{
				String bw = (cR == 'B') ? "W" : "B";
				for(int i = S.length() - 1; i >= S.length()-R; i--) S.replace(i, i+1, bw);
				S.append(bw);
			}
			count++;
		}
		System.out.println(count);
	}
	
	static boolean isAll(){
		char c = S.charAt(0);
		for(int i = 1; i < S.length(); i++)
			if(c != S.charAt(i)) return false;
		return true;
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}