

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] graph = new int[n + 1][n + 1];
        int edges = 0;
        solve(1, n, graph);
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                if (graph[i][j] == 1) {
                    edges++;
                }
            }
        }
        System.out.println(edges);
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                if (graph[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void solve (int n1, int n2, int[][] graph) {
        if (n2 < n1) {
            return;
        }
        if ((n2 - n1 + 1) % 2 == 1) {
            for (int i = n1; i < n2; ++i) {
                graph[n2][i] = 1;
                graph[i][n2] = 1;
                solve(n1, n2 - 1, graph);
            }
        } else {
            for (int i = n1 + 1; i < n2; ++i) {
                graph[i][n1] = 1;
                graph[n1][i] = 1;
                graph[i][n2] = 1;
                graph[n2][i] = 1;
            }
            solve(n1 + 1, n2 - 1, graph);
        }
    }
}
