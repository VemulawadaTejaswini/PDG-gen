import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static Cake[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        C = new Cake[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cake(sc.nextLong(), sc.nextLong(), sc.nextLong());
        }
        
        System.out.println( solve() );
    }

    private static long solve() {

        long p1 = calc(true, true, true);
        long p2 = calc(true, true, false);
        long p3 = calc(true, false, true);
        long p4 = calc(true, false, false);
        long p5 = calc(false, true, true);
        long p6 = calc(false, true, false);
        long p7 = calc(false, false, true);
        long p8 = calc(false, false, false);

        return max(p1, p2, p3, p4, p5, p6, p7, p8);
    }

    static long calc(boolean xb, boolean yb, boolean zb) {
        Comparator<Cake> cmp = Comparator.comparingLong(c -> c.point(xb, yb, zb));
        cmp = cmp.reversed();
        Arrays.sort(C, cmp);

        long xs = 0;
        long ys = 0;
        long zs = 0;
        for (int i = 0; i < M; i++) {
            xs += C[i].x;
            ys += C[i].y;
            zs += C[i].z;
        }
        return Math.abs(xs) + Math.abs(ys) + Math.abs(zs);
    }

    static long max(long... values) {
        long max = -1;
        for (long value : values) {
            max = Math.max(value, max);
        }
        return max;
    }

    static long calc() {
        long x = 0;
        long y = 0;
        long z = 0;
        for (int i = 0; i < M; i++) {
            x += C[i].x;
            y += C[i].y;
            z += C[i].z;
        }
        return Math.abs(x) + Math.abs(y) + Math.abs(z);
    }

    static class Cake {
        long x;
        long y;
        long z;

        public Cake(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public long point(boolean xb, boolean yb, boolean zb) {
            long sum = 0;
            if( xb ) {
                sum += x;
            } else {
                sum += -1 * x;
            }
            if( yb ) {
                sum += y;
            } else {
                sum += -1 * y;
            }
            if( zb ) {
                sum += z;
            } else {
                sum += -1 * z;
            }
            return sum;
        }
    }


    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

