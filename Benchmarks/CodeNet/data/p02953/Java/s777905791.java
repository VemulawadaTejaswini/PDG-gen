import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N];
        long count = 0;
        int ans = 0;
        boolean c = true;
        boolean c2 = true;
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextLong();
            if (i > 0 && H[i] - H[i - 1] < -1) {
                c = false;
            }else if (i > 0 && H[i] - H[i - 1] < 0) {
                if (!(c2)) {
                    c = false;
                }
                c2 = false;
            } else {
                c2 = true;
            }

        }
        if (!(c)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    int gcd(int m, int n
    ) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
