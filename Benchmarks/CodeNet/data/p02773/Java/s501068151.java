import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxCount = 0;
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Integer c = m.get(s);
            Integer newCount = c == null ? 1 : c + 1;
            if (maxCount < newCount) maxCount = newCount;
            m.put(s, newCount);
        }


        final int mc = maxCount;
        m.entrySet().stream()
                .filter(x -> x.getValue() == mc)
                .sorted(Map.Entry.comparingByKey())
                .forEach(x -> System.out.println(x.getKey()));

    }
}