import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long t[] = new long[n];
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long mod = 1_000_000_007;
        long p[] = new long[n];
        p[0] = 1;
        p[n - 1] = 1;
        for (int i = 1; i < n - 1; i++) {
            if (t[i - 1] != t[i] || a[i] != a[i + 1]) {
                if (t[i - 1] == t[i]) {
                    p[i] = (t[i] >= a[i] ? 1 : 0);
                } else if (a[i] == a[i + 1]) {
                    p[i] = (t[i] <= a[i] ? 1 : 0);
                } else {
                    p[i] = (t[i] == a[i] ? 1 : 0);
                }
            } else {
                p[i] = Math.min(t[i], a[i]);
            }
        }

        long ans = (t[0] == a[n - 1] ? 1 : 0);
        for (int i = 0; i < n; i++) {
            ans *= p[i];
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
