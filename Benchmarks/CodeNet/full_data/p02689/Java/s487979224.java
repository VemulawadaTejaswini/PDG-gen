import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] height = new int[n];
    for (int i = 0; i < n; i++) {
      height[i] = sc.nextInt();
    }
    boolean[] isBadSpot = new boolean[n];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (height[a-1] < height[b-1]) {
        isBadSpot[a-1] = true;
      } else if (height[a-1] > height[b-1]) {
        isBadSpot[b-1] = true;
      } else {
        isBadSpot[a-1] = true;
        isBadSpot[b-1] = true;
      }
    }
    int ans = 0;
    for (boolean spot: isBadSpot) {
      if (!(spot)) ans++;
    }
    System.out.println(ans);
  }
}
