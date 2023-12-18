import java.io.*;
import java.util.*;
public class Main {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int H = sc.nextInt();
		int W = sc.nextInt();
		if(W != 3) {
			System.out.println("0");
			return;
		}
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++) {
			map[i] = sc.next().toCharArray();
		}
		int score = 0;
		for(int i = 0; i < H * W; i++) {
			int[] count = new int[W];
			for(int j = 0; j < W; j++) {
				if(map[H-1][j] == '-') count[j] = (int)-MOD;
				else count[j]++;
			}
			for(int j = 0; j < W; j++) {
				for(int k = H - 2; k >= 0; k--) {
					if(j != 0) {
						if(map[H-1][j] == '-') ;
						else if(map[k][j - 1] == '-') ;
						else if(map[H-1][j] == map[k][j - 1]) count[j]++;
						
					}
					if(j != W-1) {
						if(map[H-1][j] == '-') ;
						else if(map[k][j + 1] == '-') ;
						else if(map[H-1][j] == map[k][j + 1]) count[j]++;
					}
				}
			}
			/*
			for(int j = 0; j < W; j++) {
				for(int k = 0; k < H-1; k++) {
					if(j != 0) {
						if(map[k][j] == '-') ;
						else if(map[k+1][j - 1] == '-') ;
						else if(map[k][j] == map[k+1][j - 1]) count[j]--;
						
					}
					if(j != W-1) {
						if(map[k][j] == '-') ;
						else if(map[k+1][j + 1] == '-') ;
						else if(map[k][j] == map[k+1][j + 1]) count[j]--;
					}
				}
			}
			*/
			for(int j = 0; j < W; j++) {
				for(int k = 0; k < H; k++) {
					if(j != 0) {
						if(map[k][j] == '-') ;
						else if(map[k][j - 1] == '-') ;
						else if(map[k][j] == map[k][j - 1]) count[j]--;
						
					}
					if(j != W-1) {
						if(map[k][j] == '-') ;
						else if(map[k][j] == '-') ;
						else if(map[k][j] == map[k][j + 1]) count[j]--;
					}
				}
			}
			int min = (int)-MOD;
			int id  = -1;
			
			for(int j = 0; j < W; j++) {
				if(min < count[j]) {
					min = count[j];
					id = j;
				}
			}
			for(int j = 0; j < H; j++) {
				if(id != 0) {
					if(map[j][id] == '-') ;
					else if(map[j][id-1] == '-') ;
					else if(map[j][id] == map[j][id - 1]) score++;
					
				}
				if(id != W-1) {
					if(map[j][id] == '-') ;
					else if(map[j][id+1] == '-') ;
					else if(map[j][id] == map[j][id + 1]) score++;
				}
			}
			
			for(int j = H-1; j >= 1; j--) {
				map[j][id] = map[j-1][id];
			}
			map[0][id] = '-';
			//System.out.println(min + " " + score);
			//for(int j = 0; j < H; j++) {
			//	System.out.println(String.valueOf(map[j]));
			//}
			
		}
		System.out.println(score);

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
    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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