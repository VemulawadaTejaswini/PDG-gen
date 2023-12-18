import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC121C solver = new ABC121C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC121C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();
            List<ABC121C.Pair<Integer, Integer>> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int A = in.Int();
                int B = in.Int();
                list.add(new ABC121C.Pair<>(A, B));
            }

            list.sort(Comparator.naturalOrder());
            long ans = 0;
            for (int i = 0; i < N && M > 0; i++) {
                ABC121C.Pair<Integer, Integer> p = list.get(i);
                if (p.v <= M) {
                    ans += (long) p.k * p.v;
                    M -= p.v;
                } else {
                    ans += (long) p.k * M;
                    M = 0;
                }
            }
            out.println(ans);
        }

        static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<ABC121C.Pair<K, V>> {
            K k;
            V v;

            Pair(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public int compareTo(ABC121C.Pair<K, V> o) {
                int c = this.k.compareTo(o.k);
                if (c == 0) c = this.v.compareTo(o.v);
                return c;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ABC121C.Pair<?, ?> pair = (ABC121C.Pair<?, ?>) o;
                return Objects.equals(k, pair.k) &&
                        Objects.equals(v, pair.v);
            }

            public int hashCode() {
                return Objects.hash(k, v);
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

