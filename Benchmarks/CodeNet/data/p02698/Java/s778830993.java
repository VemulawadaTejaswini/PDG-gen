import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main implements Runnable{
	
	public static void main(String[] args) {
		new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
	}
	
	void dfs(int cur,int par,ArrayList<Integer>[] g,int[] A,int[] dp) {
		int N=g.length;
		
		int ok=-1;
		int ng=N;
		while (ng-ok>1) {
			int m=(ok+ng)/2;
			if (dp[m]<A[cur]) ok=m;
			else ng=m;
		}
		int pre=dp[ok+1];
		dp[ok+1]=A[cur];
		
		for (int dst:g[cur]) {
			if (dst==par) continue;
			dfs(dst,cur,g,A,dp);
		}

		ans[cur]=(ok+1)+1;
		dp[ok+1]=pre;
	}

	int[] ans;
	
	public void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int[] A=new int[N];
		for (int i=0;i<N;++i) A[i]=sc.nextInt()-1;
		ArrayList<Integer>[] g=new ArrayList[N];
		for (int i=0;i<N;++i) g[i]=new ArrayList<>();
		for (int i=0;i<N-1;++i) {
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			g[u].add(v);
			g[v].add(u);
		}
		int INF=Integer.MAX_VALUE/3;
		int[] dp=new int[N];
		ans=new int[N];
		Arrays.fill(dp, INF);
		Arrays.fill(ans, -1);
		dfs(0,-1,g,A,dp);
		for (int i=0;i<N;++i) {
			System.out.println(ans[i]);
		}
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