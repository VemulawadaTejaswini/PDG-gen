import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Deque<Long> deque1 = new ArrayDeque<>();
        Deque<Long> deque2 = new ArrayDeque<>();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            deque1.add(a[i]);
            deque2.add(a[i]);
        }
        Arrays.sort(a);
        b[0] = c[0] = a[n / 2];
        b[n - 1] = c[n - 1] = n % 2 == 0 ? a[n / 2 - 1] : a[n / 2] - a[n / 2 - 1] > a[n / 2 + 1] - a[n / 2] ? a[n / 2 + 1] : a[n / 2 - 1];
        deque1.remove(b[0]);
        deque1.remove(b[n - 1]);
        deque2.remove(b[0]);
        deque2.remove(b[n - 1]);

        boolean f = true;
        for (int i = 1; i < n - 1; i++) {
            long j = f ? deque1.pollFirst() : deque1.pollLast();
            long k = f ? deque2.pollLast() : deque2.pollFirst();
            Utils.println(j, k);
            b[i] = j;
            c[i] = k;
            f = !f;
        }

        long ans1 = 0, ans2 = 0;
        for (int i = 1; i < n; i++) {
            ans1 += Math.abs(b[i - 1] - b[i]);
            ans2 += Math.abs(c[i - 1] - c[i]);
        }

        System.out.println(Math.max(ans1, ans2));
    }
}