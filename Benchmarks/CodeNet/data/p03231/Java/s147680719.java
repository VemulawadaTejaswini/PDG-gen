import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long ans = (N / gcd(N, M))*M;
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        long g = gcd(N, M);
        if (g == 1) {
            g = ans;
        }
        int c1 = 1;
        int c2 = 1;
        int a = 1;
        int b = 1;
        if (s[0] != t[0]) {
            System.out.println("-1");
        }
        lavel:
        for (int i = 1; i < N; i++) {
            if ((i * (ans / N) + 1) % g == 0) {
                for (int j = c2; j < M; j++) {
                    if ((j * (ans / M) + 1) % g == 0) {
                        c2 = j + 1;
                        if (s[a] != t[b]) {
                            System.out.println("-1");
                            return;
                        }
                        b++;
                        continue lavel;
                    }
                }
            }
            a++;
        }
        System.out.println(ans);
    }

    long gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}