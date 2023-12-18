import java.util.*;

public class Main {
    static final long INF = 1_000_000_000_000_000L;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        long tree[][] = new long[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(tree[i], INF);
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();
            tree[a - 1][b - 1] = c;
            tree[b - 1][a - 1] = c;
        }

        int q = sc.nextInt();
        int k = sc.nextInt();
        long route[] = dijkstra(k - 1, n, tree);

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(route[x - 1] + route[y - 1]);
        }
    }

    public long[] dijkstra(int start, int n, long map[][]) {
        long mins[] = new long[n];
        boolean fix[] = new boolean[n];
        Arrays.fill(mins, INF);
        mins[start] = 0;

        do {
            fix[start] = true;
            long minc = INF;
            int next = -1;
            for (int i = 0; i < n; i++) {
                if (!fix[i]) {
                    mins[i] = Math.min(mins[i], mins[start] + map[start][i]);
                    if (mins[i] <= minc) {
                        minc = mins[i];
                        next = i;
                    }
                }
            }

            start = next;
        } while (start != -1);

        return mins;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
