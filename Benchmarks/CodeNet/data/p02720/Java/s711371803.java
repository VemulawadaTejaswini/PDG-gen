import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k < 10) {
            System.out.println(k);
            return;
        }
        Queue<Long> queue = new ArrayDeque<>();
        for (int i = 1 ; i < 10 ; i++) {
            queue.add((long) i);
        }
        for (int i = 0 ; i < k ; i++) {
            long x = queue.remove();
            if (i == k - 1) {
                System.out.println(x);
            }
            if (x % 10 != 0) {
                queue.add(10 * x + x % 10 - 1);
            }
            queue.add(10 * x + x % 10);
            if (x % 10 != 9) {
                queue.add(10 * x + (x % 10) + 1);
            }
        }


    }

}