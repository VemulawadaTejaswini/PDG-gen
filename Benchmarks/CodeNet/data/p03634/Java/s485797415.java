import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] c = new int[n - 1];
        int[][] dist = new int[n][n];
        List<Integer>[] connect = IntStream.range(0, n).mapToObj(i -> new ArrayList<>()).toArray(ArrayList[]::new);
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextInt() - 1;
            b[i] = scanner.nextInt() - 1;
            c[i] = scanner.nextInt();
            connect[a[i]].add(b[i]);
            connect[b[i]].add(a[i]);
            dist[a[i]][b[i]] = c[i];
            dist[b[i]][a[i]] = c[i];
        }

        int q = scanner.nextInt();
        int k = scanner.nextInt() - 1;

        long[] dist2 = new long[n];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(k);

        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (int j : connect[i]) {
                if (dist2[j] == 0) {
                    dist2[j] = dist2[i] + dist[i][j];
                    deque.add(j);
                }
            }
        }

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            System.out.println(dist2[x] + dist2[y]);
        }
    }
}