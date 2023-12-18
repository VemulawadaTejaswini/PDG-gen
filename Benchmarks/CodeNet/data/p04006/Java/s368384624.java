
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x = scanner.nextLong();
        long[] a = new long[n];
        long[] time = new long[n];
        long[] from = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            time[i] = a[i];
            from[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                int prev = (i + j - 1) % n;
                long orig = time[index];
                time[index] = Math.min(orig, time[prev] + x);
                if (time[index] != orig) {
                    from[index] = from[prev];
                }
            }
        }

        int maxCount = 0;
        BigDecimal result = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            int count = 0;
            BigDecimal r = new BigDecimal(time[i]);
            for (int j = 0; j < n; j++) {
                if (from[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                continue;
            }
            result = result.add(r.multiply(new BigDecimal(count)));
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(new BigDecimal(maxCount - 1).multiply(new BigDecimal(x)).add(result));

    }

}