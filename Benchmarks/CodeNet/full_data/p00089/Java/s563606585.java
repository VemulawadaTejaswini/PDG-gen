
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
import java.util.Scanner;
public class Main {
	static int[][] map = new int[101][101];
	static int[][] dp = new int[101][101];
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int X = 0;
		IN:for( ; X < 100; X++) {
			if(!sc.hasNext()) break;
			String[] tmp = sc.next().split(",");
			for(int j = 0; j < tmp.length; j++) {
				map[X][j] = Integer.parseInt(tmp[j]);
			}
		}
		dp[0][0] = map[0][0];
		for(int i = 1; i < 101; i++) {
			if(X / 2 < i) {
				for(int j = 0; j < 100; j++) {
					dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j+1])+map[i][j];
				}
				dp[i][100] = dp[i-1][100] + map[i][100];
			}
			else {
				dp[i][0] = dp[i-1][0] + map[i][0];
				for(int j = 1; j < 101; j++) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + map[i][j];
				}
			}
		}
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				System.out.printf("%5d", dp[i][j]);
			}
			System.out.println();
		}
		int max = dp[100][0];
		for(int i = 1; i < 101; i++) {
			max = Math.max(max, dp[100][i]);
		}
		out.println(max);
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
    

}