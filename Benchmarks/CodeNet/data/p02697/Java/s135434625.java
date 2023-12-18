import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.List;
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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();

            int c = N / 2;
            List<int[]> ans = new ArrayList<>();
            if (N % 2 == 0) {
                ans.add(new int[]{0, 1});
                int l = 2;
                int r = 4;
                for (int i = 1; i < M; i++) {
                    ans.add(new int[]{l, r});
                    l += 1 * i;
                    r += 2 * i;
                }
            } else {
                for (int i = 0; i < M; i++) {
                    ans.add(new int[]{(c - i), (c + 1 + i)});
                }
            }
            if (!test(N, M, ans)) {
                throw new RuntimeException("WA");
            }
            ans.forEach(is -> out.println(is[0] + " " + is[1]));
        }

        boolean test(int N, int M, List<int[]> ans) {
            List<Integer> A = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                A.add(i + 1);
            }
            Set<E.Pair<Integer, Integer>> match = new HashSet<>();
            E.Pair<Integer, Integer> p = new E.Pair<>(0, 0);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int[] m = ans.get(j);
                    int l = A.indexOf(m[0]);
                    int r = A.indexOf(m[1]);
                    if (l > r) {
                        int temp = r;
                        r = l;
                        l = temp;
                    }
                    p.k = l;
                    p.v = r;
                    if (match.contains(p)) {
                        return false;
                    }
                    match.add(new E.Pair<>(l, r));
                }
                int v = A.get(0);
                for (int j = 0; j < N; j++) {
                    if (++v == N + 1) v = 1;
                    A.set(j, v);
                }
            }
            return true;
        }

        static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<E.Pair<K, V>> {
            K k;
            V v;

            Pair(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public int compareTo(E.Pair<K, V> o) {
                int c = this.k.compareTo(o.k);
                if (c == 0) c = this.v.compareTo(o.v);
                return c;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                E.Pair<?, ?> pair = (E.Pair<?, ?>) o;
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
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

