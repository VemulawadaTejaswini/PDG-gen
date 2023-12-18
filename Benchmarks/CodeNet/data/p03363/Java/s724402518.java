import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        System.out.println( solve() );
    }

    private static long solve() {
        long[] P = new long[N];
        P[0] = A[0];
        for (int i = 1; i < N; i++) {
            P[i] = P[i-1] + A[i];
        }

        Map<Long, Integer> counter = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Integer cnt = counter.get(P[i]);
            if( cnt != null ) {
                counter.put(P[i], cnt + 1);
            } else {
                counter.put(P[i], 1);
            }
        }

        if( counter.containsKey(0L) ) {
            counter.put(0L, counter.get(0L) + 1);
        }

        int ans = 0;
        for (Map.Entry<Long, Integer> entry : counter.entrySet()) {
            int cnt = entry.getValue();
            // n回登場 -> n-1 + n-2+...+1
            ans += sigma(cnt-1);
        }
        return ans;
    }

    private static long sigma(long n) {
        if( n % 2 == 0 ) {
            return (n / 2) * (n + 1);
        } else {
            return (n / 2) * (n + 1) + (n / 2 + 1);
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
