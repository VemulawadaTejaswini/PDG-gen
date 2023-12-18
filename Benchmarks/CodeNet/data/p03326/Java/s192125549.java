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
        Comparator<Cake> cmp = Comparator.comparingLong(c -> c.x);
        Arrays.sort(C, cmp);
        long x1 = calc();
        Arrays.sort(C, cmp.reversed());
        long x2 = calc();

        cmp = Comparator.comparingLong(c -> c.y);
        Arrays.sort(C, cmp);
        long y1 = calc();
        Arrays.sort(C, cmp.reversed());
        long y2 = calc();

        cmp = Comparator.comparingLong(c -> c.z);
        Arrays.sort(C, cmp);
        long z1 = calc();
        Arrays.sort(C, cmp.reversed());
        long z2 = calc();

        return max(x1, x2, y1, y2, z1, z2);
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

