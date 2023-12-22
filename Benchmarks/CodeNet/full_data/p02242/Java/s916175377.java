import java.util.Scanner;

public class Main {
    static int WHITE = 0;
    static int GRAY = 1;
    static int BLACK = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] G = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                G[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            int u = input.nextInt();
            int k = input.nextInt();
            for (int j = 0; j < k; j++) {
                int v = input.nextInt();
                int c = input.nextInt();
                G[u][v] = c;
            }
        }

        int[] p = new int[n];
        int[] d = new int[n];
        int[] color = new int[n];

        // 初始化
        for (int i = 0; i < n; i++) {
            d[i] = Integer.MAX_VALUE;
            p[i] = -1;
            color[i] = WHITE;
        }
        d[0] = 0;
        color[0] = GRAY;
        while (true) {
            int minCost = Integer.MAX_VALUE;
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (color[j] != BLACK && d[j] < minCost) {
                    minCost = d[j];
                    u = j;
                }
            }
            if (u == -1) {
                break;
            }
            color[u] = BLACK;

            for (int v = 0; v < n; v++) {
                if (color[v] != BLACK && G[u][v] != -1) {
                    if (d[u] + G[u][v] < d[v]) {
                        d[v] = d[u] + G[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(i + " " + d[i]);
        }
    }
}
