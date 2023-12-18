import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        C();
    }

    public static void C() throws Exception {
        FastScanner scanner = new FastScanner( System.in );
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.next();
        int[] res = new int[Q];
        for (int i = 0; i < Q; i++) {
            scanner.nextLine();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            res[i] = findAC( S, l, r );
        }
        for (int r : res) System.out.println(r);

    }

    private static int findAC(String s, int l, int r) {
        boolean foundA = false;
        int count = 0;
        for (int i = l - 1; i < r; i++) {
            char c = s.charAt( i );
            if (foundA && c == 'C') {
                foundA = false;
                count++;
            } else foundA = c == 'A';
        }
        return count;
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
