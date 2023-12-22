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
	static final int[] vy_4 = {0,-1,0,1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static char[] check;
	static int idx;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		boolean[] isntPrime = new boolean[1000001];
		int[][] map = new int[2000][2000];
		boolean[][] isPrime = new boolean[2000][2000];
		primeList.add(2);
		for(int i = 3; i < 1000001; i += 2) {
			if(!isntPrime[i]) {
				primeList.add(i);
				for(int j = i + i; j < 1000001; j += i) {
					isntPrime[j] = true;
				}
			}
		}
		int d = -1;
		int tx = 1000;
		int ty = 1000;
		int pid = 0;
		for(int i = 1; i < 1000001; i++) {
			map[ty][tx] = i;
			if(pid < primeList.size() && primeList.get(pid) == i) {
				isPrime[ty][tx] = true;
				pid++;
			}
			int lx = vx_4[(d+1)%4] + tx;
			int ly = vy_4[(d+1)%4] + ty;
			if(map[ly][lx] == 0) {
				d++;
				tx = lx;
				ty = ly;
			}
			else {
				tx = vx_4[d%4] + tx;
				ty = vy_4[d%4] + ty;
			}
		}
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0) break;
			int sx = 0;
			int sy = 0;
			IN:for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map[i].length; j++) {
					if(map[i][j] == n) {
						sy = i;
						sx = j;
						break IN;
					}
				}
			}
			int maxAns = -1;
			int outAns = -1;
			int[][] dpA = new int[map.length+1][map[0].length];
			int[][] dpB = new int[map.length+1][map[0].length];
			for(int i = 0; i < dpA.length; i++) Arrays.fill(dpA[i], -1);
			if(isPrime[sy][sx]) {
				dpA[sy][sx] = 1;
				dpB[sy][sx] = n;
			}
			else {
				dpA[sy][sx] = 0;
				dpB[sy][sx] = 0;
			}
			
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map[0].length; j++) {
					
					if(dpA[i][j] == -1) continue;
					for(int k = -1; k <= 1; k++) {
						int tX = j + k;
						if(tX < 0 || tX >= map[0].length) continue;
						if(i + 1 >= map.length || map[i+1][tX] > m || map[i+1][tX] == 0) {
							if(maxAns < dpA[i][j] || (maxAns == dpA[i][j] && outAns < dpB[i][j])) { 
								maxAns = dpA[i][j];
								outAns = dpB[i][j];
							}
						}
						else {
							if(isPrime[i+1][tX]) {
								int nA = dpA[i][j] + 1;
								int nB = map[i+1][tX];
								if(dpA[i+1][tX] < nA || dpA[i+1][tX] == nA && dpB[i+1][tX] < nB) {
									dpA[i+1][tX] = nA;
									dpB[i+1][tX] = nB;
								}
							}
							else {
								int nA = dpA[i][j];
								int nB = dpB[i][j];
								if(dpA[i+1][tX] < nA || dpA[i+1][tX] == nA && dpB[i+1][tX] < nB) {
									dpA[i+1][tX] = nA;
									dpB[i+1][tX] = nB;
								}
							}
						}
						
					}
				}
			}
			if(maxAns == 0) outAns = 0;
			System.out.println(maxAns + " " + outAns);
			
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