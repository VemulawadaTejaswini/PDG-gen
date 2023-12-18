import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;
public class Main {
    private static final PrintStream ps     = System.out;
    private static final InputStream IS     = System.in;
    private static final byte[]      BUFFER = new byte[1024];
    private static int               ptr    = 0;
    private static int               buflen = 0;

    public static void main(String[] args) {
        int n = ni();
        long c = nl();
        long[] x = new long[n];
        long[] v = new long[n];
        long[] sum = new long[n];
        long[] sumMax = new long[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = nl();
            v[i] = nl();
        }
        
        sum[0] = v[0] - x[0];
        sumMax[0] = Math.max(0, sum[0]);
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + v[i] - (x[i] - x[i-1]);
            sumMax[i] = Math.max(sumMax[i-1], sum[i]);
        }
        
        long[] sumR = new long[n];
        sumR[0] = v[n-1] - (c-x[n-1]); 
        long[] sumRMax = new long[n];
        sumRMax[0] = Math.max(0, sumR[0]);
        long ans = Integer.MIN_VALUE;
        
        for (int i = 1; i < n; i++) {
            sumR[i] = sumR[i-1] + v[n-i-1] - (x[n-i] - x[n-i-1]);
            sumRMax[i] = Math.max(sumRMax[i-1], sumR[i]);
            if (i != n-1)
                ans = Math.max(ans, sumRMax[i] - Math.min(c - x[n-i-1], x[n-i-2]) + sumMax[n-i-2]);
        }
        
        ans = Math.max(0 + sumMax[n-1], ans);
        ans = Math.max(sumRMax[n-1] + 0, ans);
        ps.println(ans < 0 ? 0 : ans);
    }
    
    // input
    private static boolean hasNextByte() {
        if (ptr < buflen)
            return true;
        else {
            ptr = 0;
            try {
                buflen = IS.read(BUFFER);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0)
                return false;
        }
        return true;
    }

    private static int readByte() {
        if (hasNextByte())
            return BUFFER[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(BUFFER[ptr]))
            ptr++;
        return hasNextByte();
    }

    public static String n() {
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

    public static long nl() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b)
            throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b))
                return minus ? -n : n;
            else
                throw new NumberFormatException();
            b = readByte();
        }
    }

    public static int ni() {
        long nl = nl();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public static double nextDouble() {
        return Double.parseDouble(n());
    }

    private static int[] nia(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }
}
