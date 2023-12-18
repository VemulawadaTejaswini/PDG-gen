import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();

        List<PriorityQueue<Long>> queues = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            queues.add(new PriorityQueue<>(n, Collections.reverseOrder()));
        }

        for (int i = 0; i < n; i++) {
            long x = std.nextLong();
            long y = std.nextLong();
            long z = std.nextLong();

            long t1 = x + y + z;
            queues.get(0).add(t1);

            long t2 = -x + y + z;
            queues.get(1).add(t2);

            long t3 = x - y + z;
            queues.get(2).add(t3);

            long t4 = x + y - z;
            queues.get(3).add(t4);

            long t5 = x - y - z;
            queues.get(4).add(t5);

            long t6 = -x -y -z;
            queues.get(5).add(t6);

            long t7 = -x -y +z;
            queues.get(6).add(t7);

            long t8 = -x +y -z;
            queues.get(7).add(t8);
        }

        long max = 0;
        for (int i = 0; i < 8; i++) {
            long total = 0;
            PriorityQueue<Long> queue = queues.get(i);
            for (int j = 0; j < m; j++) {
                long val = queue.poll();
                total += val;
            }

            max = Math.max(max, total);
        }

        System.out.println(max);
    }
}