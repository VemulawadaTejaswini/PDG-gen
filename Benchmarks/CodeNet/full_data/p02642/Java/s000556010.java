import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        SortedSet<Integer> sorted = new ConcurrentSkipListSet<>();
        Set<Integer> doubles = new HashSet<>();

        Set<Integer> divisibles = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();

//            Set<Integer> candidates = sorted.headSet(a / 2);
//            for (int b : candidates) {
//                if (a % b == 0) {
//                    divisibles.add(i);
//                    continue;
//                }
//            }
            list.add(a);
            if (sorted.contains(a)) {
                doubles.add(a);
            }
            sorted.add(a);
        }

        for (int i = 1; i <= n; i++) {
            if (divisibles.contains(i)) {
                continue;
            }
            int a = list.get(i);
            if (doubles.contains(a)) {
                divisibles.add(i);
                continue;
            }

            Set<Integer> candidates = sorted.headSet(a / 2);
            for (int b : candidates) {
                if (a % b == 0) {
                    divisibles.add(i);
                    continue;
                }
            }
        }

//        System.out.println(list);
//        System.out.println(availables);

        System.out.println(n - divisibles.size());
    }
}