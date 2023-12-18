import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int R = in.nextInt();

            int[] r = new int[R];
            for (int i = 0; i < R; i++) {
                r[i] = in.nextInt() - 1;
            }

            int[][] distances = new int[N][N];
            for (int i = 0; i < distances.length; i++) {
                Arrays.fill(distances[i], (int) 1e9);
            }
            for (int i = 0; i < M; i++) {
                int A = in.nextInt() - 1;
                int B = in.nextInt() - 1;
                int C = in.nextInt();
                distances[A][B] = C;
                distances[B][A] = C;
            }

            int minDistance = dfs(0, new boolean[N], r, distances, -1);

            System.out.println(minDistance);
        }
    }

    private static int dfs(int index, boolean[] used, int[] r, int[][] distances, int from) {
        {
            boolean isValid = true;
            for (int i = 0; i < r.length; i++) {
                if (!used[r[i]]) {
                    isValid = false;
                }
            }
            if (isValid) {
                return 0;
            }
        }

        int min = (int) 1e9;
        for (int i = 0; i < used.length; i++) {
            int to = i;
            if (used[to]) {
                continue;
            }

            used[to] = true;
            int distance = (from == -1 ? 0 : distances[from][to]) + dfs(index + 1, used, r, distances, to);
            if (distance < min) {
                min = distance;
            }
            used[to] = !true;
        }

        return min;
    }
}
