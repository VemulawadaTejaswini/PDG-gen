import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
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
        int N = in.nextInt();
        int M = in.nextInt();
        int Q = in.nextInt();
        int[][] abcd = new int[Q + 1][4];
        for (int i = 1; i <= Q; i++) {
            for (int j = 0; j < 4; j++) {
                abcd[i][j] = in.nextInt();
            }
        }
        int[] temp = new int[N + 1];
        Arrays.fill(temp, 1);
        temp[N] = N;
        long sum = sum(temp, abcd);
        Queue<int[]> q = new ArrayDeque<>();
        Set<Integer> seen = new HashSet<>();
        q.add(temp);
        seen.add(Arrays.hashCode(temp));
        for (int i = 2; i <= M; i++) {
            int[] d = new int[temp.length];
            System.arraycopy(temp, 0, d, 0, temp.length);
            d[temp[N] - 1] = i;
            d[N] = temp[N] - 1;
            sum = Math.max(sum, sum(d, abcd));
            q.add(d);
            seen.add(Arrays.hashCode(d));
        }
        while (!q.isEmpty()) {
            int[] x = q.poll();
            sum = Math.max(sum, sum(x, abcd));
            for (int i = 2; i <= M; i++) {
                for (int j = i; x[N] > 0 && j <= x[x[N]]; j++) {
                    int[] d = new int[x.length];
                    System.arraycopy(x, 0, d, 0, x.length);
                    d[x[N] - 1] = j;
                    d[N] = x[N] - 1;
                    if (seen.contains(Arrays.hashCode(d))) {
                        continue;
                    }
                    q.add(d);
                    seen.add(Arrays.hashCode(d));
                }
            }

        }
        out.println(sum);
    }

    static long sum(int[] data, int[][] abcd) {
        long ans = 0;
        for (int i = 1; i < abcd.length; i++) {
            if (data[abcd[i][1] - 1] - data[abcd[i][0] - 1] == abcd[i][2]) {
                ans += abcd[i][3];
            }
        }
        return ans;
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
