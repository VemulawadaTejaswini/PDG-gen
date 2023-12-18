import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Book {
        private final int price;
        private final int[] points;

        private Book(int price, int[] points) {
            this.price = price;
            this.points = points;
        }
    }

    private static int min = Integer.MAX_VALUE;

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();

        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            int price = in.nextInt();
            int[] points = new int[m];
            for (int j = 0; j < m; j++) {
                points[j] = in.nextInt();
            }
            books[i] = new Book(price, points);
        }

        choose(new boolean[n], books, 0, x);

        out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    private static void choose(boolean[] chosen, Book[] books, int depth, int target) {
        if (depth == chosen.length) {
            check(chosen, books, target);
            return;
        }

        chosen[depth] = false;
        choose(chosen, books, depth + 1, target);
        chosen[depth] = true;
        choose(chosen, books, depth + 1, target);
    }

    private static void check(boolean[] chosen, Book[] books, int target) {
        int price = 0;
        int[] points = new int[books[0].points.length];
        for (int i = 0; i < chosen.length; i++) {
            if (!chosen[i]) continue;

            Book book = books[i];
            price += book.price;
            for (int j = 0; j < book.points.length; j++) {
                points[j] += book.points[j];
            }
        }

        // check enough point
        for (int point : points) {
            if (point < target) return;
        }

        min = Math.min(min, price);
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
