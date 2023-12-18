import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int[] x = new int[n];
            int[] y = new int[n];
            int[] h = new int[n];
            in.ints(x, y, h);
            for (int xt = 0; xt <= 100; xt++) {
                mainloop:
                for (int yt = 0; yt <= 100; yt++) {
                    Integer ht = null;
                    Queue<Integer> q = new LinkedList<>();
                    for (int i = 0; i < n; i++) {
                        q.add(i);
                    }
                    while (!q.isEmpty()) {
                        int i = q.poll();
                        if (h[i] == 0) {
                            if (ht == null) {
                                q.add(i);
                            } else {
                                if (ht - (Math.abs(x[i] - xt) + Math.abs(y[i] - yt)) > 0) {
                                    continue mainloop;
                                }
                            }
                        } else if (ht == null) {
                            ht = h[i] + Math.abs(x[i] - xt) + Math.abs(y[i] - yt);
                        } else if (ht != h[i] + Math.abs(x[i] - xt) + Math.abs(y[i] - yt)) {
                            continue mainloop;
                        }
                    }
                    out.print(xt);
                    out.print(' ');
                    out.print(yt);
                    out.print(' ');
                    out.println(ht);
                    return;
                }
            }
            throw new RuntimeException("ERR");
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

        public void ints(int[]... arrays) {
            int l = Arrays.stream(arrays).mapToInt(a -> a.length).min().orElse(0);
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = ints();
                }
            }
        }

    }
}

