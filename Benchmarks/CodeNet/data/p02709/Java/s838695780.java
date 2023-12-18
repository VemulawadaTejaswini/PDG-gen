import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	final long MOD=(long)1e9+7;
	
	long pow(long a,long n) {
		return n==0?1:(pow(a*a%MOD,n/2)*(n%2==1?a:1))%MOD;
	}
	
	long inv(long a) {
		return pow(a,MOD-2);
	}
	
	long mul(long...a) {
		long r=1;
		for (long v:a) r=r*v%MOD;
		return r;
	}
	
	long add(long...a) {
		long r=0;
		for (long v:a) r=(r+v)%MOD;
		return r;
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		long[][] A=new long[N][2];
		for (int i=0;i<N;++i) {
			A[i][0]=sc.nextLong();
			A[i][1]=i;
		}
		Arrays.sort(A, Comparator.comparing((long[] v)-> -v[0]));
		long[][] dp=new long[N+1][N+1];
		long INF=Long.MAX_VALUE/3;
		for (int i=0;i<=N;++i) for (int j=0;j<=N;++j) dp[i][j]=-INF;
		dp[0][0]=0;
		long ans=-INF;
		for (int i=0;i<N;++i) {
			for (int L=0;L<=N;++L) {
				int R=i-L;
				if (R<0||dp[L][R]==-INF) continue;
				dp[L+1][R]=Math.max(dp[L+1][R], dp[L][R]+A[i][0]*Math.abs(A[i][1]-L));
				dp[L][R+1]=Math.max(dp[L][R+1], dp[L][R]+A[i][0]*Math.abs(A[i][1]-(N-1-R)));
				ans=Math.max(ans, dp[L+1][R]);
				ans=Math.max(ans, dp[L][R+1]);
			}
		}
		System.out.println(ans);
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