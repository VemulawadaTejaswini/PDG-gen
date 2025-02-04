
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	static int[][] list;
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int[] ax = new int[4];
		int[] bx = new int[4];
		
		while(sc.hasNext()) {
			double a = Double.parseDouble(sc.next());
			double b = Double.parseDouble(sc.next());
			
			if(a < 0.2) ax[3]++;
			else if(a < 0.6) ax[2]++;
			else if(a < 1.1) ax[1]++;
			else ax[0]++;
			
			if(b < 0.2) bx[3]++;
			else if(b < 0.6) bx[2]++;
			else if(b < 1.1) bx[1]++;
			else bx[0]++;
		}
		for(int i = 0; i < 4; i++) {
			out.println(ax[i] + " " + bx[i]);
		}
		out.flush();
	}
	static void solv(int a, int b, boolean[] c) {
		list[a][b]++;
		if(a == 9) return;
		if(b > 1000) return;
		
		for(int i = 0; i < 101; i++) {
			if(a == 8) {
				if(!c[i]) {
					list[a+1][b+i]++;
				}
			}
			
			else if(!c[i]) {
				c[i] = true;
				solv(a+1,b+i,c);
				c[i] = false;
			}
		}
	}
}
//------------------------------//
//-----------//
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
    

}