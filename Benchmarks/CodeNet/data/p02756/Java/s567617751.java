import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Deque<String> deque = new ArrayDeque<>();
        for (char c : s) {
            deque.addLast(String.valueOf(c));
        }
        sc.nextLine();
        int q = sc.nextInt();
        boolean isReverse = false;
        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int t = sc.nextInt();
            if (t == 1) {
                isReverse = !isReverse;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (!isReverse) {
                        deque.addFirst(sc.next());
                    } else {
                        deque.addLast(sc.next());
                    }
                } else {
                    if (!isReverse) {
                        deque.addLast(sc.next());
                    } else {
                        deque.addFirst(sc.next());
                    }
                }
            }
        }
        int size = deque.size();
        if (!isReverse) {
            for (int i = 0; i < size; i++) {
                System.out.print(deque.pollFirst());
            }
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(deque.pollLast());
            }
        }

    }
}
