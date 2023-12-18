import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
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
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CChocolateBar solver = new CChocolateBar();
        solver.solve(1, in, out);
        out.close();
    }

    static class CChocolateBar {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h % 3 == 0 || w % 3 == 0) {
                out.println(0);
                return;
            }
            long best = Long.MAX_VALUE;
            for (int i = 1; i < h; i++) {
                long[] act = new long[3];
                act[0] = (long) i * w;
                long rem = h - i;
                act[1] = (rem / 2) * w;
                act[2] = (rem - rem / 2) * w;
                Arrays.sort(act);
                best = Math.min(best, act[2] - act[0]);
                act = new long[3];
                act[0] = (long) i * w;
                rem = h - i;
                act[1] = rem * (w / 2);
                act[2] = rem * (w - w / 2);
                Arrays.sort(act);
                best = Math.min(best, act[2] - act[0]);
            }
            for (int i = 1; i < w; i++) {
                long[] act = new long[3];
                act[0] = (long) i * h;
                long rem = w - i;
                act[1] = (rem / 2) * h;
                act[2] = (rem - rem / 2) * h;
                Arrays.sort(act);
                best = Math.min(best, act[2] - act[0]);
                act = new long[3];
                act[0] = (long) i * h;
                rem = w - i;
                act[1] = rem * (h / 2);
                act[2] = rem * (h - h / 2);
                Arrays.sort(act);
                best = Math.min(best, act[2] - act[0]);
            }
            out.println(best);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
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

