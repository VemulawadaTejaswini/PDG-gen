import sun.security.acl.WorldGroupImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int H;
    static int W;
    static int D;
    static int[][] A;
    static int Q;
    static int[] L;
    static int[] R;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        D = sc.nextInt();
        A = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Q = sc.nextInt();
        L = new int[Q];
        R = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        for (int ans : solve()) {
            System.out.println( ans );
        }
    }

    private static int[] solve() {
        Map<Integer, Cord> map = new HashMap<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map.put(A[i][j], new Cord(i, j));
            }
        }

        int[] rui = new int[H*W + 1];
        for (int r = 1; r <= D; r++) {
            rui[r] = 0;

            for (int q = 1; q*D + r <= H*W; q++) {
                int curr = q*D+r;
                int prev = (q-1)*D+r;
                int cost = map.get(curr).cost( map.get(prev) );
                rui[curr] = rui[prev] + cost;
            }
        }

        int[] ans = new int[Q];

        for (int i = 0; i < Q; i++) {
            ans[i] = rui[R[i]] - rui[L[i]];
        }
        return ans;
    }

    static class Cord {
        private int i;
        private int j;

        public Cord(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int cost(Cord to) {
            return Math.abs(i - to.i) + Math.abs(j - to.j);
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

