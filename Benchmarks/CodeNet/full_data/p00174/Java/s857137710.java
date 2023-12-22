
import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);

	static int INF = 2 << 29;

	public static void main(String[] args) {
		while(true) {
			char[] g1 = sc.next().toCharArray();
			if(g1[0] == '0') break;
			char[] g2 = sc.next().toCharArray();
			char[] g3 = sc.next().toCharArray();
			int a = 0;
			int b = 0;
			boolean aw = false;
			boolean bw = false;
			boolean mode = false;
			for(int i = 1; i < g1.length; i++) {
				if(g1[i] == 'B') {
					b++;
				}
				else {
					a++;
				}
				if(a == 10 && b == 10) {
					mode = true;
				}
				if(!mode && a == 11) {
					break;
				}
				if(!mode && b == 11) {
					break;
				}
				if(mode && Math.abs(a - b) == 2) {
					break;
				}
			}
			if(a > b) {
				a++;
			}
			if(a < b) {
				b++;
			}
			out.println(a + " " + b);
			a = 0;
			b = 0;
			mode = false;
			for(int i = 1; i < g2.length; i++) {
				if(g2[i] == 'B') {
					b++;
				}
				else {
					a++;
				}
				
				if(a == 10 && b == 10) {
					mode = true;
				}
				if(!mode && a == 11) {
					aw = true;
					break;
				}
				if(!mode && b == 11) {
					bw = true;
					break;
				}
				if(mode && Math.abs(a - b) == 2) {
					if(a > b) {
						aw = true;
					}
					else {
						bw = true;
					}
					break;
				}
				
			}
			if(a > b) {
				a++;
			}
			if(a < b) {
				b++;
			}
			out.println(a + " " + b);
			a = 0;
			b = 0;
			mode = false;
			for(int i = 1; i < g3.length; i++) {
				if(g3[i] == 'B') {
					b++;
				}
				else {
					a++;
				}
				
				if(a == 10 && b == 10) {
					mode = true;
				}
				if(!mode && a == 11) {
					aw = true;
					break;
				}
				if(!mode && b == 11) {
					bw = true;
					break;
				}
				if(mode && Math.abs(a - b) == 2) {
					if(a > b) {
						aw = true;
					}
					else {
						bw = true;
					}
					break;
				}
				
			}
			if(a > b) {
				a++;
			}
			if(a < b) {
				b++;
			}
			out.println(a + " " + b);
			
		}
		out.flush();
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
    	 if (!hasNext()) throw new NoSuchElementException();
         int n = 0;
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
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}