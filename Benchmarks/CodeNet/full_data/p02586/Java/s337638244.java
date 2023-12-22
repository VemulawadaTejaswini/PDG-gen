import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;

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
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc = new FastScanner();
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();
		int[] h=new int[K];
		int[] w=new int[K];
		long[][][] dp=new long[4][H][W];
		long[][] v=new long[H][W];
		for (int i=0;i<K;++i) {
			h[i]=sc.nextInt()-1;
			w[i]=sc.nextInt()-1;
			v[h[i]][w[i]]=sc.nextLong();
		}
		dp[1][0][0]=Math.max(0, v[0][0]);
		for (int y=0;y<H;++y) {
			for (int x=0;x<W;++x) {
				int[] dx= {1,0};
				int[] dy= {0,1};
				for (int i=0;i<2;++i) {
					int nx=x+dx[i];
					int ny=y+dy[i];
					if (nx<0||ny<0||nx>=W||ny>=H) continue;
					for (int src=0;src<=3;++src) {
						dp[src][ny][nx]=Math.max(dp[src][ny][nx], dp[src][y][x]);
						if (dx[i]==1 && src<3) {
							dp[src+1][ny][nx]=Math.max(dp[src+1][ny][nx], dp[src][y][x]+v[ny][nx]);
						} else if (dy[i]==1) {
							dp[0][ny][nx]=Math.max(dp[0][ny][nx], dp[src][y][x]);
							dp[1][ny][nx]=Math.max(dp[1][ny][nx], dp[src][y][x]+v[ny][nx]);
						}
					}
				}
			}
		}
		long ans=0;
		for (int sum=0;sum<=3;++sum) {
			ans=Math.max(ans, dp[sum][H-1][W-1]);
		}
		System.out.println(ans);
	}
	
	void tr(Object...o) {System.out.println(Arrays.deepToString(o));}
}
