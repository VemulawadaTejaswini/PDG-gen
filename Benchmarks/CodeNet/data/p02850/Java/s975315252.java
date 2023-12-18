
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Map<Integer, Set<NodeIndex>> map = new HashMap<>();

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] array = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            map.computeIfAbsent(a, set -> new HashSet<>())
                    .add(new NodeIndex(b, i));
            map.computeIfAbsent(b, set -> new HashSet<>())
                    .add(new NodeIndex(a, i));
            array[a]++;
            array[b]++;
        }

        int maxValue = 0;
        int index = -1;
        for (int i = 0; i <= n; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                index = i;
            }
        }

        final Set<Integer> set = IntStream.rangeClosed(1, maxValue)
                .boxed()
                .collect(Collectors.toSet());

        final int[] answer = new int[n - 1];
        recursive(set, index, -1, answer, -1);
        System.out.println(maxValue);
        for (final int i : answer) {
            System.out.println(i);
        }
    }

    private static void recursive(final Set<Integer> set, final int now, final int parent, final int[] answer, final int hen) {
        final Set<NodeIndex> nodeIndices = map.get(now);
        final List<Integer> list = set.stream()
                .filter(h -> h != hen)
                .collect(Collectors.toList());
        int index = 0;
        for (final NodeIndex nodeIndex : nodeIndices) {
            if (nodeIndex.node == parent) {
                continue;
            }

            final Integer value = list.get(index);
            answer[nodeIndex.index] = value;
            recursive(set, nodeIndex.node, now, answer, value);
            index++;
        }
    }

    static class NodeIndex {
        final int node;
        final int index;

        NodeIndex(final int node, final int index) {
            this.node = node;
            this.index = index;
        }
    }
}
