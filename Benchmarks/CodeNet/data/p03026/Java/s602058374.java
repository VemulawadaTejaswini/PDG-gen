import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            tree.computeIfAbsent(a, key -> new HashSet<>()).add(b);
            tree.computeIfAbsent(b, key -> new HashSet<>()).add(a);
        }

        int[] c = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
            sum += c[i];
        }
        Arrays.sort(c);

        System.out.println(sum - c[n - 1]);

        int[] a = new int[n];
        boolean[] visited = new boolean[n];

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        int index = n - 2;
        visited[0] = true;
        a[0] = c[n - 1];
        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (int j : tree.get(i)) {
                if (!visited[j]) {
                    a[j] = c[index--];
                    visited[j] = true;
                    deque.add(j);
                }
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}