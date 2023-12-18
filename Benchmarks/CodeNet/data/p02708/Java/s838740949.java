import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long count = 0;
        long small = 0;
        long smallCount = 0;
        long big = 0;
        long bigCount = 0;
        boolean end = false;
        while (!end) {
            for (long j = 0; j < k; j++) {
                small += j;
                smallCount++;
            }
            for (long j = n; j > n - k; j--) {
                big += j;
                bigCount++;
            }
            count += big - small + 1;
            small = 0;
            smallCount = 0;
            big = 0;
            bigCount = 0;
            k++;
            if (n + 1 < k)
                end = true;
        }
        System.out.println(count % 1000000007L);
    }
}