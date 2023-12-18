import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.security.AccessControlException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        DNearestCardGame solver = new DNearestCardGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DNearestCardGame {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), q = in.ints();
            long[] a = in.longs(n);
            long[] sum = new long[n + 1];
            long[][] sumP = new long[2][n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + a[i];
                if (i % 2 == 0) {
                    sumP[0][i + 1] = sumP[0][i] + a[i];
                    sumP[1][i + 1] = sumP[1][i];
                } else {
                    sumP[0][i + 1] = sumP[0][i];
                    sumP[1][i + 1] = sumP[1][i] + a[i];
                }
            }
            //System.out.println(Arrays.deepToString(sumP));

        /*int ub = ArrayUtil.upperBound(a, 301);
        int lb = ArrayUtil.lowerBound(a, 25);
        System.out.println(ub);
        System.out.println(lb);*/
            //*
            for (int query = 0; query < q; query++) {
                long x = in.longs();
                long min = 0, max = 1_000_000_000;
                while (max - min > 1) {
                    long mid = (min + max) / 2;
                    int lb = ArrayUtil.lowerBound(a, x - mid);
                    int ub = ArrayUtil.upperBound(a, x + mid);
                    int aoki = ub - lb;
                    int tkhs = n - ub;
                    if (aoki >= tkhs) {
                        max = mid;
                    } else {
                        min = mid;
                    }
                }
                int lb = ArrayUtil.lowerBound(a, x - min);
                int ub = ArrayUtil.upperBound(a, x + min);

                long ans;
                //System.out.println(Arrays.toString(a));
                //System.out.println("lb=" + lb);
                //System.out.println("ub=" + ub);
                //System.out.println("x=" + x);
                //System.out.println("min=" + min);

                if (ub <= n / 2) {
                    ans = sum[n] - sum[n / 2];
                } else if (min > 0) {
                    ans = sum[n] - sum[ub];
                    //System.out.println("anst=" + ans);
                    if ((n % 2 == 0) == (lb % 2 == 0)) { // tkhs odd
                        ans += sumP[0][lb - 1];
                    } else {
                        ans += sumP[1][lb - 1];
                    }
                } else {
                    ans = sumP[1 - n % 2][n];
                }
                //System.out.println("ans=" + ans);
                out.ans(ans).ln();

            /*int[] who = new int[n];
            Arrays.fill(who, -1);
            int t = 0;
            outer: while (true) {
                if (t == 0) {
                    for (int i = n - 1; i >= 0; i--) {
                        if (who[i] < 0) {
                            who[i] = 0;
                            t = 1;
                            continue outer;
                        }
                    }
                    break;
                } else {
                    long p = 100000000;
                    int pi = -1;
                    for (int i = 0; i < n; i++) {
                        if (who[i] < 0 && Math.abs(x - a[i]) < p) {
                            p = Math.abs(x - a[i]);
                            pi = i;
                        }
                    }
                    if (pi == -1) {
                        break;
                    }
                    who[pi] = 1;
                    t = 0;
                }
            }
            System.out.println(Arrays.toString(who));*/
            }//*/
        }

    }

    static class LightWriter implements AutoCloseable {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\(([a-zA-Z0-9]+)\\);.*$";
        private static Pattern debugRegex;
        private final Writer out;
        private boolean autoflush = false;
        private boolean debug = false;
        private boolean breaked = true;
        private final String src;

        public LightWriter(Writer out) {
            this.out = out;
            String src = null;
            try {
                src = System.getProperty(DEBUG_PROPERTY);
            } catch (AccessControlException ex) {
                src = null;
            }
            this.src = src;
            if (src != null) {
                debug = true;
                if (debugRegex == null) {
                    debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
                }
            }
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public long longs() {
            return Long.parseLong(string());
        }

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static int lowerBound(long[] a, long t) {
            return lowerBound(a, t, 0);
        }

        public static int lowerBound(long[] a, long t, int min) {
            int max = a.length;
            while (min < max) {
                int mid = (min + max) / 2;
                if (t <= a[mid]) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
            return min;
        }

        public static int upperBound(long[] a, long t, int min) {
            int max = a.length;
            while (min < max) {
                final int mid = (min + max) / 2;
                if (t >= a[mid]) {
                    min = mid + 1;
                } else {
                    max = mid;
                }
            }
            return min;
        }

        public static int upperBound(long[] a, long t) {
            return upperBound(a, t, 0);
        }

    }
}

