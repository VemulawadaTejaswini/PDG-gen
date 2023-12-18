import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.next());
    int[] height = new int[number];
    int[] cost = new int[number];
    for(int i = 0; i < number; i++) {
      cost[i] = Integer.MAX_VALUE;
      height[i] = Integer.parseInt(sc.next());
    }
    cost[0] = 0;
    cost[1] = Math.abs(height[1] - height[0]);
    for(int i = 2; i < number; i++) {
      cost[i] = Math.min(cost[i-2] + Math.abs(height[i] - height[i-2]), cost[i-1] + Math.abs(height[i] - height[i-1]));
    }
    System.out.println(cost[number-1]);
  }
}
