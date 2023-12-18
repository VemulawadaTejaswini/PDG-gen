import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.HashMap;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
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
        G solver = new G();
        solver.solve(1, in, out);
        out.close();
    }

    static class G {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();
            int[] dp = new int[N + 1];
            Map<Integer, List<Integer>> edge = new HashMap<>();
            for (int i = 1; i <= N; i++) {
                edge.put(i, new ArrayList<>());
            }
            List<int[]> node = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                node.add(new int[]{i + 1, 0});
            }
            for (int i = 0; i < M; i++) {
                int x = in.Int();
                int y = in.Int();
                edge.get(x).add(y);
                node.get(y - 1)[1]++;
            }
            node.sort(Comparator.comparingInt(o -> o[1]));
            for (int[] n : node) {
                int x = n[0];
                for (int i : edge.get(x)) {
                    dp[i] = Math.max(dp[i], dp[x] + 1);
                }
            }
            out.println(IntStream.of(dp).max().orElse(0));
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

