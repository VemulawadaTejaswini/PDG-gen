
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int q = scanner.nextInt();

        final Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt() - 1;
            final int b = scanner.nextInt() - 1;

            map.computeIfAbsent(a, e -> new ArrayList<>())
                    .add(b);

            map.computeIfAbsent(b, e -> new ArrayList<>())
                    .add(a);
        }

        final long[] answers = new long[n];

        for (int i = 0; i < q; i++) {
            final int node = scanner.nextInt() - 1;
            final int operation = scanner.nextInt();
            answers[node] += operation;
        }

        recursive(map, answers, 0, -1);

        for (final long answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private static void recursive(final Map<Integer, List<Integer>> map, final long[] answers, final int parent, final int grandParent) {
        for (final int child : map.get(parent)) {
            if (child == grandParent) {
                continue;
            }

            answers[child] += answers[parent];

            if (map.get(child) != null || map.get(child).size() != 1) {
                recursive(map, answers, child, parent);
            }
        }
    }
}
