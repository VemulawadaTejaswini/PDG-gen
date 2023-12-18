

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long a = in.nextLong();
        final long b = in.nextLong();
        final long n = in.nextLong();
        in.nextLine();
        long lo = 1;
        long hi = n;
        long res = 0;
        while (lo < hi) {
            long mid = lo + hi >>> 1;
            long f = f(a, mid, b);
            long f1 = f(a, mid + 1, b);
            if (f <= f1) {
                res = Math.max(res, f1);
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        System.out.println(res);
    }

    private static long f(long a, long mid, long b) {
        return Math.floorDiv(a * mid, b) - a * Math.floorDiv(mid, b);
    }
}
