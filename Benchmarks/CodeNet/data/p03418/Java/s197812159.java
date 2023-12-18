import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        System.out.println( solve() );
    }

    private static long solve() {
        // うまく消化できないので別途処理してる
        // (a,b) = (n,n) to (1,1) で全部成立する
        if( K == 0 ) return (long)N * N;

        // a = bq + r
        // r >= Kとなる場合のbにのみ興味がある
        // ということで、K+1 <= b <= N について調べる
        long ans = 0;
        for (int b = K+1; b <= N; b++) {
            // a=1 -> r=1
            // a=2 -> r=2
            // a=b-1 -> r=b-1
            // a=b -> r=0
            // a=b+1 -> r=1
            // a=2b -> r=0
            // a=qb+r -> r=r
            // というような感じで循環するっぽい

            // (b-1から1までの間でKより大きくなる数) = K to (b-1) = (b-K)
            // (rから1までの数でKより大きくなる数) = K to r = r - K + 1(マイナスにはならない)
            int q = N / b;
            int r = N % b;

            ans += q*(b-K) + Math.max(0,(r-K+1));
        }
        return ans;
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
