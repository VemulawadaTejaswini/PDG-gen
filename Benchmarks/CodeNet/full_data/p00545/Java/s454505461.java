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
		long T = sc.nextLong();
		int Q = sc.nextInt();
		Node[] nodes = new Node[N];
		for(int i = 0; i < N; i++) {
			long x = sc.nextLong();
			boolean toLeft = sc.nextInt()==1?false:true;
			nodes[i] = new Node(i+1,x,toLeft);
		}
		int stopCount = 0;
		while(stopCount != N) {
			for(int i = 0; i < N; i++) {
				if(nodes[i].stop) continue;
				if(nodes[i].toLeft) {
					if(i != 0 && nodes[i-1].stop) {
						stopCount++;
						nodes[i].stop = true;
						nodes[i].x = Math.max(nodes[i-1].x, nodes[i].x - T);
					}
					else if(i != 0 && !nodes[i-1].toLeft) {
						stopCount += 2;
						nodes[i].stop = true;
						nodes[i-1].stop = true;
						long t = (nodes[i].x - nodes[i-1].x) / 2;
						if(t > T) {
							nodes[i].x -= T;
							nodes[i-1].x += T;
						}
						else {
							nodes[i].x -= t;
							nodes[i-1].x += t;
						}
						
					}
					else if(i == 0) {
						stopCount++;
						nodes[i].stop = true;
						nodes[i].x -= T;
					}
				}
				else if(!nodes[i].toLeft) {
					if(i != N-1 && nodes[i+1].stop) {
						stopCount++;
						nodes[i].stop = true;
						nodes[i].x = Math.min(nodes[i+1].x, nodes[i].x + T);
					}
					else if(i != N-1 && nodes[i+1].toLeft) {
						stopCount += 2;
						nodes[i].stop = true;
						nodes[i+1].stop = true;
						long t = (nodes[i+1].x - nodes[i].x) / 2;
						if(t > T) {
							nodes[i].x += T;
							nodes[i+1].x -= T;
						}
						else {
							nodes[i].x += t;
							nodes[i+1].x -= t;
						}
					}
					else if(i == N-1) {
						stopCount++;
						nodes[i].stop = true;
						nodes[i].x += T;
					}
				}
			}
		}
		for(int i = 0; i < Q; i++) {
			int id = sc.nextInt()-1;
			System.out.println(nodes[id].x);
		}
		
		
		
	}
	static class Node{
		int id;
		long x;
		boolean toLeft;
		boolean stop;
		Node(int id, long x, boolean toLeft) {
			this.id = id;
			this.x = x;
			this.toLeft = toLeft;
			this.stop = false;
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
    	return (int)nextLong();
    }
}