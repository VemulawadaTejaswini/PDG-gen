import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static int[][] score;
    static int K;
    static int R;
    static int P;
    static int S;

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        int N = in.nextInt();
        K = in.nextInt();
        R = in.nextInt();
        S = in.nextInt();
        P = in.nextInt();
        String T = in.next();
        score = new int[N][4];
        for (int i = 0; i < T.length(); i++) {
            update(T.charAt(i), i);
        }
        int ans = 0;
        for (int i = 0; i < T.length(); i++) {
            int ind = getWinnerIndex(T.charAt(i));
            if (i - K >= 0) {
                if (score[i - K][ind] > 0) {
                    score[i][ind] = 0;
                } else {
                    ans += score[i][ind];
                }
            } else {
                ans += score[i][ind];
            }

        }
        out.println(ans);
    }

    static int getWinnerIndex(char r) {
        if (r == 'r') {
            return 2;
        }
        if (r == 'p') {
            return 3;
        }
        if (r == 's') {
            return 1;
        }
        return 0;
    }

    static void update(char r, int i) {
        // R = 1
        // P = 2
        // S = 3
        if (r == 'r') {
            score[i][2] = P;
        }
        if (r == 'p') {
            score[i][3] = S;
        }
        if (r == 's') {
            score[i][1] = R;
        }
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
