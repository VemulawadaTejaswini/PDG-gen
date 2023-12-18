import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var k = sc.nextLong();
        long res = 0;
        Deque<Long> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L));
        for (int i = 0; i < k; i++) {
            res = deque.pollFirst();
            if (res % 10 == 0) {
                deque.addLast(res * 10 + res % 10);
                deque.addLast(res * 10 + res % 10 + 1);
            } else if (res % 10 == 9) {
                deque.addLast(res * 10 + res % 10 - 1);
                deque.addLast(res * 10 + res % 10);
            } else {
                deque.addLast(res * 10 + res % 10 - 1);
                deque.addLast(res * 10 + res % 10);
                deque.addLast(res * 10 + res % 10 + 1);
            }
        }
        System.out.println(res);
    }

}
