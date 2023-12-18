import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long tlc = 1;
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextLong();
            tlc = tlc(tlc, as[i]);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (tlc - 1) % as[i];
        }

        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        long bigger = Math.max(a, b);
        long smaller = Math.min(a, b);
        long mod = bigger % smaller;
        while (mod > 0) {
            bigger = smaller;
            smaller = mod;
            mod = bigger % smaller;
        }
        return smaller;
    }

    static long tlc(long a, long b) {
        return  a / gcd(a, b) * b;
    }
}