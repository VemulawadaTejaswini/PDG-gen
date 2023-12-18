import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static long[] dists;
    static long[] values;
    static long c;
    static Long sum = 0L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = sc.nextLong();

        dists = new long[n];
        values = new long[n];

        for (int i = 0; i < n; i++) {
            dists[i] = sc.nextLong();
            values[i] = sc.nextLong();
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        System.out.print(search(queue, -1, 0L));
    }

    private static long search(LinkedList<Integer> queue, int currentIndex, Long sum) {
        LinkedList<Integer> queue1 = new LinkedList<>(queue);
        LinkedList<Integer> queue2 = new LinkedList<>(queue);

        Integer nextForward = queue1.poll();
        Integer nextBackForward = queue2.pollLast();
        if (nextForward == null || nextBackForward == null) {
            return sum;
        }

        Long currentDist = (currentIndex != -1) ? dists[currentIndex] : 0L;

        Long value1 = values[nextForward] - Math.abs(dists[nextForward] - currentDist);
        Long sum1 = Math.max(search(queue1, nextForward, sum + value1), sum);

        Long value2 = values[nextBackForward] - (currentDist + (c - dists[nextBackForward]));
        Long sum2 = Math.max(search(queue2, nextBackForward, sum + value2), sum);

        return Math.max(sum1, sum2);
    }
}
