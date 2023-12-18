import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int K;
    static long[] X;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextLongArray(N);

        System.out.println(solve());
    }

    static long solve() {
        List<Long> to_r = new ArrayList<>(N);
        List<Long> to_l = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            if( X[i] < 0 ) continue;
            to_r.add(X[i]);
        }

        for (int i = N-1; i >= 0; i--) {
            if( X[i] > 0 ) continue;
            to_l.add(-X[i]);
        }

        long min = Long.MAX_VALUE / 2;

        // 右いって左
        for (int r = 1; r <= Math.min(K, to_r.size()); r++) {
            int l = K - r;
            if( l > to_l.size() ) continue;

            long rsum = to_r.get(r-1);
            if( l > 0 ) {
                long lsum = to_l.get(l-1);
                min = Math.min(rsum*2 + lsum, min);
            } else {
                min = Math.min(rsum, min);
            }

        }

        // 左いって右
        for (int l = 1; l <= to_l.size(); l++) {
            int r = K - l;
            if( r > to_r.size() ) continue;

            long lsum = to_l.get(l-1);
            if( r > 0 ) {
                long rsum = to_r.get(r-1);
                min = Math.min(lsum*2 + rsum, min);
            } else {
                min = Math.min(lsum, min);
            }
        }

        return min;
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
