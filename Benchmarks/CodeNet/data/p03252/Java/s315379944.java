import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int n = s.length();

        Map<Character, Set<Integer>> sMap = new HashMap<>();
        Map<Character, Set<Integer>> tMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int finalI = i;

            char sc = s.charAt(i);
            sMap.putIfAbsent(sc, new HashSet<>());
            sMap.compute(sc, (k, v) -> {
                v.add(finalI);
                return v;
            });

            char tc = t.charAt(i);
            tMap.putIfAbsent(tc, new HashSet<>());
            tMap.compute(tc, (k, v) -> {
                v.add(finalI);
                return v;
            });
        }

        Collection<Set<Integer>> sIndexes = sMap.values();
        Collection<Set<Integer>> tIndexes = tMap.values();

        if (sIndexes.size() != tIndexes.size()) {
            System.out.println("No");
            return;
        }

        for (Set<Integer> sIndex : sIndexes) {
            boolean ok = false;
            for (Set<Integer> tIndex : tIndexes) {
                if (sIndex.equals(tIndex)) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
