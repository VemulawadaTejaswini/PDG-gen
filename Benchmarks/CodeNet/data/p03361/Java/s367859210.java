import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int H;
    static int W;
    static boolean[][] P; // black=true

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        P = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            String line = sc.next();
            for (int j = 0; j < W; j++) {
                P[i][j] = line.charAt(j) == '#';
            }
        }
        System.out.println( solve() ? "Yes" : "No" );
    }

    static boolean solve() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if( P[i][j] && !hasAnyBlackAround(i, j) ) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean hasAnyBlackAround(int h, int w) {
        if( h != 0 && P[h-1][w] ) return true;
        if( h != H-1 && P[h+1][w] ) return true;
        if( w != 0 && P[h][w-1] ) return true;
        if( w != W-1 && P[h][w+1] ) return true;
        return false;
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
