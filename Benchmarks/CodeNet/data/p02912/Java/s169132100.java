import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);

            array = reader.readLine().split(" ");
            PriorityQueue<Long> queue = new PriorityQueue<Long>(new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    return o2.compareTo(o1);
                }
            });
            for (int i = 0; i < N; i++) {
                queue.add(Long.valueOf(array[i]));
            }

            for (int i = 0; i < M; i++) {
                Long value = queue.poll();
                queue.add(value / 2);
            }

            long sum = 0;
            for (Long value : queue) {
                sum += value;
            }

            System.out.println(sum);
        }
    }

}
