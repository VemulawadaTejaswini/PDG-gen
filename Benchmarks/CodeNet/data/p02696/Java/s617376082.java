
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
        long z = f(a, hi, b);
        while (lo < hi) {
            long mid = lo + hi >>> 1;
            long f = f(a, mid, b);
            if (f < z) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        System.out.println(f(a, lo, b));
    }

    private static long f(long a, long mid, long b) {
        return Math.floorDiv(a * mid, b) - a * Math.floorDiv(mid, b);
    }
}
