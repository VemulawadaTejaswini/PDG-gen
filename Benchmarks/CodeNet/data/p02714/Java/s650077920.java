import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    

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
        long ans = 0;
        int N = in.nextInt();
        String s = in.next();
        int[][] count = new int[N][4];
        int[][] sum = new int[N][4];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count[i][1]++;
                sum[i][1]++;
            }
            if (s.charAt(i) == 'G') {
                count[i][2]++;
                sum[i][2]++;
            }
            if (s.charAt(i) == 'B') {
                count[i][3]++;
                sum[i][3]++;
            }
        }
        for (int i = N - 2; i >= 0; i--) {
            sum[i][1] += sum[i + 1][1];
            sum[i][2] += sum[i + 1][2];
            sum[i][3] += sum[i + 1][3];
        }
        for (int i = 0; i < N; i++) {
            if (count[i][1] > 0) {
                for (int j = i + 1; j + 1 < N; j++) {
                    if (count[j][2] > 0) {
                        ans += sum[j + 1][3];
                        if (j + j - i < N) {
                            ans -= count[j + j - i][3];
                        }
                    }
                    if (count[j][3] > 0) {
                        ans += sum[j + 1][2];
                        if (j + j - i < N) {
                            ans -= count[j + j - i][2];
                        }
                    }
                }
            }
            if (count[i][2] > 0) {
                for (int j = i + 1; j + 1 < N; j++) {
                    if (count[j][3] > 0) {
                        ans += sum[j + 1][1];
                        if (j + j - i < N) {
                            ans -= count[j + j - i][1];
                        }
                    }
                    if (count[j][1] > 0) {
                        ans += sum[j + 1][3];
                        if (j + j - i < N) {
                            ans -= count[j + j - i][3];
                        }
                    }
                }
            }
            if (count[i][3] > 0) {
                for (int j = i + 1; j + 1 < N; j++) {
                    if (count[j][2] > 0) {
                        ans += sum[j + 1][1];
                        if (j + j - i < N) {
                            ans -= count[j + j - i][1];
                        }
                    }
                    if (count[j][1] > 0) {
                        ans += sum[j + 1][2];
                        if (j + j - i < N) {
                            ans -= count[j + j - i][2];
                        }
                    }
                }
            }
        }
        out.println(ans);
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
