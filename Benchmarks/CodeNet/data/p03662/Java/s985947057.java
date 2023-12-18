import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        List<Integer>[] edge = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge[a].add(b);
            edge[b].add(a);
        }

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        int[] dist1 = new int[n];
        boolean[] visited1 = new boolean[n];
        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (int j : edge[i]) {
                if (!visited1[j]) {
                    visited1[j] = true;
                    Utils.println(i, j, deque);
                    dist1[j] = dist1[i] + 1;
                    deque.add(j);
                }
            }
        }

        deque.add(n - 1);
        int[] dist2 = new int[n];
        boolean[] visited2 = new boolean[n];
        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (int j : edge[i]) {
                if (!visited2[j]) {
                    visited2[j] = true;
                    dist2[j] = dist2[i] + 1;
                    deque.add(j);
                }
            }
        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (dist1[i] <= dist2[i]) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1 >= count2 ? "Fennec" : "Snuke");
    }
}