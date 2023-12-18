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
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXorSum4 solver = new DXorSum4();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum4 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int[][] nb = new int[n][60];
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j < 60; j++) {
                    nb[i][j] = nb[i + 1][j];
                    if ((a[i + 1] & 1L << j) > 0) {
                        nb[i][j]++;
                    }
                }
            }
            long ans = 0;
            int mod = (int) 1e9 + 7;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 60; j++) {
                    if ((a[i] & 1L << j) > 0) {
                        ans += (((1L << j) % mod) * (long) ((n - i - 1 - nb[i][j]) % mod)) % mod;
                    } else {
                        ans += (((1L << j) % mod) * (long) ((nb[i][j]) % mod)) % mod;
                    }
                    ans %= mod;
                }
            }
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

