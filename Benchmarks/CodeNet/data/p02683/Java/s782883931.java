import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main{
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();
		int[] C=new int[N];
		int[][] A=new int[N][M];
		for (int i=0;i<N;++i) {
			C[i]=sc.nextInt();
			for (int j=0;j<M;++j) {
				A[i][j]=sc.nextInt();
			}
		}
		long INF=Long.MAX_VALUE/3;
		long ans=INF;
		for (int s=0;s<1<<N;++s) {
			long[] sum=new long[N];
			long cost=0;
			for (int i=0;i<N;++i) {
				if ((s>>i)%2==0) continue;
				cost+=C[i];
				for (int j=0;j<M;++j) {
					sum[j]+=A[i][j];
				}
			}
			boolean ok=true;
			for (int i=0;i<M;++i) ok&=sum[i]>=X;
			if (ok) {
				ans=Math.min(ans, cost);
			}
		}
		System.out.println(ans==INF?-1:ans);
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