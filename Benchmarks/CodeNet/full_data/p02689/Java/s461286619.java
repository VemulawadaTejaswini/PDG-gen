import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            s.nextLine();
            int[] h = Arrays.stream(s.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            var way = new HashMap<Integer, Set<Integer>>();
            for (int i = 0; i < m; i++){
                int a = s.nextInt() - 1, b = s.nextInt() - 1;
                way.computeIfAbsent(a, k -> new HashSet<>()).add(b);
                way.computeIfAbsent(b, k -> new HashSet<>()).add(a);
            }
            long good = (n - way.size()) + way.entrySet().stream()
                .filter(e -> e.getValue().stream().allMatch(v -> h[e.getKey()] > h[v]))
                .count();
            System.out.println(good);
        }
    }
}