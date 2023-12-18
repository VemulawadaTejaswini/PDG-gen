import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        A = sc.nextIntArray(N);
        System.out.println( solve() );
    }

    private static long solve() {
        int[] dupe = new int[N+1];
        for (int i = 0; i < N; i++) {
            dupe[A[i]]++;
        }
        Arrays.sort(dupe);

        int start = -1;
        for (int i = 0; i < dupe.length; i++) {
            if( dupe[i] != 0 ) {
                start = i;
                break;
            }
        }

        int k = N+1 - start;

        if( k <= K ) return 0;

        long ans = 0;
        for (int i = 0; i < k-K; i++) {
            int index = i + start;
            ans += dupe[index];
        }
        return ans;
    }

    static class FastScanner {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

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
