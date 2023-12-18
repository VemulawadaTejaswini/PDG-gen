import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long solve() {
        int[] B = new int[60];
        long[] C = new long[N*(N+1)/2];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            long sum = A[i];
            C[idx++] = sum;
            incrementBits(B, sum);
            for (int j = i+1; j < N; j++) {
                sum += A[i];
                C[idx++] = sum;
                incrementBits(B, sum);
            }
        }

        int maxBit = -1;
        for (int i = 0; i < 60; i++) {
            if( B[i] >= K ) {
                maxBit = i;
            }
        }
        if( maxBit == -1 ) {
            return 0;
        }

        long ans = 1L << maxBit;

        for (int i = maxBit-1; i >= 0 ; i--) {
            if( B[i] < K ) continue;

            long cur = 1L << i;

            int cnt = 0;
            for (long c : C) {
                if( (c & cur) == c ) cnt++;
            }
            if( cnt >= K ) {
                ans |= cur;
            }
        }
        return ans;
    }

    static void incrementBits(int[] B, long num) {
        for (int i = 0; i < 60; i++) {
            if( (num & (1L << i)) > 0 ) {
                B[i]++;
            }
        }
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
