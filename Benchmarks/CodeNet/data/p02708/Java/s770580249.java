import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		int K=sc.nextInt();
		// 0,1,..,N
		long ans=0;
		for (long num=K;num<=N+1;++num) {
			long min=mul(num,num-1,inv(2));
			long max=mul(num,N+(N-(num-1)),inv(2));
			long add=(max-min+1)%MOD;
			add=(add+MOD)%MOD;
			ans=add(ans,add);
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