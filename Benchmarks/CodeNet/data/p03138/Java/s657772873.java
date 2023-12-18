import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextLong();

        int count = 0;
        while ((long)1 << (count + 1) <= k)
            count++;

        long x = 0;
        for (; count >= 0; count--) {
            long tmp = x + ((long)1 << count);
            if (tmp <= k) {
                long sum = 0, osum = 0;
                for (long l : a) {
                    sum += tmp ^ l;
                    osum += x ^ l;
                }
                if (sum >= osum)
                    x = tmp;
            }
        }

        long ans = 0;
        for (long i : a)
            ans += x ^ i;
        System.out.println(ans);
    }
}