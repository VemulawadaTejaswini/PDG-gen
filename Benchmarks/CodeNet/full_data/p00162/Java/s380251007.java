
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
		makeList();
		while(true) {
			int m = sc.nextInt();
			if(m == 0) break;
			int n = sc.nextInt();
			int count = 0;
			for(int i = m; i <= n; i++) {
				if(map.containsKey(i)) {
					count++;
				}
			}
			out.println(count);
		}
		out.flush();
	}
	static ArrayDeque<Data> que = new ArrayDeque<Data>();
	
	public static void makeList() {
		que.push(new Data(0,0,0));
		while(!que.isEmpty()) {
			Data tmp = que.pollLast();
			solv(tmp.a, tmp.b, tmp.c);
		}
	}
	public static void solv(int a, int b, int c) {
		boolean ak,bk,ck;
		ak = bk = ck = false;
		if(a == 0) ak = true;
		if(b == 0) bk = true;
		if(c == 0) ck = true;
		
		int tmp = 1;
		if(!ak) {
			tmp *= Math.pow(2, a);
		}
		if(!bk) {
			tmp *= Math.pow(3, b);
		}
		if(!ck) {
			tmp *= Math.pow(5, c);
		}
		
		if(tmp > 1000000) return;
		
		if(map.containsKey(tmp)) return;
		map.put(tmp, 0);
		
		que.push(new Data(a+1,b,c));
		que.push(new Data(a,b+1,c));
		que.push(new Data(a,b,c+1));
	}
	
	static class Data {
		int a;
		int b;
		int c;
		Data(int d, int e, int f) {
			a = d;
			b = e;
			c = f;
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