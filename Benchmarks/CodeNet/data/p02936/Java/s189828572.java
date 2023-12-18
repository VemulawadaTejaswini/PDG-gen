
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, List<Integer>> map = new HashMap<>();

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int q = scanner.nextInt();

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

        recursive(answers, 0, -1);

        for (final int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private static void recursive(final int[] answers, final int node, final int parent) {
        for (final int relatedNode : map.get(node)) {
            if (relatedNode == parent) {
                continue;
            }
            answers[relatedNode] += answers[node];

            recursive(answers, relatedNode, node);
        }
    }
}
