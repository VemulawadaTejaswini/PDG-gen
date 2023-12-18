import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() / 2;
        List<Integer> u1 = new ArrayList<>(), u2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            u1.add(scanner.nextInt());
            u2.add(scanner.nextInt());
        }

        int e, f;

        Map<Integer, Long> a = u1.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, b2) -> null, LinkedHashMap::new));
        Map<Integer, Long> b = u2.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, b2) -> null, LinkedHashMap::new));

        List<Integer> c = new ArrayList<>(a.keySet());
        List<Integer> d = new ArrayList<>(b.keySet());

        if (c.get(0).equals(d.get(0))) {
            if (c.size() == 1 || d.size() == 1) {
                System.out.println(n);
                return;
            } else {
                if (a.get(c.get(1)) + b.get(d.get(0)) < a.get(c.get(0)) + b.get(d.get(1))) {
                    e = c.get(1);
                    f = d.get(0);
                } else {
                    e = c.get(0);
                    f = d.get(1);
                }
            }
        } else {
            e = c.get(0);
            f = d.get(0);
        }
        u1.removeIf(Predicate.isEqual(e));
        u2.removeIf(Predicate.isEqual(f));
        System.out.println(u1.size() + u2.size());
    }
}