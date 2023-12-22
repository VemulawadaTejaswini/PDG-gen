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
 * @author bhavy seth
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            int x = sc.nextInt();
            int b = -1;
            while (true) {
                long res = (long) Math.pow(b, 5) + (long) x;
                long L = 0;
                long R = res;
                long mid = 0;
                boolean ispos = false;
                while (L <= R) {
                    mid = L + (R - L) / 2;
                    long mul5 = mid * mid * mid * mid * mid;
                    if (mul5 == res) {
                        ispos = true;
                        break;
                    } else if (mul5 < res) {
                        L = mid + 1;
                    } else {
                        R = mid - 1;
                    }

                }
                if (ispos) {
                    out.println(mid + " " + b);
                    break;
                }
                b++;
            }
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
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

