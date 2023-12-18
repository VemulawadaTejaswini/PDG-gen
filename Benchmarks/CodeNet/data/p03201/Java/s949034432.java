import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set2 = new TreeSet<>();
        int base = 1;
        while (base < 1000000000) {
            base *= 2;
            set2.add(base);
        }
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int count = 0;
        while (map.size() > 0) {
            int target = map.lastKey();
            map.put(target, map.get(target) - 1);
            if (map.get(target) == 0) {
                map.remove(target);
            }
            int next = set2.higher(target) - target;
            if (map.containsKey(next)) {
                count++;
                map.put(next, map.get(next) - 1);
                if (map.get(next) == 0) {
                    map.remove(next);
                }
            }
        }
        System.out.println(count);
    }
}
