import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long baisuCountSum1 = countBaisu(A, B, C);
        long baisuCountSum2 = countBaisu(A, B, D);
        long baisuCountSum3 = countBaisu(A, B, lcm(C, D));
        long ans = (B - A + 1) - (baisuCountSum1 + baisuCountSum2 - baisuCountSum3);
        System.out.print(ans);
    }

    private long countBaisu (long start, long end, long number) {
        long count = 0;
        for (long i = 1; ; i++) {
            long baisu = number * i;
            if (start <= baisu) {
                if (baisu <= end) {
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
