import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.Stream;
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
            int N = in.nextInt();
            int K = in.nextInt();
            int C = in.nextInt();
            char[] S = in.next().toCharArray();

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                if (S[i] == 'o') set.add(i + 1);
            }
            int lm = N - (C + 1) * (K - 1);
            for (int i = 0; i < lm; i++) {
                if (S[i] != 'o') continue;
                Set<Set<Integer>> set2 = calc(N, K, C, S, i);
                for (Set<Integer> s : set2) {
                    set = set.stream().filter(s::contains).collect(Collectors.toSet());
                }
            }
            set.stream().sorted().forEach(out::println);
        }

        private Set<Set<Integer>> calc(int N, int K, int C, char[] S, int p) {
            Set<Set<Integer>> set = new HashSet<>();
            if (S[p] != 'o' || p >= N) return set;
            if (K == 1) {
                set.add(IntStream.of(p + 1).boxed().collect(Collectors.toSet()));
                return set;
            }
            for (int i = p + C + 1; i < N; i++) {
                Set<Set<Integer>> set2 = calc(N, K - 1, C, S, i);
                if (set2.isEmpty()) continue;
                final int a = p + 1;
                set2.forEach(s -> s.add(a));
                set2 = set2.stream().filter(s -> s.size() == K).collect(Collectors.toSet());
                set.addAll(set2);
            }
            return set;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

