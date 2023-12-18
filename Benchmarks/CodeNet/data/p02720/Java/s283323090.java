import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    static Map<Integer, List<Integer>> map = new HashMap<>();

    static {
        map.put(0, Arrays.asList(0, 1));
        map.put(1, Arrays.asList(0, 1, 2));
        map.put(2, Arrays.asList(1, 2, 3));
        map.put(3, Arrays.asList(2, 3, 4));
        map.put(4, Arrays.asList(3, 4, 5));
        map.put(5, Arrays.asList(4, 5, 6));
        map.put(6, Arrays.asList(5, 6, 7));
        map.put(7, Arrays.asList(6, 7, 8));
        map.put(8, Arrays.asList(7, 8, 9));
        map.put(9, Arrays.asList(8, 9));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        Queue<Long> queue = new ConcurrentLinkedQueue<>();
        int count = 0;
        for (long i = 1; i < 10; i++) {
            queue.add(i);
        }

        long value = 0;
        while (k > count) {
            value = queue.poll();

            int div = (int)(value % 10);
            for (long v : map.get(div)) {
                queue.add(value * 10 + v);
            }
            count++;
        }

        System.out.println(value);
    }

}
