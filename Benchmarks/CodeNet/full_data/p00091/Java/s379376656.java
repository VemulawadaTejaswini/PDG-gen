
import java.awt.geom.Point2D;
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

import javax.xml.crypto.Data;
public class Main {
	static boolean[] ans;
	static int[][] pass;
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static int[][] map;
	static int n;
	public static void main(String[] args) {
		n = sc.nextInt();
		map = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		ansX.add( new ArrayList<Data>());
		solv(0,0,0);
		
		out.flush();

	}
	
	
	static ArrayDeque<ArrayList<Data>> ansX = new ArrayDeque<ArrayList<Data>>();
	
	static boolean check(ArrayList<Data> a) {
		char[][] mapx = new char[10][10];
		int maxy = -1;
		for(int i = 0; i < a.size(); i++) {
			Data tmp = a.get(i);
			int x = tmp.x;
			int y = tmp.y;
			if(y > maxy) maxy = y;
			if(tmp.size == 1) {
				mapx[y][x]++;
				mapx[y-1][x]++;
				mapx[y+1][x]++;
				mapx[y][x+1]++;
				mapx[y][x-1]++;
			}
			if(tmp.size == 2) {
				mapx[y][x]++;
				mapx[y-1][x]++;
				mapx[y+1][x]++;
				mapx[y][x+1]++;
				mapx[y][x-1]++;
				mapx[y+1][x+1]++;
				mapx[y+1][x-1]++;
				mapx[y-1][x+1]++;
				mapx[y-1][x-1]++;
			}
			if(tmp.size == 3) {
				mapx[y][x]++;
				mapx[y-1][x]++;
				mapx[y+1][x]++;
				mapx[y][x+1]++;
				mapx[y][x-1]++;
				mapx[y+1][x+1]++;
				mapx[y+1][x-1]++;
				mapx[y-1][x+1]++;
				mapx[y-1][x-1]++;
				mapx[y-2][x]++;
				mapx[y+2][x]++;
				mapx[y][x+2]++;
				mapx[y][x-2]++;
			}
			
			
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(mapx[i][j] > map[i][j]) return false;
				if(maxy - 3 >= 0 && i == maxy - 3 && mapx[i][j] != map[i][j]) return false;
			}
		}
		return true;
	}
	static boolean clear(ArrayList<Data> a) {
		char[][] mapx = new char[10][10];
		int maxy = -1;
		for(int i = 0; i < a.size(); i++) {
			Data tmp = a.get(i);
			int x = tmp.x;
			int y = tmp.y;
			if(y > maxy) maxy = y;
			if(tmp.size == 1) {
				mapx[y][x]++;
				mapx[y-1][x]++;
				mapx[y+1][x]++;
				mapx[y][x+1]++;
				mapx[y][x-1]++;
			}
			if(tmp.size == 2) {
				mapx[y][x]++;
				mapx[y-1][x]++;
				mapx[y+1][x]++;
				mapx[y][x+1]++;
				mapx[y][x-1]++;
				mapx[y+1][x+1]++;
				mapx[y+1][x-1]++;
				mapx[y-1][x+1]++;
				mapx[y-1][x-1]++;
			}
			if(tmp.size == 3) {
				mapx[y][x]++;
				mapx[y-1][x]++;
				mapx[y+1][x]++;
				mapx[y][x+1]++;
				mapx[y][x-1]++;
				mapx[y+1][x+1]++;
				mapx[y+1][x-1]++;
				mapx[y-1][x+1]++;
				mapx[y-1][x-1]++;
				mapx[y-2][x]++;
				mapx[y+2][x]++;
				mapx[y][x+2]++;
				mapx[y][x-2]++;
			}
			
			
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(mapx[i][j] != map[i][j]) return false;
			}
		}
		return true;
	}
	
	static void show(ArrayList<Data> a) {
		for(int i = 0; i < a.size(); i++) {
			out.println(a.get(i).x + " " + a.get(i).y + " " + a.get(i).size);
		}
	}
	static boolean isOKA(int x, int y) {
		if(x-1 < 0 || y-1 < 0 || x+1 >= 10 || y+1 >= 10 || ansX.isEmpty()) return false;
		return true;
	}
	
	static boolean isOKB(int x, int y) {
		if(x-2 < 0 || y-2 < 0 || x+2 >= 10 || y+2 >= 10 || ansX.isEmpty()) return false;
		return true;
	}
	static void solv(int xd, int yd, int count) {
		if(xd >= 12 || yd >= 12) return;
		if(ansX.isEmpty()) return;

		if(xd == 11) {
			xd = 0;
			yd++;
		}
		ArrayList<Data> a = ansX.getFirst();
		if(n == count && clear(a)) {
			show(a);
			ansX.clear();
			return;
		}
		
		if(n == count){
			return;
		}

		ansX.addFirst(a);
		solv(xd+1,yd,count);
	
		if(isOKA(xd,yd)) {
			ArrayList<Data> b = new ArrayList<Data>(a);
			b.add(new Data(xd,yd,1));
			if(check(b)) {
				ansX.addFirst(b);
				solv(xd,yd,count+1);
			}
		}
		
		if(isOKA(xd,yd)) {
			ArrayList<Data> b = new ArrayList<Data>(a);
			b.add(new Data(xd,yd,2));
			if(check(b)) {
				ansX.addFirst(b);
				solv(xd,yd,count+1);
			}
		}
		if(isOKB(xd,yd)) {
			ArrayList<Data> b = new ArrayList<Data>(a);
			b.add(new Data(xd,yd,3));
			if(check(b)) {
				ansX.addFirst(b);
				solv(xd,yd,count+1);
			}
		}
		
		
		
	}
	
	static class Data {
		int x;
		int y;
		int size;
		Data(int a, int b, int c) {
			x = a;
			y = b;
			size = c;
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
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}