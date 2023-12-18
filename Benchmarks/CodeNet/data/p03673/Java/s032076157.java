import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * pushpush
 */
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Deque<Long> dq = new ArrayDeque<Long>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();

            if (i % 2 == 0) {
                dq.addLast(a);
            } else {
                dq.addFirst(a);
            }
        }

        if (n % 2 == 0) {
            while (!dq.isEmpty()) {
                System.out.print(dq.poll() + " ");
            }
            System.out.println();
        } else {
            while (!dq.isEmpty()) {
                System.out.print(dq.pollLast() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}