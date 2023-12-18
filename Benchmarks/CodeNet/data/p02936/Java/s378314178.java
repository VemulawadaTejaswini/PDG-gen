
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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

        final int[] answers = new int[n];

        for (int i = 0; i < q; i++) {
            final int node = scanner.nextInt() - 1;
            final int operation = scanner.nextInt();
            answers[node] += operation;
        }

        recursive(map, answers, 0);

        for (final int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private static void recursive(final Map<Integer, List<Integer>> map, final int[] answers, final int node) {
        for (final int relatedNode : map.get(node)) {
            map.get(relatedNode).remove(node);
            answers[relatedNode] += answers[node];

            recursive(map, answers, relatedNode);

            /*
            final Set<Integer> relatedRelatedNodes = map.get(relatedNode);
            if (relatedRelatedNodes == null) {
                return;
            }

            relatedRelatedNodes.remove(node);
            if (!relatedRelatedNodes.isEmpty()) {
                recursive(map, answers, relatedNode);
            }

             */
        }
    }
}
