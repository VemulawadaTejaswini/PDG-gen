import java.util.*;

public class Main {
    int fast[][];
    int ans = Integer.MAX_VALUE;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int rn = sc.nextInt();
        int r[] = new int[rn];
        for (int i = 0; i < rn; i++) {
            r[i] = sc.nextInt();
        }

        int map[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], 20000000);
            map[i][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            map[a - 1][b - 1] = c;
            map[b - 1][a - 1] = c;
        }

        fast = new int[n][n];
        for (int i = 0; i < n; i++) {
            fast[i] = dijkstra(i, n, map);
        }

        int route[] = new int[rn];
        boolean visit[] = new boolean[n];
        foo(0, rn, r, route, visit);

        System.out.println(ans);
    }

    private void foo(int now, int n, int r[], int route[], boolean visit[]) {
        if (now == n) {
            int res = 0;
            for (int i = 0; i < n - 1; i++) {
                res += fast[route[i] - 1][route[i + 1] - 1];
            }
            ans = Math.min(ans, res);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[r[i] - 1]) {
                route[now] = r[i];
                visit[r[i] - 1] = true;
                foo(now + 1, n, r, route, visit);
                visit[r[i] - 1] = false;
            }
        }
    }

    private int[] dijkstra(int start, int n, int map[][]) {
        int mins[] = new int[n];
        boolean fix[] = new boolean[n];
        Arrays.fill(mins, Integer.MAX_VALUE);
        mins[start] = 0;

        do {
            fix[start] = true;
            int minc = Integer.MAX_VALUE;
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
