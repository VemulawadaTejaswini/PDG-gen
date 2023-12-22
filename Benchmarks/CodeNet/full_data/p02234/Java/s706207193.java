
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cost = new int[n+1][n+1];
        int[] rc = new int[n+1];
        
        // Miの行 = rc[i-1], 列 = rc[i]
        for (int i = 0; i < n; i++) {
            rc[i]   = sc.nextInt();
            rc[i+1] = sc.nextInt();
        }
        
        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                cost[i][j] = (1 << 21);
                for (int k = i; k <= j - 1; k++) {
                    cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k + 1][j] + rc[i-1] * rc[k] * rc[j]);
                }
            }
        }
        System.out.println(cost[1][n]);
    }
}

