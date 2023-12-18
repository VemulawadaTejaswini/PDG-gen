import java.util.*;
import java.io.*;
public class Main {
    static long mod = 1000000007;
    static ArrayList<Long> A = new ArrayList<Long>();
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        A.add(nextLong(r));
        long ans = 0;
        for (int i = 1; i < N; i++) {
            long n = nextLong(r);
            ans += xorSum(n) % mod;
            A.add(n);
        }
        System.out.println(ans % mod);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }

    public static long nextLong(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Long.parseLong(str);
    }

    public static long xorSum(long n) {
        long res = 0;
        int[] now = set(n);
        for (long x : A) {
            int[] xor = set(x);
            res += sum(now, xor);
        }
        return res % mod;
    }

    public static int[] set(long n) {
        int[] res = new int[60];
        for (int i = 0; i < 60; i++) {
            res[i] = n % 2 == 1 ? 1 : 0;
            n = n / 2;
            if (n == 0) break;
        }
        return res;
    }

    public static long sum(int[] now, int[] xor) {
        long res = 0;
        for (int i = 0; i < 60; i++) {
            if (now[i] != xor[i]) {
                res += pow(i) % mod;
            }
        }
        return res % mod;
    }

    public static long pow(int i) {
        return i == 0 ? 1 : 2 * pow(i-1);
    }
}
