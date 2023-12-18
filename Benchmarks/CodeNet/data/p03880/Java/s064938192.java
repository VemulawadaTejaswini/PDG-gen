import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = Long.parseLong(stdin.nextLine());

        long b = Arrays.stream(a).reduce((x, y) -> x ^ y).getAsLong();

        long max = Arrays.stream(a).max().getAsLong();
        long len = 0L;
        while (max > 0L) {
            len++;
            max /= 2L;
        }

        long ans = 0;
        for (long i = len; i >= 0; i--) {
            if ((b & (1L << i)) == 0) continue;
            for (int j = 0; j < n; j++) {
                long k = a[j] ^ (a[j] - 1L);
                if (k != (1L << (i + 1)) - 1) {
                    ans++;
                    b ^= k;
                }
            }
        }

        System.out.println(b == 0 ? ans : -1);
    }
}