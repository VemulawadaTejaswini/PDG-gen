

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        System.out.println(num(B,C,D) - num(A-1,C,D));
    }

    static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // cでもdでも割れない個数
    static long num(long n, long c, long d) {
        // 最大公約数
        long G = gcd(c,d);
        // 最小公倍数
        long L = c / G * d;

        return n - (n/c) - (n/d) + (n/L);
    }
}
