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
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        static final int mod = (int) 1e9 + 7;

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x % 3 == 0 && y % 3 == 0) || (x % 3 == 1 && y % 3 == 2) || (x % 3 == 2 && y % 3 == 1)) {
                int need1 = 0;
                int need2 = 0;
                for (int i = 0; i <= x; i++) {
                    int rest = x - i;
                    if (rest % 2 == 0) {
                        int need = rest / 2;
                        if (i * 2 + need == y) {
                            need1 = i;
                            need2 = need;
                            break;
                        }
                    }
                }
                if (need1 == 0 && need2 == 0) {
                    out.println(0);
                    return;
                }
                long[] fact = new long[2000001];
                fact[0] = 1;
                for (int i = 1; i < 2000001; i++) {
                    fact[i] = (fact[i - 1] * i) % mod;
                }
                out.println((fact[need1 + need2] * (pow((fact[need1] * fact[need2]) % mod, mod - 2, mod))) % mod);
            } else {
                out.println(0);
            }
        }

        static int pow(long x, long y, int p) {
            long res = 1;
            x = x % p;

            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return (int) res;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

