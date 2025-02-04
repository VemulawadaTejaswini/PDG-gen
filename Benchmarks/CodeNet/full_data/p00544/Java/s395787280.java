import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] flag = new char[N][M];
		for(int i = 0; i < N; i++) {
			flag[i] = sc.next().toCharArray();
		}
		int MAX = INF;
		for(int i = 0; i < N-2; i++) {
			for(int j = i+1; j < N-1; j++) {
				int sum = 0;
				for(int k = 0; k <= i; k++) {
					for(int l = 0; l < M; l++) {
						if(flag[k][l] != 'W')sum++;
					}
				}
				for(int k = i+1; k <= j; k++) {
					for(int l = 0; l < M; l++) {
						if(flag[k][l] != 'B')sum++;
					}
				}
				for(int k = j+1; k < N; k++) {
					for(int l = 0; l < M; l++) {
						if(flag[k][l] != 'R')sum++;
					}
				}
				MAX = Math.min(MAX, sum);
			}
		}
		System.out.println(MAX);
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
    	return (int)nextLong();
    }
}