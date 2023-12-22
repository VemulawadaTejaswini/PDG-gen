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
 * @author HussienMoustafa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfDivisors {
        private int sum(int n) {
            int cnt = 0;
            int i = 1;

            for (; i * i < n; i++) {
                if (n % i == 0) cnt += 2;
            }
            if (i * i == n) cnt++;

            return cnt;
        }

        public void solve(int testNumber, Scanner s, PrintWriter out) {
            long sum = 0;
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                sum += i * sum(i);
            }
            out.println(sum);

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

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

