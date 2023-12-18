package atcoder;

import java.util.*;
import java.util.function.Consumer;

// https://atcoder.jp/contests/dp/tasks/dp_a
public class Main {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scan.nextInt();
            }
            System.out.println(new UsingDP().minCost(h));
        }
    }

    public interface Solution {
        int minCost(int[] heights);
    }

    public static class UsingDP implements Solution {
        public int minCost(int[] heights) {
            if (heights.length < 2) return 0;
            if (heights.length == 2) return Math.abs(heights[1] - heights[0]);
            int[] costs = new int[heights.length];
            Arrays.fill(costs, 1, costs.length, Integer.MAX_VALUE);
            for (int i = 0; i < heights.length; i++) {
                for (int j = i + 1, jl = Math.min(j + 2, heights.length); j < jl; j++) {
                    costs[j] = Math.min(costs[j], costs[i] + Math.abs(heights[j] - heights[i]));
                }
            }
            return costs[costs.length - 1];
        }
    }
}
