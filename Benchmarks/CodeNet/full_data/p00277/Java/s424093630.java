
import java.awt.geom.Point2D;
import java.io.*;
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

import javax.xml.crypto.Data;
public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		int r = sc.nextInt();
		int l = sc.nextInt();
		int[] list = new int[n+1];
		int[] time = new int[n+1];
		int top = 0;
		int id  = 1;
		int nowtime = 0;
		for(int i = 0; i < r; i++) {
			
			int d = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			time[id] += t - nowtime;
			nowtime = t;
			list[d] += x;
			if(id == d) {
				top += x;
			}
			if(x < 0 && d == id) {
				for(int j = 1; j < n+1; j++) {
					if(top < list[j] || (top == list[j] && j < id)) {
						top = list[j];
						id = j;
					}
				}
				
			}
			if(x > 0 && d != id) {
				if(top < list[d] || (top == list[d] && d < id)) {
					top = list[d];
					id = d;
				}
			}
			
			
		}
		time[id] += l - nowtime;
		int max = 0;
		int ix = 0;
		for(int i = 1; i < n+1; i++) {
			if(max < time[i]) {
				max = time[i];
				ix = i;
			}
			
		}
		out.println(ix);
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
    	return (int)nextLong();
    }
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}