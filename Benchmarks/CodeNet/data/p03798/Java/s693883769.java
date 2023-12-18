import sun.security.acl.WorldGroupImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static String S;
    final static char o = 'o';
    final static char x = 'x';
    final static char SHEEP = 'S';
    final static char WOLF = 'W';

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        System.out.println( solve() );
    }

    private static String solve() {

        String ans = isOk(SHEEP, SHEEP);
        if( ans != null ) return ans;
        ans = isOk(SHEEP, WOLF);
        if( ans != null ) return ans;
        ans = isOk(WOLF, SHEEP);
        if( ans != null ) return ans;
        ans = isOk(WOLF, WOLF);
        if( ans != null ) return ans;
        return "-1";

    }

    private static String isOk(char first, char second) {
        StringBuilder b = new StringBuilder();
        b.append(first);
        char prev = first;
        char curr = second;
        for (int i = 1; i < N; i++) {
            b.append(curr);

            char c = S.charAt(i);

            char next;
            if( curr == SHEEP ) {
                if( c == o ) {
                    next = prev;

                } else {
                    next = flip(prev);
                }
            } else {
                if( c == o ) {
                    next = flip(prev);

                } else {
                    next = prev;
                }
            }

            prev = curr;
            curr = next;
        }

        if( b.charAt(0) == curr ) {
            return b.toString();
        } else {
            return null;
        }
    }

    static char flip(char animal) {
        return animal == SHEEP ? WOLF : SHEEP;
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

