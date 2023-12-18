import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Azhan Khan
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int[] dp = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            LinkedList<Integer> list = new LinkedList<>();
            list.add(0);
            dp[0] = 0;
            while (!list.isEmpty()) {
                int node = list.poll();
                //out.println(node);
                if (node + 1 < n) {
                    dp[node + 1] = Math.min(dp[node + 1], dp[node] + Math.abs(arr[node] - arr[node + 1]));
                    list.add(node + 1);
                }
                if (node + 2 < n) {
                    dp[node + 2] = Math.min(dp[node + 2], dp[node] + Math.abs(arr[node] - arr[node + 2]));
                    list.add(node + 2);
                }
            }

            out.print(dp[n - 1]);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}