import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FAirSafety solver = new FAirSafety();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAirSafety {
        FAirSafety.P[] p;
        private static final char L = 'L';
        private static final char R = 'R';
        private static final char U = 'U';
        private static final char D = 'D';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            p = new FAirSafety.P[n];
            for (int i = 0; i < n; i++) {
                p[i] = new FAirSafety.P(in.nextInt(), in.nextInt(), in.next().charAt(0));
            }

            int answer = Integer.MAX_VALUE;

            answer = Math.min(answer, f(R, L));
            answer = Math.min(answer, f(U, D));

            answer = Math.min(answer, f(U, L));
            answer = Math.min(answer, f(R, D));
            answer = Math.min(answer, f(D, L));
            answer = Math.min(answer, f(R, U));

            if (answer == Integer.MAX_VALUE) {
                out.println("SAFE");
                return;
            }
            out.println(answer * 5);
        }

        private int f(char p, char n) {
            int answer = Integer.MAX_VALUE;
            TreeMap<Integer, TreeSet<Integer>> pos = new TreeMap<>();
            TreeMap<Integer, TreeSet<Integer>> neg = new TreeMap<>();
            for (int i = 0; i < this.p.length; i++) {
                if (this.p[i].d == p) {
                    add(pos, this.p[i].stay(p, n), this.p[i].move(p, n));
                } else if (this.p[i].d == n) {
                    add(neg, this.p[i].stay(p, n), this.p[i].move(p, n));
                }
            }

            for (int x : pos.keySet()) {
                if (!neg.containsKey(x))
                    continue;

                TreeSet<Integer> a = pos.get(x);
                TreeSet<Integer> b = neg.get(x);
                b.add(Integer.MAX_VALUE);
                for (int i : a) {
                    int j = b.ceiling(i);
                    if (j == Integer.MAX_VALUE)
                        continue;
                    answer = Math.min(answer, j - i);
                }
            }

            return answer;
        }

        private void add(TreeMap<Integer, TreeSet<Integer>> c, int x, int y) {
            if (!c.containsKey(x))
                c.put(x, new TreeSet<>());
            c.get(x).add(y);
        }

        private static class P {
            final int x;
            final int y;
            final char d;

            private P(int x, int y, char d) {
                this.x = x;
                this.y = y;
                this.d = d;
            }

            public int move(char p, char n) {
                if (p == R && n == L || p == U && n == D)
                    return x + y - stay(p, n);
                return x + y + x - y - stay(p, n);
            }

            public int stay(char p, char n) {
                if (p == R && n == L || p == U && n == D)
                    return p == R ? y : x;
                if (p == D && n == L || p == R && n == U) {
                    return x + y;
                }
                return x - y;
            }

        }

    }

    static class InputReader {
        public final BufferedReader reader;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

