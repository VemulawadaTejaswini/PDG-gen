import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        long ans = x;
        long cnt = x / d;

        if (cnt > k) {
            for (long i = 0; i < k; i++) {
                ans = getNext(ans, d);
            }
        } else {
            for (long i = 0; i < cnt; i++) {
                ans = getNext(ans, d);
            }
            if ((k - cnt) % 2 == 1) {
                ans = getNext(ans, d);
            }
        }

        System.out.println(Math.abs(ans));
    }

    private static long getNext(long p1, long p2) {
        if (p1 > 0) {
            return p1 - p2;
        } else {
            return p1 + p2;
        }
    }
}