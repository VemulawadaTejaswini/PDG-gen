import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        int n;
        FAirSafety.P[] p;
        private static final char L = 'L';
        private static final char R = 'R';
        private static final char U = 'U';
        private static final char D = 'D';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            p = new FAirSafety.P[n];
            for (int i = 0; i < n; i++) {
                p[i] = new FAirSafety.P(in.nextInt(), in.nextInt(), in.next().charAt(0));
            }

            int answer = Integer.MAX_VALUE;
            answer = Math.min(answer, h(R, L));
            answer = Math.min(answer, h(U, D));

            answer = Math.min(answer, d(U, L));
            answer = Math.min(answer, d(R, D));
            answer = Math.min(answer, d(D, L));
            answer = Math.min(answer, d(R, U));

            if (answer == Integer.MAX_VALUE) {
                out.println("SAFE");
                return;
            }
            out.println(answer * 5);
        }

        private int d(char h, char v) {
            int answer = Integer.MAX_VALUE;
            TreeMap<Integer, TreeSet<Integer>> pos = new TreeMap<>();
            TreeMap<Integer, TreeSet<Integer>> neg = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (p[i].d == h) {
                    add(pos, p[i].stay(h, v), p[i].move(h, v));
                } else if (p[i].d == v) {
                    add(neg, p[i].stay(h, v), p[i].move(h, v));
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

        private int h(char d1, char d2) {
            int answer = Integer.MAX_VALUE;
            TreeMap<Integer, TreeSet<Integer>> pos = new TreeMap<>();
            TreeMap<Integer, TreeSet<Integer>> neg = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (p[i].d == d1) {
                    add(pos, p[i].stay(), p[i].move());
                } else if (p[i].d == d2) {
                    add(neg, p[i].stay(), p[i].move());
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

            public int move() {
                if (d == L || d == R)
                    return x;
                return y;
            }

            public int stay() {
                return x + y - move();
            }

            public int move(char h, char v) {
                return x + y + x - y - stay(h, v);
            }

            public int stay(char h, char v) {
                if (h == D && v == L || h == R && v == U) {
                    return x + y;
                }
                return x - y;
            }

            public String toString() {
                return "P{" + "p=" + Pii.of(x, y) + ", d=" + d + '}';
            }

        }

    }

    static class Pii implements Comparable<Pii> {
        public final int first;
        public final int second;

        public Pii(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public static Pii of(int first, int second) {
            return new Pii(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pii pair = (Pii) o;
            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{first, second});
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
        }

        public int compareTo(Pii o) {
            if (first != o.first)
                return Integer.compare(first, o.first);
            return Integer.compare(second, o.second);
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

