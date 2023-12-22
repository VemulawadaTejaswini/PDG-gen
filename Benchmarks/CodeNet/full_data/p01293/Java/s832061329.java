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

	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			char in = sc.next().charAt(0);
			if(in == '#') break;
			int type = 0;
			if(in == 'S') type = 0;
			if(in == 'H') type = 1;
			if(in == 'D') type = 2;
			if(in == 'C') type = 3;
			
			Data[][] data = new Data[4][13]; 
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 13; j++) {
					char[] inx = sc.next().toCharArray();
					int st = 0;
					int ty = 0;
					if(inx[0] == 'T') st = 10;
					else if(inx[0] == 'J') st = 11;
					else if(inx[0] == 'Q') st = 12;
					else if(inx[0] == 'K') st = 13;
					else if(inx[0] == 'A') st = 14;
					else st = inx[0] - '0';
					
					if(inx[1] == 'S') ty = 0;
					if(inx[1] == 'H') ty = 1;
					if(inx[1] == 'D') ty = 2;
					if(inx[1] == 'C') ty = 3;
					
					data[i][j] = new Data(st,ty);
				}
			}
			int[] win = new int[4];
			int leader = 0;
			for(int i = 0; i < 13; i++) {
				boolean isT = false;
				int high = -1;
				int id   = -1;
				int leaderType = data[leader][i].type;
				for(int j = 0; j < 4; j++) {
					Data tmp = data[j][i];
					if(tmp.type == type) {
						if(isT) {
							if(high < tmp.str) {
								high = tmp.str;
								id = j;
							}
						}
						else {
							isT = true;
							high = tmp.str;
							id = j;
						}
					}
					else {
						if(isT) {
							continue;
						}
						else {
							if(high < tmp.str && leaderType == tmp.type) {
								high = tmp.str;
								id = j;
							}
						}
					}	
				}
				win[id]++;
				leader = id;
			}
			if(win[0] + win[2] > win[1] + win[3]) {
				System.out.println("NS" + (win[0] + win[2] - 6));
			}
			else {
				System.out.println("EW" + (win[1] + win[3] - 6));
			}
			
			
		}
	}
	
	static class Data {
		int str;
		int type;
		Data(int a, int b) {
			str = a;
			type = b;
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