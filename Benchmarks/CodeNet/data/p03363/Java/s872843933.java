
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Long> incrementalList = new ArrayList<>();
        int zeroCounter = 0;

        for (int i = 0; i < n; i++) {
            final long tmp = scanner.nextInt();
            if (tmp == 0) {
                zeroCounter++;
                continue;
            }

            if (incrementalList.isEmpty()) {
                incrementalList.add(tmp);
            } else {
                incrementalList.add(incrementalList.get(incrementalList.size() - 1) + tmp);
            }

        }

        final Map<Long, AtomicInteger> map = new HashMap<>();
        map.put(0L, new AtomicInteger(1));

        for (final long tmp : incrementalList) {
            map.computeIfAbsent(tmp, e -> new AtomicInteger())
                    .incrementAndGet();
        }

        final int answer = map.values().stream()
                .filter(e -> e.get() > 1)
                .map(e -> e.get() * (e.get() - 1) / 2)
                .mapToInt(Integer::intValue)
                .sum() + zeroCounter * (zeroCounter + 1) / 2;

        System.out.println(answer);
    }
}
