import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D756 solver = new D756();
        solver.solve(1, in, out);
        out.close();
    }

    static class D756 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 2; i <= 100; i++) {
                if (Maths.isPrime(i)) {
                    int temp = n;
                    int d = i;
                    int c = 0;
                    while (temp / d > 0) {
                        c += temp / d;
                        d *= d;
                    }
//                out.println( i + " " + c);
                    a.add(c);
                }
            }
            int tf = 0;
            int t = 0;
            int f = 0;
            for (int i = 0; i < a.size(); i++) {
                int x = a.get(i);
                if ((x + 1) / 25 > 0) {
                    tf++;
                    t++;
                } else if ((x + 1) / 5 > 0) {
                    f++;
                    t++;
                } else if ((x + 1) / 3 > 0) {
                    t++;
                }

            }
//        out.println(tf);
//        out.println(f);
//        out.println(t);
            int ans = (((tf + f) * (tf + f - 1) * (t - 2)) / 2) + (tf * (t - 1));
            out.println(ans);

        }

    }

    static class Maths {
        static boolean isPrime(int n) {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i = i + 6)
                if (n % i == 0 || n % (i + 2) == 0)
                    return false;
            return true;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

