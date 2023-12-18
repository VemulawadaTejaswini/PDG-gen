import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        final int N = fs.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for (int i = 0; i < N; i++) A[i] = fs.nextInt();
        for (int i = 0; i < N; i++) B[i] = fs.nextInt();
        for (int i = 0; i < N; i++) C[i] = fs.nextInt();

        Arrays.sort(A);
        Arrays.sort(C);

        long ans = 0L;
        for (int i = 0; i < B.length; i++) {
            // 以上
            int lx = lowerBound(A, B[i]);

            // より大きい
            int ux = upperBound(C, B[i]);

            ans += (long)lx * (N - ux);
        }

        out.println(ans);

        out.flush();
    }

    // 以上
    public static int lowerBound(int[] a, int v) {
        return lowerBound(a, 0, a.length, v);
    }

    // より大きい
    public static int upperBound(int[] a, int v) {
        // 値をプラス1
        return lowerBound(a, 0, a.length, v + 1);
    }

    public static int lowerBound(int[] a, int l, int r, int v) {
        if(l > r || l < 0 || r > a.length)
            throw new IllegalArgumentException();

        int low = l - 1;
        int high = r;

        while(high - low > 1){
            int mid = low + high >> 1;
            if(a[mid] >= v){
                high = mid;
            }else{
                low = mid;
            }
        }

        return high;
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
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
        while(true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
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
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
