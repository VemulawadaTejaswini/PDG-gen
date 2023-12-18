import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.get(s) == null) map.put(s, (long) 1);
            else {
                long l = map.get(s);
                l++;
            }
        }

        long max = map.entrySet().stream().map(Map.Entry::getValue).max(Comparator.naturalOrder()).get();

        List<String> results = map.entrySet().stream()
                .filter(m -> m.getValue() == max)
                .map(Map.Entry::getKey)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }
}