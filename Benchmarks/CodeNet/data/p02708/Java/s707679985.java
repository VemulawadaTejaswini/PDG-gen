import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long count = 0;
        long pow = (long) (Math.pow(10, 9)+7);
        long all = n * (n+1) / 2 ;
        for (long i = k; i <= n+1; i++) {
            if (i == n + 1) {
                count++;
                break;
            }
            long t = n  - i;
            long tmp = t * (t+1) / 2;
            long max = all - tmp;
            long min = i * (i - 1) / 2 ;
            count += (max - min + 1);
        }
        System.out.println(count % pow);
    }
}