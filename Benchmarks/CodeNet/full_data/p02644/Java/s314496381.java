import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();
		int sx=sc.nextInt()-1;
		int sy=sc.nextInt()-1;
		int tx=sc.nextInt()-1;
		int ty=sc.nextInt()-1;
		char[][] map=new char[H][W];
		for (int i=0;i<H;++i) {
			map[i]=sc.next().toCharArray();
		}
		class State implements Comparable<State>{
			int x;
			int y;
			int cnt;
			int dir;
			int dist;
			public State(int x,int y,int cnt,int dir,int dist) {
				this.x=x;
				this.y=y;
				this.cnt=cnt;
				this.dir=dir;
				this.dist=dist;
			}
			public int compareTo(State o) {
				if (dist!=o.dist) {
					return Integer.compare(dist, o.dist);
				} else {
					return Integer.compare(cnt, o.cnt);
				}
			};
		}
		PriorityQueue<State> pq=new PriorityQueue<>();
		int[][][] dist=new int[H][W][4];
		int[][][] cnt=new int[H][W][4];
		int[] dx={1,-1,0,0};
		int[] dy={0,0,1,-1};
		int INF=Integer.MAX_VALUE/3;
		for (int i=0;i<H;++i) for (int j=0;j<W;++j) for (int dir=0;dir<4;++dir) dist[i][j][dir]=INF;
		for (int dir=0;dir<4;++dir) {
			pq.add(new State(sx, sy, 0, dir, 0));
			dist[sx][sy][dir]=0;
		}
		while (!pq.isEmpty()) {
			State s=pq.poll();
			if (dist[s.x][s.y][s.dir]!=s.dist||cnt[s.x][s.y][s.dir]!=s.cnt) continue;
			for (int ndir=0;ndir<4;++ndir) {
				int nx=s.x+dx[ndir];
				int ny=s.y+dy[ndir];
				int ncnt=s.cnt+1;
				int ndist=s.dist;
				if (s.dir!=ndir||ncnt>K) {
					ncnt=1;
					ndist=ndist+1;
				}
				if (!(0<=nx&&nx<H&&0<=ny&&ny<W&&map[nx][ny]!='@')) continue;
				State ns=new State(nx, ny, ncnt, ndir, ndist);
				if (ns.compareTo(new State(nx,ny,cnt[nx][ny][ndir],ndir,dist[nx][ny][ndir]))==-1) {
					dist[nx][ny][ndir]=ndist;
					cnt[nx][ny][ndir]=ncnt;
					pq.add(ns);
				}
				
			}
		}
		int ans=Integer.MAX_VALUE;
		for (int dir=0;dir<4;++dir) {
			ans=Math.min(ans, dist[tx][ty][dir]);
		}
		System.out.println(ans>H*W?-1:(ans+1));
	}

	void tr(Object...o) {System.out.println(Arrays.deepToString(o));}
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
