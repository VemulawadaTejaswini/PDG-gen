import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        long mod = (long) (1e9 + 7);

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int spf[] = CodeX.SPF(1000000 + 100);

            int arr[] = new int[n];

            HashMap<Integer, Integer> lcm = new HashMap<>();

            for (int i = 0; i < n; i++) {
                HashMap<Integer, Integer> hashMap = new HashMap<>();
                arr[i] = in.scanInt();
                int x = arr[i];

                while (x != 1) {
                    hashMap.putIfAbsent(spf[x], 0);
                    hashMap.put(spf[x], hashMap.get(spf[x]) + 1);
                    x = x / spf[x];
                }

                for (int key : hashMap.keySet()) {
                    lcm.putIfAbsent(key, 0);
                    lcm.put(key, Math.max(lcm.get(key), hashMap.get(key)));
                }

            }
            long ans = 0;
            long LL = 1;
            for (int k : lcm.keySet()) {
                LL = (LL * CodeX.power(k, lcm.get(k))) % mod;
            }

            for (int i = 0; i < n; i++) ans = (ans + (LL * CodeX.modinv(arr[i], mod))) % mod;
            out.println(ans);
        }

    }

    static class CodeX {
        public static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {

                if ((y & 1) != 0)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

        public static long power(long x, long y) {
            long res = 1;
            while (y > 0) {
                if ((y & 1) != 0)
                    res = (res * x);
                y = y >> 1;
                x = (x * x);
            }
            return res;
        }

        public static long modinv(long k, long mod) {
            return power(k, mod - 2, mod);
        }

        public static int[] SPF(int MAXN) {
            int[] spf = new int[MAXN + 5];
            spf[1] = 1;
            for (int i = 2; i < MAXN; i++) spf[i] = i;
            for (int i = 4; i < MAXN; i += 2) spf[i] = 2;
            for (int i = 3; i * i < MAXN; i++) {
                if (spf[i] == i) {
                    for (int j = i * i; j < MAXN; j += i)
                        if (spf[j] == j)
                            spf[j] = i;
                }
            }
            return spf;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

