import java.util.Scanner;

class Main {
    static boolean visited[];
    static int n, m;
    static int path[][];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        path = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            path[a][b] = 1;
            path[b][a] = 1;
        }
        visited = new boolean[n];
        visited[0] = true;
        DPS(0);

        System.out.println(ans);

        sc.close();
    }

    static void DPS(int pos) {
        if (complete()) {
            ans++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && path[pos][i] == 1) {
                visited[i] = true;
                DPS(i);
                visited[i] = false;
            }
        }
    }

    static boolean complete() {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                cnt++;
        }
        return n == cnt;
    }
}
