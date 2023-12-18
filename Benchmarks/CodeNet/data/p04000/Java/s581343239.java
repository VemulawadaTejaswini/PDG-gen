import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a - 2; j <= a; j++) {
                if (j <= 0 || j > h - 2) {
                    continue;
                }
                for (int k = b - 2; k <= b; k++) {
                    if (k <= 0 || k > w - 2) {
                        continue;
                    }
                    map.compute(j + "," + k, (p, v) -> (v == null) ? 1 : v + 1);
                }
            }
        }

        System.out.println(((long) h - 2) * ((long) w - 2) - map.size());
        Map<Integer, Long> countMap =
            map.values().stream().collect(groupingBy(identity(), counting()));
        for (int i = 1; i <= 9; i++) {
            System.out.println(countMap.getOrDefault(i, 0L));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
