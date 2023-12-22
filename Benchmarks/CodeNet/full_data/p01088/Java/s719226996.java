import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,1,0,-1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static int idx;
	static char[][] str;
	static int lv;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] p = new int[n];
			for(int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			int[][] dpA = new int[n+1][100001];
			int[][] dpB = new int[n+1][100001];
			for(int i = 0; i < dpA.length; i++) {
				Arrays.fill(dpA[i], -1);
				Arrays.fill(dpB[i], INF);
			}
			dpA[0][0] = 0;
			dpB[0][0] = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < dpA[i].length; j++) {
					if(dpA[i][j] == -1) continue;
					//not buy
					if(dpA[i+1][j] < dpA[i][j] || (dpA[i+1][j] == dpA[i][j] && dpB[i+1][j] > dpB[i][j])) {
						dpA[i+1][j] = dpA[i][j];
						dpB[i+1][j] = dpB[i][j];
					}
					//buy only 1k
					int o2 = (1000 - (p[i]%1000))%1000;
					if(dpA[i+1][j + o2] < dpA[i][j] || (dpA[i+1][j + o2] == dpA[i][j] && dpB[i+1][j + o2] > dpB[i][j] + p[i])) {
						dpA[i+1][j + o2] = dpA[i][j];
						dpB[i+1][j + o2] = dpB[i][j] + p[i];
					}
					
					//buy
					o2 = (1000 - (p[i]%1000))%1000;
					int need = 500 - o2;
					if(j >= need) {
						int nex = j - need;
						if(dpA[i+1][nex] < dpA[i][j] + 1 || (dpA[i+1][nex] == dpA[i][j]+1 && dpB[i+1][nex] > dpB[i][j] + p[i])) {
							dpA[i+1][nex] = dpA[i][j] + 1;
							dpB[i+1][nex] = dpB[i][j] + p[i];
						}
					}
				}
			}
			int ans = 0;
			int MAX = INF;
			for(int i = 0; i < dpA[n].length; i++) {
				if(ans < dpA[n][i] || (ans == dpA[n][i] && MAX > dpB[n][i])) {
					ans = dpA[n][i];
					MAX = dpB[n][i];
				}
			}
			System.out.println(ans + " " + MAX);
			
			
		}
	}
		
	
}

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
}