import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        PrintWriter out = new PrintWriter(outputStream);
        DRobotArms solver = new DRobotArms();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRobotArms {
        private static int n;
        private static int[] x;
        private static int[] y;
        private static final int[] N2SE = {1, 1, 2, 4, 8};

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            n = in.ints();
            x = new int[n];
            y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.ints();
                y[i] = in.ints();
            }
            boolean even = isEven(x[0] + y[0]);
            for (int i = 1; i < n; i++) {
                if (even ^ isEven(x[i] + y[i])) {
                    out.println(-1);
                    return;
                }
            }

            solve(even, N2SE, out);
        }

        private static void solve(boolean even, int[] n2s, PrintWriter out) {
            List<Integer> d = new ArrayList<>();
            d.add(1);
            if (even) {
                d.add(1);
            }
            for (int j = n2s.length - 1; j >= 0; j--) {
                d.add(n2s[j]);
            }
            for (int j = n2s.length - 1; j >= 0; j--) {
                d.add(n2s[j]);
            }
            out.println(x.length);
            out.println(d.stream().map(i -> Integer.toString(i)).collect(Collectors.joining(" ")));


            // System.out.println(even);
            for (int i = 0; i < n; i++) {
                if (even) {
                    if (isEven(x[i])) {
                        out.print("UD");
                    } else {
                        out.print("UR");
                        x[i]--;
                        y[i]--;
                    }
                } else {
                    // System.out.println("HERE X IS " + x[i] + " AND Y IS " + y[i]);
                    if (!isEven(x[i])) {
                        out.print('R');
                        x[i]--;
                    } else {
                        out.print('U');
                        y[i]--;
                    }
                }
                // System.out.println("NOW X IS " + x[i] + " AND Y IS " + y[i]);
                for (int j = n2s.length - 1; j >= 0; j--) {
                    if (x[i] > 0) {
                        x[i] -= n2s[j];
                        out.print('R');
                    } else {
                        x[i] += n2s[j];
                        out.print('L');
                    }
                }
                for (int j = n2s.length - 1; j >= 0; j--) {
                    if (y[i] > 0) {
                        y[i] -= n2s[j];
                        out.print('U');
                    } else {
                        y[i] += n2s[j];
                        out.print('D');
                    }
                }
                if (x[i] != 0 || y[i] != 0) {
                    System.out.println("x is " + x[i] + " and y is " + y[i]);
                    System.out.println("WTF");
                    // System.exit(1);
                }
                out.println();
            }
        }

        private static boolean isEven(int n) {
            return ((n % 2) + 2) % 2 == 0;
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

    }
}

