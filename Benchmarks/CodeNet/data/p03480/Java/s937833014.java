import java.io.*;
import java.util.*;

public class Main {

    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();

        System.out.println( solve() );
    }

    static int solve() {
        if( S.length() == 1 ) {
            return 1;
        }

        int mid = -1;
        for (int border = 1; border < S.length(); border++) {
            char prev = S.charAt(border-1);
            char post = S.charAt(border);

            if( prev != post ) {
                mid = moreMid(border, mid);
            }
        }

        if( mid == -1 ) {
            return S.length();

        } else {
            return Math.max(mid, S.length()-mid);
        }
    }

    static int moreMid(int i, int j) {
        if( i == -1 ) return j;
        if( j == -1 ) return i;
        return Math.max(mid(i), mid(j));
    }

    static int mid(int i) {
        if( i < S.length() / 2 ) return i;
        else return S.length() - i - 1;
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

