import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long solve() {
        if( N == 2 ) {
            return Math.abs(A[0]-A[1]);
        }

        Arrays.sort(A);

        int i = 1;
        int j = N-2;
        long sum = Math.abs(A[0] - A[N-1]);
        int x = A[0];
        int y = A[N-1];

        while( i != j ) {
            int ai = A[i];
            int aj = A[j];

            int aix = Math.abs(x - ai);
            int aiy = Math.abs(y - ai);
            int ajx = Math.abs(x - aj);
            int ajy = Math.abs(y - aj);

            if( max(aix, aiy, ajx, ajy) == aix ) {
                sum += aix;
                x = ai;
                i++;

            } else if( max(aix, aiy, ajx, ajy) == aiy ) {
                sum += aiy;
                y = ai;
                i++;

            } else if( max(aix, aiy, ajx, ajy) == ajx ) {
                sum += ajx;
                x = aj;
                j--;

            } else {
                sum += ajy;
                y = aj;
                j--;
            }
        }

        sum += Math.max(Math.abs(A[i] - x), Math.abs(A[i]- y));

        return sum;
    }

    static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    static long calc(boolean youngFirst) {
        long sum = 0;
        int x = A[0];
        int y = A[N-1];
        sum += Math.abs(x - y);

        int px = x;
        int py = y;
        for (int i = 1; i < N / 2; i++) {
            x = A[i];
            y = A[N-i-1];

            sum += Math.abs(x - y);
            if( youngFirst ) {
                // 1 N-1 2 N-2...
                sum += Math.abs(py - x);
            } else {
                sum += Math.abs(px - y);
            }
            px = x;
            py = y;
        }
        return sum;
    }

    @SuppressWarnings("unused")
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
