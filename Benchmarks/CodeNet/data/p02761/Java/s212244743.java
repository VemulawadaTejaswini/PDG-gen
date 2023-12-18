import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(1, in, out);
        out.close();
    }


    static class Solver {

        public void solve(int testNumber, FastReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            boolean[] p = new boolean[n];
            Arrays.fill(arr, Integer.MAX_VALUE);
            for (int i = 0; i < m; i++) {
                int index = in.nextInt() - 1;
                int val = in.nextInt();
                if (!p[index]) {
                    p[index] = true;
                    arr[index] = Math.min(arr[index], val);
                } else {
                    out.print(-1);
                    return;
                }
            }
            if (arr.length == 1) {
                out.print(arr[0]);
                return;
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == Integer.MAX_VALUE) {
                    arr[i] = 0;
                }
            }
            if (arr[0] == 0) {
                out.print(-1);
                return;
            }
            for (int i = 0; i < n; i++) {
                out.print(arr[i]);
            }

        }

    }


    static class FastReader implements AutoCloseable {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        @Override
        public void close() throws Exception {

        }
    }
}