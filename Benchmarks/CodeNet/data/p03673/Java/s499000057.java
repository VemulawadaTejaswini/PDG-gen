import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] array;
    static Deque<Integer> deque;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                deque.addFirst(array[i]);
            } else {
                deque.addLast(array[i]);
            }
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(deque.pollLast());
                if (i != n-1) System.out.print(" ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(deque.pollFirst());
                if (i != n-1) System.out.print(" ");
            }
        }
        System.out.println();
    }
}
