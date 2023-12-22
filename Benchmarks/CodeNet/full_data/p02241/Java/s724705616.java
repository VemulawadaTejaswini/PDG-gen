import java.util.Scanner;

public class Main {
    private static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] adj = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(getMinimumWeight(adj));
    }

    static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (!mstSet[i] && key[i] < min) {
                min = key[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int getMinimumWeight(int[][] adj) {
        int[] cost = new int[n];
        boolean[] mstSet = new boolean[n];
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        cost[0] = 0;
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            int minKey = minKey(cost, mstSet);
            mstSet[minKey] = true;
            for (int j = 0; j < n; j++) {
                if (adj[minKey][j] != -1 && !mstSet[j] && adj[minKey][j] < cost[j]) {
                    cost[j] = adj[minKey][j];
                }
            }
            totalCost += cost[minKey];
        }
        return totalCost;
    }
}

