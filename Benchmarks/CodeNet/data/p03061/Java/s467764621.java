import java.util.*;

public class Main {
    static long mod = 1000000007;


    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] lis = new long[n];
        long[] lis_l = new long[n];
        long[] lis_r = new long[n];

        for (int i = 0; i < n; ++i) {
            long l = sc.nextLong();
            lis[i] = l;
        }
        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                lis_l[i] = gcd(0, lis[i]);
                lis_r[n-i-1] = gcd(0, lis[n-i-1]);
            } else {
                lis_l[i] = gcd(lis_l[i-1], lis[i]);
                lis_r[n-i-1] = gcd(lis_r[n-i], lis[n-i-1]);
            }
        }

        long r = lis_r[1];
        for (int i = 1; i < n - 1; ++i) {
            r = Math.max(r, gcd(lis_l[i-1], lis_r[i+1]));
        }
        r = Math.max(r, lis_l[n-2]);
        System.out.println(r);
    }
}
