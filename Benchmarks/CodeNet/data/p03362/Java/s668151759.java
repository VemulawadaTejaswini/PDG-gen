import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        System.out.println( solve() );
    }

    private static String solve() {
        boolean[] prime = new boolean[55555 + 1];
        Arrays.fill(prime, true);
        prime[2] = true;
        for (int i = 2; i < 55555; i++) {
            if( prime[i] ) {
                for (int d = 2; d*i <= 55555; d++) {
                    prime[i*d] = false;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= 55555 ; i++) {
            if( prime[i] && i % 5 == 1 ) {
                ans.add(i);
                if( ans.size() == N ) break;
            }
        }

        StringJoiner j = new StringJoiner(" ");
        for (Integer each : ans) {
            j.add(each.toString());
        }
        return j.toString();
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
