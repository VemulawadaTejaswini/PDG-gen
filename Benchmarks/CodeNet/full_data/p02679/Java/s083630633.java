import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main{
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	final long MOD=1000000007;
	int MAX=(int)4e5;
	long[] p2=new long[MAX];
	{
		p2[0]=1;
		for (int i=1;i<p2.length;++i) p2[i]=p2[i-1]*2%MOD;
	}
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		HashMap<List<Long>,Integer> p=new HashMap<>();
		HashMap<List<Long>,Integer> n=new HashMap<>();
		long zero=0;
		int azero=0;
		int bzero=0;
		for (int i=0;i<N;++i) {
			long A=sc.nextLong();
			long B=sc.nextLong();
			if (A==0 && B==0) ++zero;
			else if (A==0) ++azero;
			else if (B==0) ++bzero;
			else {
				long g=gcd(Math.abs(A),Math.abs(B));
				A/=g;B/=g;
				List<Long> add=List.of(Math.abs(A),Math.abs(B));
				if (Math.signum(A)*Math.signum(B)==1) {
					if (p.containsKey(add)) {
						p.put(add, p.get(add)+1);
					} else {
						p.put(add, 1);
					}
				} else {
					if (n.containsKey(add)) {
						n.put(add, n.get(add)+1);
					} else {
						n.put(add, 1);
					}
				}
			}
		}
		long ans2=1;
		for (var entry:p.entrySet()) {
			var vp=entry.getKey();
			var vn=List.of(vp.get(1),vp.get(0));
			if (n.containsKey(vn)) {
				ans2=ans2*(p2[entry.getValue()]+p2[n.get(vn)]+MOD-1)%MOD;
			} else {
				ans2=ans2*(p2[entry.getValue()])%MOD;
			}
		}
		for (var entry:n.entrySet()) {
			var vn=entry.getKey();
			var vp=List.of(vn.get(1),vn.get(0));
			if (!p.containsKey(vp)) {
				ans2=ans2*p2[entry.getValue()]%MOD;
			}
		}
		ans2=ans2*(p2[azero]+p2[bzero]+MOD-1)%MOD;
		System.out.println((ans2+MOD-1+zero)%MOD);
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