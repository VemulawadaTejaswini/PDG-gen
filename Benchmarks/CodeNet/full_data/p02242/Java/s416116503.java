import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int n = ni();
        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(cost[i], INF);
            cost[i][i] = 0;
        }
        
        for (int i_n = 0; i_n < n; i_n++) {
            int u = ni();
            int k = ni();
            for (int i_k = 0; i_k < k; i_k++) {
                int v = ni();
                int c = ni();
                cost[u][v] = c;
            }
        }
        
        int[] minCost = calcMinCostWithDijkstrsAlgorithm(cost, 0);
        for (int i = 0; i < n; i++) {
            so.println(i + " " + minCost[i]);
        }
    }

    private static int[] calcMinCostWithDijkstrsAlgorithm(int[][] cost, int start) {
        int len = cost.length;
        int[] minCosts = new int[len];
        Arrays.fill(minCosts, INF);
        minCosts[start] = 0;
        boolean[] fixed = new boolean[len];
        
        while (true) {
            int minCost = INF;
            int minIndex = -1;
            for (int i = 0; i < len; i++) {
                if (!fixed[i] && minCosts[i] < minCost) {
                    minIndex = i;
                    minCost = minCosts[i];
                }
            }
            
            if (minIndex == -1) break;
            fixed[minIndex] = true;
            
            for (int v = 0; v < len; v++) {
                if (!fixed[v] && cost[minIndex][v] != INF) {
                    minCosts[v] = Math.min(minCosts[v], minCosts[minIndex] + cost[minIndex][v]);
                }
            }
        }
        
        return minCosts;
    }

    private static int ni() {
        return sc.nextInt();
    }
}

