import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
    }

    public static long[] buildPrefixArray(FastReader in, int n) {
        String[] tokens = in.nextLine().split(" ");
        long[] a = new long[n + 1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + Long.parseLong(tokens[i - 1]);
        }
        return a;
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        int n = in.nextInt();
        int m = in.nextInt();
        long k = in.nextInt();

        long[] a = buildPrefixArray(in, n);
        long[] b = buildPrefixArray(in, m);

        int books = 0;
        int j = m;
        for (int i = 0; i <= n; i++) {
            if (a[i] > k) {
                break;
            }
            while (b[j] > k - a[i]) {
                j--;
            }
            books = Math.max(books, i + j);
        }
        out.println(books);
    }
}