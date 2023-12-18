import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jasper van Merle
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            Map<Integer, Integer> occurences = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();

                occurences.merge(a, 1, (x, y) -> x + y);
            }

            List<Integer> amounts = new ArrayList<>(occurences.values());

            if (amounts.size() <= k) {
                out.println(0);
            } else {
                Collections.sort(amounts);

                int needed = amounts.size() - k;
                int total = 0;

                for (int i = 0; i < needed; i++) {
                    total += amounts.get(i);
                }

                out.println(total);
            }
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
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

