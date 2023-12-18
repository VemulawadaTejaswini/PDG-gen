

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static boolean canBuy(long a, long b, long c, long d) {
        long remain = a;
        final Set<Long> remains = new HashSet<>();
        while (true) {
            if (remain < b) {
                return false;
            }
            if (remain - b < c) {
                remain -= b;
            } else {
                long k = (remain - c) / b;
                remain -= k * b;
            }
            if (remain <= c) {
                remain += d;
            }
            if (remains.contains(remain)) {
                return true;
            } else {
                remains.add(remain);
            }
        }

    }
    public static void main(String [] args) {
        final Scanner sc = new Scanner(System.in);
        final int t = sc.nextInt();
        for (int i = 0; i <= t; ++i) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            if (canBuy(a, b, c, d)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
