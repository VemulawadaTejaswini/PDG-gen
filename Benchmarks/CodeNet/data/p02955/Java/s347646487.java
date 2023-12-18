import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.io.InputStream;
import java.util.ArrayList;

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
        EMaxGCD solver = new EMaxGCD();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMaxGCD {
        public boolean check(int a[], int k, int x) {
            ArrayList<Integer> rems = new ArrayList<>();
            for (int i = 0; i < a.length; i++) rems.add(a[i] % x);
            Collections.sort(rems);
            int l = 0;
            int r = rems.size() - 1;
            int rem = 0;
            int reqd = 0;
            while (l <= r) {
                if (rem <= 0) {
                    rem += rems.get(l);
                    reqd += rems.get(l);
                    l++;
                } else {
                    rem -= (x - rems.get(r));
                    reqd += (x - rems.get(r));
                    r--;
                }
            }
            if (reqd > 2 * k) return false;
            if (rem != 0) return false;
            return true;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            int ans = 1;
            for (int i = 1; i * i <= sum; i++) {
                if (sum % i == 0) {

                    if (check(a, k, i)) {
                        ans = Math.max(ans, i);
                    }
                    if (check(a, k, sum / i)) {
                        ans = Math.max(ans, sum / i);
                    }
                }
            }
            out.println(ans);
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

