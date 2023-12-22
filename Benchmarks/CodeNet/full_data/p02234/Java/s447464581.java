import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dimensions = new int[n+1];
        dimensions[0] = in.nextInt();
        for (int i = 1; i < n; i++) {
            dimensions[i] = in.nextInt();
            in.nextInt();
        }
        dimensions[n] = in.nextInt();
        in.close();

        int[][] costs = new int[n][n];

        for (int lenMinusOne = 1; lenMinusOne < n; lenMinusOne++) {
            for (int i = 0; i < n - lenMinusOne; i++) {
                int j = i + lenMinusOne;
                costs[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = costs[i][k] + costs[k+1][j] + dimensions[i]*dimensions[k+1]*dimensions[j+1];
                    if (cost < costs[i][j]) {
                        costs[i][j] = cost;
                    }
                }
            }
        }
        System.out.println(costs[0][costs[0].length-1]);
    }
}
