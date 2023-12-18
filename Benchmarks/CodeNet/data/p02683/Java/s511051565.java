import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;
    static CF_Reader in;
    static int[][] books;
    static int[] algos;
    static int n;
    static int m;
    static int x;
    static long result = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();

//        3 3 10
//        60 2 2 4
//        70 8 7 9
//        50 2 3 9
        n = in.intNext();
        m = in.intNext();
        x = in.intNext();
        books = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            int[] book = in.nextIntArray(m + 1);
            books[i] = book;
        }
//        books = new int[][]{{60, 2, 2, 4}, {70, 8, 7, 9}, {50, 2, 3, 9}};
        algos = new int[m + 1];
        for (int mx = 1; mx < n + 1; mx++) {
            solve(0, mx, 0);
        }
        out.println((result != Long.MAX_VALUE) ? result : -1);

        out.close();
    }

    static void solve(int idx, int max, long cost) {
        for (int i = idx; i < n; i++) {
            int[] book = books[i];
            add(book);
            if (algos[0] == 1) {
                if (cost + book[0] < result) result = cost + book[0];
                subtract(book);
                continue;
            }
            if (max - 1 > 0) {
                solve(idx + 1, max - 1, cost + book[0]);
            }
            subtract(book);
        }
    }
    static void add(int[] book) {
        boolean isValid = true;
        for (int i = 1; i < m + 1; i++) {
            algos[i] += book[i];
            if (algos[i] < x) isValid = false;
        }
        if (isValid) algos[0] = 1;
        else algos[0] = 0;
    }
    static void subtract(int[] book) {
        for (int i = 1; i < m + 1; i++) {
            algos[i] -= book[i];
        }
        algos[0] = 0;
    }
    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}
