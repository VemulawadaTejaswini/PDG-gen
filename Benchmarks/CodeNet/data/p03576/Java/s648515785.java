
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
public class Main {
    private static final PrintStream ps     = System.out;
    private static final InputStream IS     = System.in;
    private static final byte[]      BUFFER = new byte[1024];
    private static int               ptr    = 0;
    private static int               buflen = 0;

    public static void main(String[] args) {
        int n = ni();
        int k = ni();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = ni();
            y[i] = ni();
        }
        
        int[] xc = x.clone();
        int[] yc = y.clone();
        Arrays.sort(xc);
        Arrays.sort(yc);
        
        long min = Long.MAX_VALUE;
        for (int ix1 = 0; ix1 < n; ix1++) {
            for (int ix2 = ix1 + 1; ix2 < n; ix2++) {
                for (int iy1 = 0; iy1 < n; iy1++) {
                    for (int iy2 = iy1 + 1; iy2 < n; iy2++) {
                        
                        int countK = 0;
                        for (int i = 0; i < n; i++)
                            if (x[i] >= xc[ix1] && x[i] <= xc[ix2] && y[i] >= yc[iy1] && y[i] <= yc[iy2])
                                countK++;
                      
                        if (countK >= k)
                            min = Math.min(min, (long)(xc[ix2] - xc[ix1]) * (yc[iy2] - yc[iy1]));
                    }
                }
            }
        }
        ps.println(min);
    }

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
