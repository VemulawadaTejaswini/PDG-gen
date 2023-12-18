
import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[] a = sc.nextIntArray(N);
        long[] sum = new long[N+1];
        long ans = 0;
        for(int i = 0; i<N; i++) {
            sum[i+1] = sum[i]+a[i];
            //p((i+1)+" "+sum[i+1]);
            //if(sum[i+1]==0)ans++;
        }
        //p(ans);
        Arrays.sort(sum);
        long pre = sum[1];
        long cnt = 1;
        //for(int i = 0; i<=N; i++)p(i+" "+sum[i]);
        for(int i = 1; i<N; i++) {
            if(sum[i] == sum[i+1]) {
                cnt++;
            }else {
                if(sum[i] == 0) cnt++;
                ans += (long)cnt*(cnt-1)/2;
                cnt = 1;
            }
        }
        ans += (long)cnt*(cnt-1)/2;
	    p(ans);
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
        return max;
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
        } else {
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
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    public int[] nextIntArray(int N) {
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = nextInt();
        }
        return a;
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}