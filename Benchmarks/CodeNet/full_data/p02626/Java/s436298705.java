import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = 0;
        for (int i = 2; i < n; i++) {
            x ^= sc.nextLong();
        }
        long s = a + b;
        long base = s - x;
        if (base % 2 == 1) {
            System.out.println(-1);
            return;
        }
        base >>= 1;
        for (long y = (1L << 50); y >= 1; y >>= 1) {
            if ((y & x) == 0 || (base | y) > a) {
                continue;
            }
            base |= y;
        }
        if (a - base <= 0 || base == 0) {
            System.out.println(-1);
        } else {
            System.out.println(a - base);
        }
    }
}