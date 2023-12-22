
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
	static HashMap<String, Integer> map = new HashMap<String,Integer>();
	static ArrayList<HashSet<String>> set = new ArrayList<HashSet<String>>();
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {-1,0,1,0};
	public static void main(String[] args) {
		int m = sc.nextInt();
		int n = sc.nextInt();
		Data[] list = new Data[m];
		for(int i = 0; i < m; i++) {
			list[i] = new Data(i+1,0);
		}
		int[] xl = new int[n];
		int[] yl = new int[n];
		for(int i = 0; i < n; i++) {
			xl[i] = sc.nextInt();
			yl[i] = sc.nextInt();

		}
		while(true) {
			boolean CON = false;
			for(int i = 0; i < n; i++) {
				int x = xl[i];
				
				int y = yl[i];
				x--;
				y--;
				if(list[y].s >= list[x].s) {
					list[x].s = list[y].s+1;
					CON = true;
				}
			
			}
			if(!CON) break;
		}
		
		Arrays.sort(list, new Comp());
		for(int i = 0; i < m; i++) {
			out.println(list[i].id);
		}
		out.flush();
		
	}
	static class Data {
		int id;
		int s;
		Data(int a, int b) {
			id = a;
			s = b;
		}
	}
	
	static class Comp implements Comparator<Data> {

		@Override
		public int compare(Data o1, Data o2) {
			return o2.s - o1.s;
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