import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int si = scanner.nextInt() - 1;
        int sj = scanner.nextInt() - 1;
        int ei = scanner.nextInt() - 1;
        int ej = scanner.nextInt() - 1;
        char[][] grid = new char[m][n];
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < s.length(); j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(i -> i[2]));
        queue.add(new int[]{si, sj, 0});
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(dp[i], 100000000);
        dp[si][sj] = 0;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            int cost = poll[2];
            if (x == ei && y == ej) {
                System.out.println(cost);
                return;
            }
            for (int[] d : dir) {
                int nx = x + d[0];
                int ny = y + d[1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] != '#' && cost < dp[nx][ny]) {
                    dp[nx][ny] = cost;
                    queue.add(new int[]{nx, ny, cost});
                }
            }
            for (int i = Math.max(0, x - 2); i <= Math.min(x + 2, m - 1); i++) {
                for (int j = Math.max(0, y - 2); j <= Math.min(y + 2, n - 1); j++) {
                    if ((i == x && j == y) || (grid[i][j] == '#') || (dp[i][j] <= cost + 1)) continue;
                    dp[i][j] = cost + 1;
                    queue.add(new int[]{i, j, cost + 1});
                }
            }
        }
        System.out.println(-1);
    }
}
