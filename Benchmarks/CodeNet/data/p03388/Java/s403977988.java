
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int q = sc.nextInt();
        long[] a = new long[q];
        long[] b = new long[q];
        for (int i = 0; i < q; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < q; i++) {
            System.out.println(solve(a[i], b[i]));
        }
    }

    private static long solve(long a, long b) {
        long max = a * b;
        long count = 0;
        long lastMin = max;
        for (long i = 1; ; i++) {
            if (i == a) {
                continue;
            }
            long b2 = max / i;
            if (max % i == 0 || b2 == b) {
                b2--;
            }
            while (b2 >= lastMin) {
                b2--;
            }
            if (b2 == 0) {
                return count;
            }
            count++;
            lastMin = b2;
        }
    }


}
