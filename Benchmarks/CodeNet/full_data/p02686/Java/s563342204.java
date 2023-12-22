import java.util.Arrays;

public class Main {

    private static void solve() {
        int n = ni();
        int[][] a = new int[n][2];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char[] s = ns();
            for (int c : s) {
                if (c == '(') {
                    a[i][1]++;
                } else {
                    a[i][1]--;
                }
                a[i][0] = Math.min(a[i][0], a[i][1]);
            }
            sum += a[i][1];
        }
        if (sum != 0) {
            System.out.println("No");
            return;
        }
        Arrays.sort(a, (o1, o2) -> {
            if (Integer.signum(o1[1]) != Integer.signum(o2[1])) {
                return Integer.signum(o2[1]) - Integer.signum(o1[1]);
            } else if (Integer.signum(o1[1]) > 0) {
                return o2[0] - o1[0];
            } else {
                return (o1[0] - o1[1]) - (o2[0] - o2[1]);
            }
        });
        // System.out.println(Arrays.deepToString(a));

        int now = 0;
        for (int i = 0; i < n; i++) {
            if (now + a[i][0] < 0) {
                System.out.println("No");
                return;
            }
            now += a[i][1];
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                String debug = args.length > 0 ? args[0] : null;
                if (debug != null) {
                    try {
                        is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
                solve();
                out.flush();
                tr((System.currentTimeMillis() - start) + "ms");
            }
        }, "", 64000000).start();
    }

    private static java.io.InputStream is = System.in;
    private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
    private static java.util.StringTokenizer tokenizer = null;
    private static java.io.BufferedReader reader;

    public static String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new java.util.StringTokenizer(reader.readLine());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    private static double nd() {
        return Double.parseDouble(next());
    }

    private static long nl() {
        return Long.parseLong(next());
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static char[] ns() {
        return next().toCharArray();
    }

    private static long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nl();
        return a;
    }

    private static int[][] ntable(int n, int m) {
        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = ni();
            }
        }
        return table;
    }

    private static int[][] nlist(int n, int m) {
        int[][] table = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[j][i] = ni();
            }
        }
        return table;
    }

    private static int ni() {
        return Integer.parseInt(next());
    }

    private static void tr(Object... o) {
        if (is != System.in)
            System.out.println(java.util.Arrays.deepToString(o));
    }
}
