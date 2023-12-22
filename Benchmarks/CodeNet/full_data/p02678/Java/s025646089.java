import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main{
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Integer>[] g=new ArrayList[N];
		for (int i=0;i<N;++i) {
			g[i]=new ArrayList<>();
		}
		for (int i=0;i<M;++i) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			g[a].add(b);
			g[b].add(a);
		}
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.add(0);
		int INF=Integer.MAX_VALUE/3;
		int[] dist=new int[N];
		int[] back=new int[N];
		Arrays.fill(dist, INF);
		Arrays.fill(back, -1);
		dist[0]=0;
		while (!dq.isEmpty()) {
			int v=dq.pollFirst();
			for (int dst:g[v]) {
				if (dist[dst]!=INF) continue;
				dist[dst]=dist[v]+1;
				back[dst]=v;
				dq.addLast(dst);
			}
		}
		PrintWriter pw=new PrintWriter(System.out);
		pw.println("Yes");
		for (int i=1;i<N;++i) {
			pw.println(back[i]+1);
		}
		pw.flush();
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
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
