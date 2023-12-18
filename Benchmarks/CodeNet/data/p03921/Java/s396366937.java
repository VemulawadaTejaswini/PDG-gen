import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer>[] set1 = new HashSet[m];
        Set<Integer>[] set2 = new HashSet[n];

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                int l = scanner.nextInt() - 1;
                (set2[i] == null ? set2[i] = new HashSet<>() : set2[i]).add(l);
                (set1[l] == null ? set1[l] = new HashSet<>() : set1[l]).add(i);
            }
        }

        boolean[] visited = new boolean[n];
        boolean[] visitedLanguage = new boolean[m];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        visited[0] = true;
        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (int j : set2[i]) {
                if (!visitedLanguage[j]) {
                    visitedLanguage[j] = true;
                    for (int k : set1[j]) {
                        if (!visited[k]) {
                            deque.add(k);
                            visited[k] = true;
                        }
                    }
                }
            }
        }

        for (boolean b : visited) {
            if (!b) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}