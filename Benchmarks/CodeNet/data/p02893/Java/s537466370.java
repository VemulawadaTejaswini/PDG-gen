import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CDivisionByTwoWithSomething solver = new CDivisionByTwoWithSomething();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisionByTwoWithSomething {
        long mod = 998244353;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            out.println(fast(n, s));
        }

        int fast(int n, char[] s) {
            // Utils.reverse(s);
            int[] f = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                f[i] = (int) (i % mod);
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 2 * i; j <= n; j += i) {
                    if (n % i == 0 && n % j == 0 && j / i % 2 == 1) {
                        f[i] -= f[j];
                        if (f[i] < 0) {
                            f[i] += mod;
                        }
                    }
                }
            }
            char[] cmp = new char[n];
            long ans = 0;
            for (int len = 1; len <= n; len++) {
                if (n % len == 0 && (n / len) % 2 == 1) {
                    long valX = 0;
                    for (int i = 0; i < len; i++) {
                        valX = valX * 2 + s[i] - '0';
                        if (valX >= mod) {
                            valX -= mod;
                        }
                    }
                    ans += valX * f[len] % mod;
                    for (int i = 0; i < len; i++) {
                        char cur = s[i];
                        for (int j = i; j < n; j += len) {
                            cmp[j] = cur;
                            cur = (char) (cur ^ 1);
                        }
                    }
                    boolean ok = true;
                    for (int i = 0; i < n; i++) {
                        if (cmp[i] < s[i]) {
                            break;
                        }
                        if (cmp[i] > s[i]) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        ans += f[len];
                    }
                }
            }
            return (int) (2 * ans % mod);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

