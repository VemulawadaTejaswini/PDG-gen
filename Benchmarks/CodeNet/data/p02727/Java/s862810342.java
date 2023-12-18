import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long t = System.currentTimeMillis();
		new Main().run();
		System.err.println(System.currentTimeMillis() - t);
	}
	
	
	void run() {
		FastScanner sc = new FastScanner();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		long[] p=new long[A];
		long[] q=new long[B];
		long[] r=new long[C];
		for(int i=0;i<p.length;++i)p[i]=sc.nextLong();
		for(int i=0;i<q.length;++i)q[i]=sc.nextLong();
		for(int i=0;i<r.length;++i)r[i]=sc.nextLong();
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		long[] sp=new long[A];
		long[] sq=new long[B];
		long[] sr=new long[C];
		for(int i=0;i<A;++i)sp[i]=p[i]+(i>0?sp[i-1]:0);
		for(int i=0;i<B;++i)sq[i]=q[i]+(i>0?sq[i-1]:0);
		for(int i=0;i<C;++i)sr[i]=r[i]+(i>0?sr[i-1]:0);
		long ans=0;
		// s,...,A-1の赤リンゴ使用(A-s個)
		// t,...,B-1の緑リンゴ使用(B-t個)
		// u,...,C-1の無リンゴ使用（C-u個)
		int t=B;
		int u=C;
		for(int s=0;s<=A;++s) {
			// A-s個赤リンゴ使用
			if(A-s>X)continue;
			// X-(A-s)個赤リンゴ足りない
			while(C-u<X-(A-s))--u;
			while((A-s)+(B-t)+(C-u)<X+Y) {
				if(u>0&&r[u-1]>(t==0?0:q[t-1])) {
					--u;
				}else if(t>0&&(u==0?0:r[u-1])<=q[t-1]){
					--t;
				}else {
					break;
				}
			}
			if((A-s)+(B-t)+(C-u)==X+Y&&s>=0&&t>=0&&u>=0) {
				ans=Math.max(ans, sp[A-1]+sq[B-1]+sr[C-1]-(s==0?0:sp[s-1])-(t==0?0:sq[t-1])-(u==0?0:sr[u-1]));
			}
		}
		System.out.println(ans);
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
