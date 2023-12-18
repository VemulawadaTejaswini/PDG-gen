import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final Map<String, Map<Integer, Integer>> v = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            final String s = sc.next();
            final int p = sc.nextInt();
            if (!v.containsKey(s)) {
                v.put(s, new TreeMap<>(Comparator.reverseOrder()));
            }
            v.get(s).put(p, i+1);
        }

        for (final Map.Entry<String, Map<Integer, Integer>> e : v.entrySet()) {
            for (Map.Entry<Integer, Integer> e2 : e.getValue().entrySet()) {
                System.out.println(e2.getValue());
            }
        }
    }
}
