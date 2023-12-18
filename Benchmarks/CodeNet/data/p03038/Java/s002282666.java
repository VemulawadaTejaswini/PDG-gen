import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    private static int n;
    private static PriorityQueue<Long> queue = new PriorityQueue<>();

    private static void add(long num) {
        queue.add(num);
        if (queue.size() > n) {
            queue.poll();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        int[] b = new int[m];
        long[] c = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b[i]; j++) {
                add(c[i]);
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += queue.poll();
        }
        System.out.println(ans);
    }

}
