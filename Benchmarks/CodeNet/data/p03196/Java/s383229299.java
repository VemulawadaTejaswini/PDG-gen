import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = 0L;
        if (n >= 44) {//1以外ありえない
            System.out.println(1);
            return;
        } else if (n >= 26) {//2か1以外ありえない
            long a = pow(2, n);
            if (a <= p && p % a == 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
            return;
        } else if (n == 1) {
            System.out.println(p);
            return;
        }
        for (long i = 1; ; i++) {
            long a = pow(i, n);
            if (a <= p) {
                if (p % a == 0) {
                    ans = i;
                }
            } else {
                System.out.println(ans);
                return;
            }
        }
    }

    public static long pow(long base, long n) {
        if (base == 1L) return 1L;
        long retV = 1L;
        for (long i = 0; i < n; i++) {
            retV *= base;
        }
        return retV;
    }
}