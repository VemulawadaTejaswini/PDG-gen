import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int jumpCost(int start, int jumpLength, int end, int[] height, int[][] costs) {
        if (costs[start][jumpLength - 1] != Integer.MAX_VALUE) {
            return costs[start][jumpLength - 1];
        }
        if (start + jumpLength == end) {
            costs[start][jumpLength - 1] = Math.abs(height[start + jumpLength] - height[start]);
            return costs[start][jumpLength - 1];
        }
        if (start + jumpLength > end) {
            return Integer.MAX_VALUE;
        } else {
            costs[start][jumpLength - 1] = Math.abs(height[start + jumpLength] - height[start]);
            costs[start + jumpLength][0] = jumpCost(start + jumpLength, 1, end, height, costs);
            costs[start + jumpLength][1] = jumpCost(start + jumpLength, 2, end, height, costs);
            return costs[start][jumpLength - 1]
                    + Math.min(
                    costs[start + jumpLength][0],
                    costs[start + jumpLength][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] costs = new int[n][2];

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            costs[i][0] = Integer.MAX_VALUE;
            costs[i][1] = Integer.MAX_VALUE;
        }

        int totalCost = 0;
        totalCost = Math.min(
                jumpCost(0, 1, n - 1, height, costs),
                jumpCost(0, 2, n - 1, height, costs));
        System.out.println(totalCost);

//        for (int i = 0; i < n; i++) {
//            System.out.printf("%d ", height[i]);
//        }


    }
}
