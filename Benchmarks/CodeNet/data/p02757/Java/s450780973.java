import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	long pow(long a,long n,long p) {
		long ret=1;
		for(;n>0;n>>=1,a=a*a%p) {
			if(n%2==1)ret=ret*a%p;
		}
		return ret;
	}
	
	long inv(long a,long p) {
		if(a==0)throw new AssertionError();
		return pow(a,p-2,p);
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int P=sc.nextInt();
		char[] cs=sc.next().toCharArray();
		if(P==2||P==5) {
			long ans=0;
			for(int i=0;i<cs.length;++i) {
				if((cs[i]-'0')%P==0) {
					ans+=i+1;
				}
			}
			System.out.println(ans);
			return;
		}//3***,354*,***3,
		long[] cnt=new long[P];
		long ans=0;
		long cur=0;
		for(int i=0;i<cs.length;++i) {
			int v=(int)(cs[i]-'0')%P;
			cur=(cur*10+v)%P;
			if(cur==0)++ans;
			long i10=inv(pow(10,i,P),P);
			ans+=cnt[(int)(i10*cur%P)];
			cnt[(int)(i10*cur%P)]++;
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
    
    int nextInt() {
    	return (int)nextLong();
    }
}