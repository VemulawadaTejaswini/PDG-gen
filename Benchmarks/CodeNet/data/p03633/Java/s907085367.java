import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] t = new long[N];

        for (int i = 0; i < N; i++) {
            t[i] = sc.nextLong();
        }

        if (N == 1) {
            System.out.println(t[0]);
            return;
        }

        long ans = lcm(t[0], t[1]);
        for (int i = 2; i < N; i++) {
            ans = lcm(ans, t[i]);
        }
        System.out.println(ans);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        long r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
