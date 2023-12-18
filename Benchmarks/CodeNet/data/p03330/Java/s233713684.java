import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    void solve() throws IOException {
        int n = readInt(), C = readInt();
        int[][] d = new int[C][C];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < C; j++) {
                d[i][j] = readInt();
            }
        }
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = readInt();
            }
        }
        long minSum = Long.MAX_VALUE;
        for (int c0 = 1; c0 <= C; c0++) {
            for (int c1 = 1; c1 <= C; c1++) {
                for (int c2 = 1; c2 <= C; c2++) {
                    if (c0 == c1 || c0 == c2 || c1 == c2) {
                        continue;
                    }
                    long sum = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            int mod = (i + 1 + j + 1) % 3;
                            int oldColor = c[i][j];
                            int newColor;
                            if (mod == 0) {
                                newColor = c0;
                            } else if (mod == 1) {
                                newColor = c1;
                            } else {
                                newColor = c2;
                            }
                            sum += d[oldColor - 1][newColor - 1];
                        }
                    }
                    minSum = min(minSum, sum);
                }
            }
        }
        System.out.println(minSum);
    }

    //-------------------------------------------------

    final boolean ONLINE_JUDGE = !new File("input.txt").exists();

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;

    public void run() {
        Runnable run = () -> {
            try {
                long startTime = System.currentTimeMillis();
                Locale.setDefault(Locale.US);
                if (ONLINE_JUDGE) {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    out = new PrintWriter(System.out);
                } else {
                    in = new BufferedReader(new FileReader("input.txt"));
                    out = new PrintWriter("output.txt");
                }
                tok = new StringTokenizer("");
                solve();
                in.close();
                out.close();
                long endTime = System.currentTimeMillis();
                long totalMemory = Runtime.getRuntime().totalMemory();
                long freeMemory = Runtime.getRuntime().freeMemory();
                System.err.println();
                System.err.println("Time = " + (endTime - startTime) + " ms");
                //System.err.println("Memory = " + ((totalMemory - freeMemory) / 1024) + " KB");
            } catch (Throwable e) {
                e.printStackTrace(System.err);
                System.exit(-1);
            }
        };
        new Thread(null, run, "run", 256 * 1024 * 1024).start();
        min(0, 0);
    }

    String readString() {
        while (!tok.hasMoreTokens()) {
            String line;
            try {
                line = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    int readInt() {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void debug(Object... o) {
        if (!ONLINE_JUDGE) {
            System.err.println(Arrays.deepToString(o));
        }
    }

    long binpow(int a, int n) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r *= a;
            }
            a *= a;
            n /= 2;
        }
        return r;
    }

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    private long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = readLong();
        }
        return a;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}