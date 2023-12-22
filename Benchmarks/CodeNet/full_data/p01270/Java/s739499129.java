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
	static char[] in;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			if(N == 0) break;
			PriorityQueue<Data> e = new PriorityQueue<Data>();
			e.add(new Data(0,1000000001,-1));
			for(int i = 0; i < N; i++) {
				char OP = sc.next().charAt(0);
				if(OP == 'W') {
					int a = sc.nextInt();
					int b = sc.nextInt();
					PriorityQueue<Data> cp = new PriorityQueue<Data>();
					while(b > 0) {
						Data tmp = e.poll();
						if(tmp.id != -1) cp.add(tmp);
						else {
							int canSize = tmp.R - tmp.L + 1;
							if(canSize > b) {
								Data mm = new Data(tmp.L + b, tmp.R,-1);
								tmp.id = a;
								tmp.R = tmp.L + b-1;
								cp.add(mm);
								cp.add(tmp);
								b = 0;
							}
							else {
								b -= canSize;
								tmp.id = a;
								cp.add(tmp);
							}
						}
					}
					e.addAll(cp);
				}
				else if(OP == 'D') {
					int a = sc.nextInt();
					PriorityQueue<Data> cp = new PriorityQueue<Data>();
					while(!e.isEmpty()) {
						Data tmp = e.poll();
						if(tmp.id != a) cp.add(tmp);
						else {
							tmp.id = -1;
							cp.add(tmp);
						}
					}
					e = cp;
				}
				else {
					int a = sc.nextInt();
					PriorityQueue<Data> cp = new PriorityQueue<Data>();
					while(e.peek().R < a) cp.add(e.poll());
					System.out.println(e.peek().id);
					while(!cp.isEmpty()) e.add(cp.poll());
				}
			}
			System.out.println();
		}
		
	}
	static class Data implements Comparable<Data>{
		int L;
		int R;
		int id;
		Data(int a, int b, int c) {
			L = a;
			R = b;
			id = c;
		}
		@Override
		public int compareTo(Data o) {
			return this.L - o.L;
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