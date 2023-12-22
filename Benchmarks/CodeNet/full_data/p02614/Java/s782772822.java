import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
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

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();
		char[][] c=new char[H][W];
		int ans=0;
		for (int i=0;i<H;++i) {
			c[i]=sc.next().toCharArray();
		}
		for (int s0=0;s0<1<<H;++s0) {
			for (int s1=0;s1<1<<W;++s1) {
				int cnt=0;
				boolean f0=false;
				for (int i=0;i<H;++i) {
					f0=(s0>>i)%2==1;
					for (int j=0;j<W;++j) {
						boolean f1=(s1>>j)%2==1;
						if (c[i][j]=='#'&&!f0&&!f1) {
							++cnt;
						}
					}
				}
				if (cnt==K) {
					++ans;
				}
			}
		}
		
		System.out.println(ans);
	}
	
	
	
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}

