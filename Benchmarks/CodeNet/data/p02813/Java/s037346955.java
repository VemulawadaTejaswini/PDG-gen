import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
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
        int lim = in.nextInt();
        int[] a = in.readAllInts(lim);
        int[] b = in.readAllInts(lim);
        int ind = 0;
        int a_p = 0;
        int b_p = 0;
        Queue<int[]> Q = new ArrayDeque<>();
        for (int i = 1; i <= lim; i++) {
            int[] temp = new int[lim];
            temp[0] = i;
            Q.add(temp);
        }
        while (!Q.isEmpty()) {
            int[] v = Q.poll();

            if (v[lim - 1] != 0) {
                ind++;
                if (Arrays.equals(v, a)) {
                    a_p = ind;
                }
                if (Arrays.equals(v, b)) {
                    b_p = ind;
                }
                continue;
            }
            for (int i = 1; i <= lim; i++) {
                boolean isPresent = false;
                for (int j = 0; j < v.length; j++) {
                    if (v[j] == i) {
                        isPresent = true;
                    }
                }
                if (!isPresent) {
                    for (int j = 0; j < v.length; j++) {
                        if (v[j] == 0) {
                            int[] x = createArray(v);
                            x[j] = i;
                            Q.add(x);
                            break;
                        }
                    }

                }
            }
        }
        out.println(Math.abs(a_p - b_p));
    }

    static int[] createArray(int[] a) {
        int[] temp = new int[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        return temp;
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

