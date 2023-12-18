
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long[] array = new long[n + 1];

        array[0] = 0;
        for (int i = 0; i < n; i++) {
            array[i + 1] = array[i] + scanner.nextInt();
        }

        final Map<Long, AtomicInteger> map = new HashMap<>();

        for (final long value : array) {
            map.computeIfAbsent(value, e -> new AtomicInteger())
                    .incrementAndGet();
        }

        final int answer = map.values().stream()
                .filter(e -> e.get() > 1)
                .map(e -> e.get() * (e.get() - 1) / 2)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(answer);
    }
}
