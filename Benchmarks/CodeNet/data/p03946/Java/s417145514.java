import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import static java.lang.Math.max;



public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n=fsc.nextInt();
        long t=fsc.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=fsc.nextLong();
        }
        long[] max=new long[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                max[i]=a[i];
            } else{
                max[i]=max(a[i], max[i+1]);
            }
        }
        long delMax=0;
        for(int i=0;i<n-1;i++){
            delMax=max(delMax, max[i+1]-a[i]);
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(max[i+1]-a[i]==delMax){
                ans++;
            }
        }
        System.out.println(ans);
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
