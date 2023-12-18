

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static boolean dfs(int n, int u, int c, int[] color, int[][] colorGraph) {
        color[u] = c;
        for (int v = 1; v <= n; ++v) {
            if (u == v || colorGraph[u][v] == 0) {
                continue;
            }
            if (color[v] == 0  && !dfs(n, v, -c, color, colorGraph)) {
                return false;
            }
            if (color[v] == c) {
                return false;
            }
        }
        return true;
    }

    public static void redCounts(
            int n, int [][] colorSet, int i, int sum, Set<Integer> redCount
    ) {
        if (i == n + 1) {
            redCount.add(sum);
            return;
        }
        // this set first one is red
        redCounts(n, colorSet, i + 1, sum + colorSet[i][0], redCount);

        // this set first one is white
        redCounts(n, colorSet, i + 1, sum + colorSet[i][1], redCount);


    }
    public static void main(String [] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int [][] road = new int [n + 1][n + 1];
        for (int i = 0; i < m; ++i) {
            final int u = sc.nextInt();
            final int v = sc.nextInt();
            road[u][v] = 1;
            road[v][u] = 1;
        }

        final int [][] colorGraph = new int[n + 1][n + 1];

        int singleCount = 0;
        for (int u = 1; u <= n; ++u) {
            boolean isSingle = true;
            for (int v = 1; v <= n; ++v) {
                if (u == v) {
                    continue;
                }
                if (road[u][v] != 1) {
                    colorGraph[u][v] = 1;
                    colorGraph[v][u] = 1;
                } else {
                    isSingle = false;
                }
            }
            if (isSingle) {
                singleCount++;
            }
        }

        if (singleCount > 2) {
            System.out.println(-1);
            return;
        } else if (singleCount == 2 && n != 2) {
            System.out.println(-1);
            return;
        }

        //all nodes in colorGraph must be 2 color
        //check whether it's possible
        // color : x red
        // color : -x white
        // color: 0 undefined
        final int[] color = new int[n + 1];
        int colorKind = 1;
        for (int i = 1; i <= n; ++i) {
            if (color[i] == 0) {
                if (!dfs(n, i, colorKind, color, colorGraph)) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        int freeColor = 0;
        //some node is color free
        for (int i = 1; i <= n; ++i) {
            boolean needColor = false;
            for (int v = 1; v <= n; ++v) {
                if (colorGraph[i][v] == 1) {
                    needColor = true;
                    break;
                }
            }
            if (!needColor) {
                color[i] = 0;
                freeColor++;
            }
        }

        int [][] colorSet = new int[n + 1][2];
        for (int i = 1; i <= n; ++i) {
            if (color[i] > 0) {
                colorSet[color[i]][0]++;
            } else if (color[i] < 0) {
                colorSet[-color[i]][1]++;
            }
        }
        final Set<Integer> redCounts = new HashSet<>();

        redCounts(n, colorSet, 1, 0, redCounts);

        int minCount = Integer.MAX_VALUE;

        for (int redColor : redCounts) {
              int whiteColor = n - freeColor - redColor;

              for (int x = 0; x <= freeColor; ++x) {
                  int redCount = (redColor + x) * (redColor + x - 1) / 2;
                  int whiteCount = (whiteColor + freeColor - x) *
                          (whiteColor + freeColor - x - 1) / 2;
                  int count = redCount + whiteCount;
                  if (minCount > count) {
                      minCount = count;
                  }
              }
        };


        System.out.println(minCount);
    }
}
