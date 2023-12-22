
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Long, Long> map = new HashMap<>();

        long sum = 0;
        for (int i = 0 ; i < N ; i++) {
            Long A = scanner.nextLong();
            sum += A;
            if (map.containsKey(A)) {
                map.put(A, map.get(A) + 1);
            } else {
                map.put(A, 1L);
            }
        }

        int Q = scanner.nextInt();
        for (int i = 0 ; i < Q ; i++) {
            long B = scanner.nextLong();
            long C = scanner.nextLong();

            if (map.containsKey(B)) {
                long count = map.get(B);
                sum = sum - B * count + C * count;
                System.out.println(sum);
                map.put(B, 0L);
                if (map.containsKey(C)) {
                    map.put(C, map.get(C) + count);
                } else {
                    map.put(C, count);
                }
            } else {
                System.out.println(sum);
            }
        }
    }
}
