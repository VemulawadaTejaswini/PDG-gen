import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ASimpleCalulator solver = new ASimpleCalulator();
        solver.solve(1, in, out);
        out.close();
    }

    static class ASimpleCalulator {
        public void solve(int testNumber, FastReader fs, PrintWriter pw) {
            long A = fs.nextLong(), B = fs.nextLong();
            long ans = (long) 1e15;
            if (A <= B) {
                ans = Math.min(ans, B - A);
            }
            A *= -1;
            if (A <= B) {
                ans = Math.min(ans, B - A + 1);
            }
            B *= -1;
            if (A <= B) {
                ans = Math.min(ans, B - A + 2);
            }
            A *= -1;
            if (A <= B) {
                ans = Math.min(ans, B - A + 1);
            }
            pw.println(ans);
        }

    }

    static class FastReader {
        BufferedReader bf;
        StringTokenizer st;

        public FastReader(InputStream is) {
            bf = new BufferedReader(new InputStreamReader(is));
            st = null;
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    String line = bf.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
            } catch (Exception e) {
            }

            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

