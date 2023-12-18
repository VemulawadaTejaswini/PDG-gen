import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }

            LinkedList<Integer> queue = new LinkedList<>();
            boolean isReverse = !true;

            for (int i = 0; i < a.length; i++) {
                if (!isReverse) {
                    queue.addLast(a[i]);
                } else {
                    queue.addFirst(a[i]);
                }

                isReverse = !isReverse;
            }

            StringBuilder sb = new StringBuilder();
            for (; !queue.isEmpty();) {
                if (!isReverse) {
                    sb.append(queue.pollFirst() + " ");
                } else {
                    sb.append(queue.pollLast() + " ");
                }
            }
            System.out.println(sb.toString().trim());

        }
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
