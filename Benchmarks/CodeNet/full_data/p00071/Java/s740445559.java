
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = (int)sc.nextLong();
		for(int i = 0; i < n; i++) {
			
			char[][] map = new char[8][8];
			for(int j = 0; j < 8; j++) {
				map[j] = sc.next().toCharArray();
			}
			int x = (int)sc.nextLong();
			int y = (int)sc.nextLong();
			
			solv(map,x,y);
			out.println("Data " + (i+1) + ":");
			for(int j = 0; j < 8; j++) {
				for(int k = 0; k < 8; k++) {
					out.print(map[j][k]);
				}
				out.println();
			}
		}
		out.flush();
	}
	static int[] vx = new int[] {1,0,-1,0};
	static int[] vy = new int[] {0,1,0,-1};
	
	static void solv(char[][] a, int b, int c) {
		boolean change;
		boolean[][] bX = new boolean[8][8];
		bX[c-1][b-1] = true;
		do {
			change = false;
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(bX[i][j]) {
						change = true;
						bX[i][j] = false;
						a[i][j] = '0';
						
						for(int k = 0; k < 4; k++) {
							for(int l = 1; l <= 3; l++) {
								if(vx[k]*l + j >= 8 || vx[k]*l + j < 0 || vy[k]*l + i >= 8 || vy[k]*l + i < 0) {
									break;
								}
								if(a[vy[k]*l + i][vx[k]*l + j] == '1') {
									bX[vy[k]*l + i][vx[k]*l + j] = true;
								}
							}
						}
					}
				}
			}
			
		}while(change);
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
    

}