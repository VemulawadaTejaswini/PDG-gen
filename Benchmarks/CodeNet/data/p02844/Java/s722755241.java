import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.StringTokenizer;
import java.util.Optional;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            String S = in.next();

            List<TreeSet<Integer>> ls = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                ls.add(new TreeSet<>());
            }
            for (int i = 0; i < N; i++) {
                int c = S.charAt(i) - '0';
                ls.get(c).add(i);
            }

            AtomicInteger ans = new AtomicInteger();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        int finalJ = j;
                        int finalK = k;
                        Optional.ofNullable(ls.get(i).ceiling(0))
                                .flatMap(a -> Optional.ofNullable(ls.get(finalJ).ceiling(a + 1)))
                                .ifPresent(b -> {
                                    if (ls.get(finalK).ceiling(b + 1) != null) {
                                        ans.getAndIncrement();
                                    }
                                });
                    }
                }
            }
            out.println(ans.get());
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

