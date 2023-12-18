import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
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
        XTower solver = new XTower();
        solver.solve(1, in, out);
        out.close();
    }

    static class XTower {
        int n;
        block[] arr;
        long[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new block[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new block(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(arr, (a, b) -> a.solidness - b.solidness + a.weight - b.weight);
            long max = 0;
            memo = new long[n][(int) 1e4 + 1];
            for (long[] x : memo)
                Arrays.fill(x, -1);
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i].value + dp(i - 1, arr[i].solidness));
            }
            pw.println(max);
        }

        private long dp(int idx, int rem) {
            if (rem < 0)
                return (long) -1e18;
            if (idx < 0)
                return 0;
            if (memo[idx][rem] != -1)
                return memo[idx][rem];
            long take = arr[idx].value + dp(idx - 1, Math.min(arr[idx].solidness, rem - arr[idx].weight));
            long leave = dp(idx - 1, rem);
            return memo[idx][rem] = Math.max(take, leave);
        }

        public class block {
            int weight;
            int solidness;
            int value;

            public block(int weight, int solidness, int value) {
                this.weight = weight;
                this.solidness = solidness;
                this.value = value;
            }

            public String toString() {
                return "block{" +
                        "weight=" + weight +
                        ", solidness=" + solidness +
                        ", value=" + value +
                        '}';
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

