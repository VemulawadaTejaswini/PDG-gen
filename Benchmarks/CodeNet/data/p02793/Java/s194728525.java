import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    static final long MOD = 1000000007L;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        long A[] = new long[N];

        long lcm = 1;
        for (int i = 0; i < A.length; i++) {
            A[i] = nextLong();
            lcm = lcm / calcGCD(lcm, A[i]) * A[i];
        }

        long ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += lcm / A[i];
            ans %= MOD;
        }

        System.out.println(ans);
    }

    public static long calcGCD(long a, long b) {
        long l, s;
        if (a > b) {
            l = a;
            s = b;
        } else {
            l = b;
            s = a;
        }
        while (true) {
            long tmp = l % s;
            if (tmp == 0) break;
            l = s;
            s = tmp;
        }
        return s;
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception{
        return Long.parseLong(nextString());
    }

    public static double nextDouble() throws Exception {
        return Double.parseDouble(nextString());
    }
}