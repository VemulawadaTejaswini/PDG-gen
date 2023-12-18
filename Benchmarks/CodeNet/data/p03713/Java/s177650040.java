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
 * @author SimplyDivine
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            long area1 = go(h, w);
            long area2 = go(w, h);
//        System.out.println(area1+" "+area2);
            out.println(Math.min(area1, area2));

        }

        private long go(int tofix, int v) {
            long ans1 = Long.MAX_VALUE;
            long ans2 = Long.MAX_VALUE;
            for (long i = 0; i <= tofix; i++) {
                long A = i * v;
                long temp = (tofix - i) / 2;
                long B = temp * v;
                long C = (tofix - i - temp) * v;
                ans1 = Math.min(ans1, Math.max(A, C) - Math.min(A, B));
            }
//        System.out.println("ans1="+ans1);
            for (long i = 0; i <= tofix; i++) {
                long A = i * v;
                long B = (v / 2) * (tofix - i);
                long C = (v - v / 2) * (tofix - i);
                ans2 = Math.min(ans2, Math.max(A, C) - Math.min(A, B));
            }
//        System.out.println("ans2="+ans2);
            return Math.min(ans1, ans2);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream i) {
            br = new BufferedReader(new
                    InputStreamReader(i));
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

