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
            int n = in.nextInt();
            int s[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                s[i] = in.nextInt();
            }
            Arrays.sort(s);
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += s[i];
            }
            if (sum % 10 != 0) {
                out.println(sum);
                return;
            }
            for (int i = 0; i < s.length; i++) {
                while (sum % 10 == 0 && s[i] % 10 != 0) {
                    sum -= s[i];
                }
                if (sum % 10 != 0) {
                    out.println(sum);
                    return;
                }
            }
            out.println(sum);
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

