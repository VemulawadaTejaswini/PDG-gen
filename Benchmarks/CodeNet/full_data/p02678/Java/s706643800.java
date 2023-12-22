import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}


class Solver {

    private void dfs(boolean[] path, int[][] mat, boolean[] visited, int cur, int start) {
        if (cur == 1) {
            path[start] = true;
            return;
        }
        if (visited[cur] == true) {
            // loop detected.
            return;
        }

        visited[cur] = true;
        // shortcut
        if (path[cur] == true) {
            path[start] = true;
            return;
        }
        for (int i = 0; i < mat[cur].length; i++) {
            if (mat[cur][i] == 0) continue;

            boolean[] v2 = Arrays.copyOf(visited, visited.length);
            dfs(path, mat, v2, i, start);
            if (path[start]) break;
        }

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];

        int mat[][] = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();

            int src = A[i] <= B[i] ? A[i] : B[i];
            int dst = A[i] >  B[i] ? A[i] : B[i];
            mat[src][dst] = 1;
            mat[dst][src] = 1;
        }

        boolean[] path = new boolean[N+1];
        path[0] = true;
        path[1] = true;
        for (int i = 2; i <= N; i++) {
            int start = i;
            boolean[] visited = new boolean[N+1];
            dfs(path, mat, visited, i, start);
        }

        for (int i = 2; i <= N; i++) {
            if (!path[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

        return;
    }

}