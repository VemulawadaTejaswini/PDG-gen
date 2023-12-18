import java.io.*;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main implements Runnable {
    static final int MOD = (int) 1e9 + 7;
    static final int MI = (int) 1e9;
    private static final long ML = (long) 1e18;
    private static final Reader in = new Reader();
    private static final PrintWriter out = new PrintWriter(System.out);
    private StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        new Thread(null, new Main(), "persefone", 1l << 32).start();
    }

    @Override
    public void run() {
        solve();
        printf();
        flush();
    }

    private void solve() {
        int n = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = Arrays.stream(a).map(Math::abs).toArray();
        long[][] dp = new long[n + 1][2];
        dp[1][0] = a[1] >= 0 ? a[1] : -ML;
        dp[1][1] = a[1] >= 0 ? -ML : a[1];
        for (int i = 2; i <= n; i++) {
            if (a[i] >= 0) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]) + a[i];
                dp[i][1] = Math.max(dp[i - 1][0] - 2 * b[i - 1], dp[i - 1][1] + 2 * b[i - 1]) - a[i];
            } else {
                dp[i][0] = Math.max(dp[i - 1][0] - 2 * b[i - 1], dp[i - 1][1] + 2 * b[i - 1]) - a[i];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]) + a[i];
            }
        }
        printf(Math.max(dp[n][0], dp[n][1]));
    }

    private void printf() {
        out.print(answer);
    }

    void close() {
        out.close();
    }

    private void flush() {
        out.flush();
    }

    private void printf(Stream<?> str) {
        str.forEach(o -> add(o, " "));
        add("\n");
    }


    void printf(Object... obj) {
        printf(false, obj);
    }

    void printfWithDescription(Object... obj) {
        printf(true, obj);
    }


    private void printf(boolean b, Object... obj) {

        if (obj.length > 1) {
            for (Object anObj : obj) {
                if (b) add(anObj.getClass().getSimpleName(), " - ");
                if (anObj instanceof Collection<?>) {
                    printf((Collection<?>) anObj);
                } else if (anObj instanceof int[][]) {
                    printf((int[][]) anObj);
                } else if (anObj instanceof long[][]) {
                    printf((long[][]) anObj);
                } else if (anObj instanceof double[][]) {
                    printf((double[][]) anObj);
                } else printf(anObj);
            }
            return;
        }

        if (b) add(obj[0].getClass().getSimpleName(), " - ");
        printf(obj[0]);
    }

    private void printf(Object o) {
        if (o instanceof int[])
            printf(Arrays.stream((int[]) o).boxed());
        else if (o instanceof char[])
            printf(new String((char[]) o));
        else if (o instanceof long[])
            printf(Arrays.stream((long[]) o).boxed());
        else if (o instanceof double[])
            printf(Arrays.stream((double[]) o).boxed());
        else if (o instanceof boolean[]) {
            for (boolean b : (boolean[]) o) add(b, " ");
            add("\n");
        } else
            add(o, "\n");
    }

    private void printf(int[]... obj) {
        for (int[] anObj : obj) printf(anObj);
    }

    private void printf(long[]... obj) {
        for (long[] anObj : obj) printf(anObj);
    }

    private void printf(double[]... obj) {
        for (double[] anObj : obj) printf(anObj);
    }

    void printf(boolean[]... obj) {
        for (boolean[] anObj : obj) printf(anObj);
    }

    private void printf(Collection<?> col) {
        printf(col.stream());
    }

    private <T, K> void add(T t, K k) {
        if (t instanceof Collection<?>) {
            ((Collection<?>) t).forEach(i -> add(i, " "));
        } else if (t instanceof Object[]) {
            Arrays.stream((Object[]) t).forEach(i -> add(i, " "));
        } else
            add(t);
        add(k);
    }


    private <T> void add(T t) {
        answer.append(t);
    }

    static class Reader {
        private BufferedReader br;
        private StringTokenizer st;

        Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String fileName) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(fileName));
        }

        boolean isReady() throws IOException {
            return br.ready();
        }

        String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
}