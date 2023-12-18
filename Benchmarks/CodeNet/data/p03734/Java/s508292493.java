import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int maxw = sc.nextInt();
        int w1 = sc.nextInt();
        int v1 = sc.nextInt();

        if (maxw < w1) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(w1, v1);
        for (int i = 1; i < n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();

            Set<Map.Entry<Integer, Integer>> set = new HashSet<>(map.entrySet());
            for (Map.Entry<Integer, Integer> e : set) {
                int newKey = e.getKey() + w;
                int newValue = e.getValue() + v;
                if (maxw < newKey) {
                    continue;
                }
                map.compute(newKey, (k, ov) -> ov == null ? newValue : Math.max(ov, newValue));
            }
        }

        System.out.println(map.values().stream().max((o1, o2) -> o1 - o2).get());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
