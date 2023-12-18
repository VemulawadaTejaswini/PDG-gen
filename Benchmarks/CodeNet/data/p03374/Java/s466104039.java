import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.*;

public class Main {
    final FastScanner in = new FastScanner(System.in);

    final long MOD = (long)((1e9) + 7);

    /* MOD_CALCULATION */
    long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    long MULT(long a, long b) {
        return (a * b) % MOD;
    }

    long POW(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */

    public void solve() {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long c = sc.nextLong();
        long x[] = new long[n];
        long v[] = new long[n];
        long l[] = new long[n];
        long r[] = new long[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        long ans = 0l;
        for(int i=0;i<n;i++){
            if(i==0) {
                l[i] = v[i];
                continue;
            }
            l[i] = l[i-1]+v[i];
        }
        
        for(int i=0;i<n;i++){
            l[i]-=x[i];
            ans = Math.max(ans, l[i]);
        }
        
        
        //also do this for going right
        r[0] = v[n-1];
        for(int i=1;i<n;i++){
            r[i] = r[i-1]+v[n-i-1];
        }
        
        for(int i=0;i<n;i++){
            r[i] -= c-x[n-i-1];
            ans = Math.max(ans, r[i]);
        }
        
        long ll[]  =new long[n];
        long rr[]  =new long[n];
        
        for(int i=0;i<n;i++){
            ll[i] = l[i]; rr[i]=r[i];
        }
        for(int i=1;i<n;i++){
            rr[i] = Math.max(rr[i], rr[i-1]);
            ll[i] = Math.max(ll[i], ll[i-1]);
        }
        
        //System.out.println(Arrays.toString(l)+" " + Arrays.toString(r));
        
        //go to left and then come back to right. for all these cases
        for(int i=0;i<n-1;i++){
            //System.out.print(l[i] - x[i] + rr[n-i-2]+" ");
            ans = Math.max(ans, l[i] - x[i] + rr[n-i-2]);
            ans = Math.max(ans, r[i] - c- x[n-1-i] + ll[n-i-2]);
        }
        System.out.println(ans);
    }
    
    
    /*
    15 100
4 10
8 10
19 10
24 10
29 10
33 10
37 10
38 10
40 10
41 10
52 10
66 10
80 10
93 10
97 10

*/

    public static void main(final String[] args) {
        new Main().solve();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
