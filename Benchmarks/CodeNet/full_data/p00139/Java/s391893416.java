
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
import java.util.Stack;
import java.util.TreeMap;



public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	static TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			char[] in = sc.next().toCharArray();
			int res = solv(in);
			if(res == 0) {
				out.println("A");
			}
			else if(res == 1) {
				out.println("B");
			}
			else {
				out.println("NA");
			}
		}
		out.flush();
	}
	
	static int solv(char[] a) {
		if(a.length < 6) return -1;
		boolean isA = false;
		boolean isB = false;
		if(a[0] == '>' && a[1] == '\'') {
			isA = true;
		}
		if(a[0] == '>' && a[1] == '^')  {
			isB = true;
		}
		if(!isA && !isB) return -1;
		
		if(isA) {
			int ac = 0;
			int bc = 0;
			boolean nowb = true;
			for(int i = 2; i < a.length-1; i++) {
				if(a[i] == '=' && nowb) {
					ac++;
				}
				else if(a[i] == '=' && !nowb) {
					bc++;
				}
				else if(a[i] == '#' && nowb) {
					nowb = false;
				}
				else {
					return -1;
				}
			}
			if(ac != bc || nowb) return -1;
			
			if(a[a.length-1] == '~') return 0;
			
			
		}
		if(isB) {
			for(int i = 2; i < a.length-2; i+=2) {
				if(a[i] != 'Q' || a[i+1] != '=' ) return -1;
			}
			if(a[a.length-1] == '~' && a[a.length-2] == '~') return 1;
			
		}
		return -1;
 				
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