import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();
            int K = in.Int();
            int[] A = in.Int(N);
            int[] B = in.Int(M);

            ArrayDeque<Integer> aq = IntStream.of(A).boxed().collect(Collectors.toCollection(ArrayDeque::new));
            ArrayDeque<Integer> bq = IntStream.of(B).boxed().collect(Collectors.toCollection(ArrayDeque::new));
            aq.add((int) (1e9 + 1));
            bq.add((int) (1e9 + 1));
            int ans = 0;
            while (K > 0) {
                if (aq.getFirst() <= bq.getFirst()) {
                    if (aq.getFirst() <= K) {
                        ans++;
                    }
                    K -= aq.removeFirst();
                } else {
                    if (bq.getFirst() <= K) {
                        ans++;
                    }
                    K -= bq.removeFirst();
                }
            }
            out.println(ans);
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

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

