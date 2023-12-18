import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAtcoderC solver = new TaskAtcoderC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtcoderC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();

            int ar[] = in.nextIntArray(n);
            int mean = Integer.MAX_VALUE;
            for (int k = 1; k < 100; k++) {


                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum = sum + (ar[i] - k) * (ar[i] - k);
                }
                mean = Math.min(sum, mean);
            }
            out.println(mean);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

    }
}

