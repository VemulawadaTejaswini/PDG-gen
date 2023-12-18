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
        int[][] wishB = new int[k][k];
        int[][] wishW = new int[k][k];
        for (int i = 0; i < n; i++) {
            int x = ni();
            int y = ni();
            int c = n().charAt(0);
            if (x >= k) {
                x = x % k;
                c = c == 'B' ? 'W' : 'B';
            }
            if (y >= k) {
                y = y % k;
                c = c == 'B' ? 'W' : 'B';
            }
            
            if (c == 'B')
                wishB[x][y]++;
            else 
                wishW[x][y]++;
                
        }
        
        int[][] sum = new int[k+1][k+1];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                sum[0][0] += wishB[i][j];
            }
        }
        
        for (int isum = 1; isum <= k; isum++) {
            sum[isum][0] = sum[isum-1][0];
            for (int j = 0; j < k; j++) {
                sum[isum][0] -= wishB[isum-1][j];
                sum[isum][0] += wishW[isum-1][j];
            }
        }
        
        for (int jsum = 1; jsum <= k; jsum++) {
            sum[0][jsum] = sum[0][jsum-1];
            for (int i = 0; i < k; i++) {
                sum[0][jsum] += (-wishB[i][jsum-1] + wishW[i][jsum-1]);
            }
        }
        
        for (int isum = 1; isum <= k; isum++) {
            for (int jsum = 1; jsum <= k; jsum++) {
                sum[isum][jsum] = sum[isum][jsum-1];
                
                for (int i = isum; i < k; i++) {
                    sum[isum][jsum] -= wishB[i][jsum-1];
                    sum[isum][jsum] += wishW[i][jsum-1];
                }
                for (int i = 0; i < isum; i++) {
                    sum[isum][jsum] -= wishW[i][jsum-1];
                    sum[isum][jsum] += wishB[i][jsum-1];
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                max = Math.max(max, sum[i][j]);
            }
        }
        
        ps.println(max);
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
