import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Set<Integer> intersection(Set<Integer> a, Set<Integer> b) {
        Set<Integer> response = new HashSet<>();
        for (int x : b) {
            if ( a.contains(x) ) {
                response.add(x);
            }
        }
        return response;
    }

    // a - b
    private static Set<Integer> subtract(Set<Integer> a, Set<Integer> b) {
        Set<Integer> response = new HashSet<>();
        for (int x : a) {
            if ( !b.contains(x) ) {
                response.add(x);
            }
        }
        return response;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            List<Set<Integer>> t = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                t.add(new HashSet<>());

                int M = sc.nextInt();
                for (int j = 0; j < M; j++) {
                    t.get(i).add(sc.nextInt());
                }
            }

            Set<Integer> AandBandC = intersection(t.get(0), intersection(t.get(1), t.get(2)));
            Set<Integer> CsubA = subtract(t.get(2), t.get(0));
            AandBandC.addAll(CsubA);

            System.out.println(AandBandC.size());
        }
    }
}

