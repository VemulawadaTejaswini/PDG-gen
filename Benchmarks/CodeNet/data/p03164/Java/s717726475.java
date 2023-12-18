import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Codes solver = new Codes();
        solver.solve(1, in, out);
        out.close();
    }

    static class Codes {
        static int n;
        static int[] weight;
        static int[] value;
        static HashMap<Codes.pair, Integer> memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            int start = sc.nextInt();
            weight = new int[n];
            value = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
                value[i] = sc.nextInt();
            }
            memo = new HashMap<>();
            pw.println(dp(0, start));
        }

        private int dp(int idx, int cur) {
            if (cur < 0)
                return (int) -1e9;
            if (idx == n)
                return 0;
            Integer mem = memo.get(new Codes.pair(idx, cur));
            if (mem != null)
                return mem;
            int take = value[idx] + dp(idx + 1, cur - weight[idx]);
            int leave = dp(idx + 1, cur);
            memo.put(new Codes.pair(idx, cur), Math.max(take, leave));
            return Math.max(take, leave);
        }

        static class pair {
            int idx;
            int weight;

            public pair(int idx, int weight) {
                this.idx = idx;
                this.weight = weight;
            }

            public String toString() {
                return idx + " " + weight;
            }

            public boolean equals(Object obj) {
                return idx == ((Codes.pair) obj).idx && weight == ((Codes.pair) obj).weight;
            }

            public int hashCode() {
                return Objects.hash(idx, weight);
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
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

