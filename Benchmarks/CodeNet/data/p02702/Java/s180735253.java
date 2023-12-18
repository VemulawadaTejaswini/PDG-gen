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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            String s = in.next();
            int n = s.length();
            int[] digits = new int[n];
            for (int i = 0; i < n; i++) {
                digits[i] = s.charAt(i) - '0';
            }

            int p = 2019;
            int[] freq = new int[p];
            freq[0] = 1;
            long answer = 0;
            int curr = 0;
            int pow10 = 1;
            for (int j = n - 1; j >= 0; j--, pow10 *= 10, pow10 %= p) {
                curr += pow10 * digits[j];
                curr %= p;
                answer += freq[curr];
                freq[curr]++;
            }
            out.println(answer);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

