import java.util.Scanner;

/**
 * TITLE : Sqrt Inequality
 * URL : https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long as = lessThanSqrt(a);
        long bs = lessThanSqrt(b);
        long cs = lessThanSqrt(c);

        System.out.println((as + bs) < cs ? "Yes" : "No");
        sc.close();
    }

    private static long lessThanSqrt(long a) {
        long b = longSqrt(a);
        if (b * b == a) {
            return b - 1;
        }
        else {
            return b;
        }
    }

    private static long longSqrt(long a) {
        long b = (long) Math.sqrt(a);
        if (b * b > a) {
            b--;
        }
        return b;
    }
}