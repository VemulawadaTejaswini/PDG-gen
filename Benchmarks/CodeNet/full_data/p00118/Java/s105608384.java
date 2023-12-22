
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
	static char[][] map;
	static int h;
	static int w;
	public static void main(String[] args) {
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0) break;
			map = new char[h][w];
			for(int i = 0; i < h; i++) {
				char[] in = sc.next().toCharArray();
				for(int j = 0; j < w; j++) {
					map[i][j] = in[j];
				}
			}
			
			int ans = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] != '.') {
						ans++;
						clear(i,j,map[i][j]);
					}
				}
			}
			out.println(ans);
		}
		out.flush();
		
	}
	static int[] vy = new int[] {1,0,-1,0};
	static int[] vx = new int[] {0,1,0,-1};
	static void clear(int y, int x, char t) {
		if(map[y][x] != t) return;
		map[y][x] = '.';
		for(int i = 0; i < 4; i++) {
			if(checkR(y + vy[i],x + vx[i])) clear(y + vy[i],x + vx[i],t);
		}
		
	}
	
	static boolean checkR(int y, int x) {
		if(y < 0 || x < 0 || y >= h || x >= w) return false;
		return true;
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