import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        long g = gcd(N, M);
        long l = N / g * M;
        int n = (int) (N / g);
        int m = (int) (M / g);
        for (int i = 0; i < g; i++) {
            if (s[i * n] != t[i * m]) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(l);
    }

    long gcd(long m, long n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}