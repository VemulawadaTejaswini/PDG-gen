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

    private static int solve() {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        int prev = 6;
        while(true) {
            int n = prev * 6;
            if( n <= N ) {
                nums.add(n);
                prev = n;
            } else {
                break;
            }
        }

        nums.add(9);
        prev = 9;
        while(true) {
            int n = prev * 9;
            if( n <= N ) {
                nums.add(n);
                prev = n;
            } else {
                break;
            }
        }

        Comparator<Integer> c = Comparator.naturalOrder();
        c = c.reversed();
        nums.sort(c);

        int[] dp = new int[N+1];
        final int INF = 1000* 1000* 1000;
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int n : nums) {
            for (int i = 0; i <= N; i++) {
                if( dp[i] == INF ) continue;

                if( i + n <= N ) {
                    dp[i+n] = Math.min(dp[i+n], dp[i]+1);
                }
            }
        }

        for (int i = N; i >= 0 ; i--) {
            if( dp[i] != INF ) {
                return (N - i) + dp[i];
            }
        }
        throw new RuntimeException("wtf");
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

