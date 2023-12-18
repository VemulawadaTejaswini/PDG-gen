import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = n * 3;
        long[] a = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long[] max = new long[n + 1];
        long sum = 0;
        for (int i = 0; i < m; i++) {
            queue.add(a[i]);
            if (i >= n && i <= n * 2) {
                max[i - n] = sum;
                sum -= queue.poll();
            }
            sum += a[i];
        }
 
        queue = new PriorityQueue<>(Comparator.reverseOrder());
        long[] min = new long[n + 1];
        sum = 0;
        for (int i = m; i > 0; i--) {
            queue.add(a[i - 1]);
            if (i >= n && i <= n * 2) {
                min[i - n] = sum;
                sum -= queue.poll();
            }
            sum += a[i - 1];
        }
        long ans = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            ans = Math.max(ans, max[i] - min[i]);
        }
        System.out.println(ans);
    }
}