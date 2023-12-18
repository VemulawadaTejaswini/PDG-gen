import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main implements Runnable {	
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
		//long t = System.currentTimeMillis();
		new Thread(null,new Main(), ""	,Runtime.getRuntime().maxMemory()).start();;
		//System.err.println(System.currentTimeMillis() - t);
	}
	
	final long MOD=(long)1e9+7;
	int MAX=(int)3e5;
	long[] fac=new long[MAX];
	long[] ifac=new long[MAX];
	long[] inv=new long[MAX];
	{
		fac[0]=fac[1]=ifac[0]=ifac[1]=inv[0]=inv[1]=1;
		for(int i=2;i<MAX;++i) {
			fac[i]=i*fac[i-1]%MOD;
			inv[i]=MOD-inv[(int)(MOD%i)]*(MOD/i)%MOD;
			ifac[i]=inv[i]*ifac[i-1]%MOD;
		}
	}
	
	long pow(long a,long n) {
		long ret=1;
		for(;n>0;n>>=1,a=a*a%MOD)if(n%2==1)ret=ret*a%MOD;
		return ret;
	}
	
	long inv(long a) {
		return pow(a,MOD-2);
	}
	
	long mul(long...a) {
		long ret=1;
		for(long v:a)ret=ret*v%MOD;
		return ret;
	}
	
	long comb(int n,int k) {
		if(n<0||k<0||n-k<0)return 0;
		return mul(fac[n],ifac[k],ifac[n-k]);
	}
	
	void dfs1(int cur,int par,ArrayList<Integer>[] g) {
		sz[cur]++;
		dp[cur]=1;
		for(int dst:g[cur]) {
			if(dst==par)continue;
			dfs1(dst,cur,g);
			sz[cur]+=sz[dst];
			dp[cur]=mul(dp[cur],dp[dst],ifac[sz[dst]]);
		}
		dp[cur]=mul(dp[cur],fac[sz[cur]-1]);
	}
	
	void dfs2(int cur,int par,ArrayList<Integer>[] g,long pre) {
		int a=sz[0]-1;
		int b=sz[cur]-1;
		ans[cur]=mul(comb(a,b),pre,dp[cur]);
		for(int dst:g[cur]) {
			if(dst==par)continue;
			dfs2(dst, cur, g, mul(ans[cur], inv(dp[dst]), inv(comb(sz[0]-1,sz[dst]))));
		}
	}
	
	long[] dp;
	int[] sz;
	long[] ans;
	
	public void run() {
		FastScanner sc = new FastScanner();
		int N=sc.nextInt();
		ArrayList<Integer>[] g=new ArrayList[N];
		for(int i=0;i<N;++i)g[i]=new ArrayList<>();
		for(int i=0;i<N-1;++i) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			--a;--b;
			g[a].add(b);
			g[b].add(a);
		}
		dp=new long[N];
		sz=new int[N];
		ans=new long[N];
		dfs1(0,-1,g);
		dfs2(0,-1,g,1);
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0;i<N;++i) {
			pw.println(ans[i]);
		}
		pw.close();
	}
	
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
