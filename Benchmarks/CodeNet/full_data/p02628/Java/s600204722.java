import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] prices = new int[n];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      prices[i] = sc.nextInt();
    }
    Arrays.sort(prices);
    for (int j = 0; j < k; j++) {
      ans += prices[j];
    }
    System.out.println(ans);
  }
}