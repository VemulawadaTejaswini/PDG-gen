
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
	static boolean[] ans;
	static int[][] pass;
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static int[][] map;
	static int n;
	static int V;
	static int[][] res;
	static int num[] = new int[] {0,5,9,13};
	static int[][] dir = {{0,0},{-1,0}, {0,-1},{0,1},{1,0},{-1,-1},{-1,1},{1,-1},{1,1,},{-2,0},{0,-2},{0,2},{2,0}};
	static HashSet<ArrayList<Data>> set = new HashSet<ArrayList<Data>>();
	public static void main(String[] args) {
		n = sc.nextInt();
		map = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				map[i][j] = sc.nextInt();
				V+= map[i][j];
			}
		}
		res = new int[n][3];
		solv(1,1,0,3);
		show();
		out.flush();

	}
	
	
	static ArrayDeque<ArrayList<Data>> ansX = new ArrayDeque<ArrayList<Data>>();
	static int[][] mapx = new int[10][10];

	static boolean clear(ArrayList<Data> a) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				mapx[i][j] = 0;
			}
		}
		for(int i = 0; i < a.size(); i++) {
			Data tmp = a.get(i);
			int x = tmp.x;
			int y = tmp.y;
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
	
	static void show() {
		for(int i = 0; i < res.length; i++) {
			out.println(res[i][0] + " " + res[i][1] + " " + res[i][2]);
		}
	}
	static void showX(ArrayList<Data> a) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				mapx[i][j] = 0;
			}
		}
		for(int i = 0; i < a.size(); i++) {
			Data tmp = a.get(i);
			int x = tmp.x;
			int y = tmp.y;
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
				System.out.print(mapx[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==");
	}

	static boolean solv(int xd, int yd, int k, int drop) {
		if(V == 0)           return true;
		if(k == n)           return false;
		if(!check(yd,xd))    return false;
		if(drop < 1)         return solv(xd+1,yd,k,3);
		if(yd == 9)          return false;
		if(xd == 9)          return solv(1,yd+1,k,3);
		if(map[yd][xd] == 0) return solv(xd+1,yd,k,3);
		if(e(yd, xd, drop)){
			for(int K=0;K<num[drop];K++)map[yd+dir[K][0]][xd+dir[K][1]]--;
			res[k][0] = xd;
			res[k][1] = yd;
			res[k][2] = drop;
			V-=num[drop];
			if(solv(xd, yd, k+1, drop))return true;
			V+=num[drop];
			for(int K=0;K<num[drop];K++)map[yd+dir[K][0]][xd+dir[K][1]]++;
		}
		return solv(xd, yd, k, drop-1);

	}
	
	static boolean check(int i, int j){
		i-=2;
		if(j<3){
			i--; j=9;
		}
		else j-=3;
		while(0<=i && 0<=j){
			if(map[i][j]>0)return false;
			if(j==0){
				i--; j=9;
			}
			else j--;
		}
		return true;
		
	}
	
	static boolean e(int i, int j, int drop){
		for(int k=0;k<num[drop];k++){
			int ni = i+dir[k][0], nj = j+dir[k][1];
			if(ni<0||9<ni||nj<0||9<nj||map[ni][nj]==0)return false;
		}
		return true;
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