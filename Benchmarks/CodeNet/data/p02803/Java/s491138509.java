import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[h][w];
        for (int i = 0; i < h; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < w; j++) {
                matrix[i][j] = row.charAt(j);
            }
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] == '.') {
                    max = Math.max(max, bfs(matrix, h, w, i, j));
                }
            }
        }
        System.out.println(max);
    }

    private static int bfs(int[][] matrix, int h, int w, int i, int j) {
        int localMax = 0;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[h][w];
        q.add(new int[] {i, j, 0});
        visited[i][j] = true;

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int[] dir : dirs) {
                int nx = poll[0] + dir[0];
                int ny = poll[1] + dir[1];

                if (nx >= 0 && nx < h && ny >= 0 && ny < w && matrix[nx][ny] == '.' && !visited[nx][ny]) {
                    int nc = poll[2] + 1;
                    visited[nx][ny] = true;
                    localMax = Math.max(localMax, nc);
                    q.add(new int[] {nx, ny, nc});
                }
            }
        }
        return localMax;
    }
}