import java.util.*;
import java.util.stream.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long maxw = sc.nextLong();
        long w1 = sc.nextLong();
        long v1 = sc.nextLong();

        if (maxw < w1) {
            System.out.println(0);
            return;
        }

        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 0L);
        map.put(w1, v1);
        for (int i = 1; i < n; i++) {
            long w = sc.nextLong();
            long v = sc.nextLong();

            List<Map.Entry<Long, Long>> list =
                map.entrySet().stream().sorted((o1, o2) -> Long.compare(o1.getKey(), o2.getKey()))
                    .collect(Collectors.toList());
            for (Map.Entry<Long, Long> e : list) {
                long newKey = e.getKey() + w;
                long newValue = e.getValue() + v;
                if (maxw < newKey) {
                    continue;
                }
                map.compute(newKey, (k, ov) -> ov == null ? newValue : Math.max(ov, newValue));
            }
        }

        System.out.println(map.values().stream().max((o1, o2) -> Long.compare(o1, o2)).get());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
