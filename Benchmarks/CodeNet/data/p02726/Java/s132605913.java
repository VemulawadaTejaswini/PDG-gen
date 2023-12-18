import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] ans = new int[n];
    for(int i = 1; i < n; i++) {
      for(int j = i + 1; j <= n; j++) {
        int t = j - i;
        t = Math.min(t, Math.abs(i - x) + 1 + Math.abs(y - j));
        t = Math.min(t, Math.abs(i - y) + 1 + Math.abs(x - j));
        ans[t]++;
      }
    }

    for(int i = 1; i < n; i++) {
      System.out.println(ans[i]);
    }
  }
}