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
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CFiveTransportations solver = new CFiveTransportations();
        solver.solve(1, in, out);
        out.close();
    }

    static class CFiveTransportations {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            long n = sc.nextLong();
            long[] tab = new long[5];
            for (int i = 0; i < 5; i++) {
                tab[i] = sc.nextLong();
            }
            long min = Long.MAX_VALUE;
            for (int i = 0; i < 5; i++) {
                min = Math.min(min, tab[i]);
            }
            long ans = n / min + (n % min == 0 ? 0 : 1) + 4;
            out.println(ans);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

