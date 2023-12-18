import java.util.*;

public class Main {
    static int ret = 0;
    static boolean[] arrived;
    static int N;
    static boolean[][] matrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        arrived = new boolean[N];

        matrix = new boolean[N][N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            matrix[a][b] = true;
            matrix[b][a] = true;
        }

        arrived[0] = true;
        dfs(0);

        System.out.println(ret);
    }

    public static void dfs(int node) {
        if (allNodeArrived()) {
            ret++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (matrix[node][i] && !arrived[i]) {
                arrived[i] = true;
                dfs(i);
                arrived[i] = false;
            }
        }

        return;
    }

    public static boolean allNodeArrived() {
        for (int i = 0; i < N; i++) {
            if (!arrived[i]) return false;
        }

        return true;
    }
}