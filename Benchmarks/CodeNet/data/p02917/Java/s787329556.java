import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n - 1];
    for(int i = 0; i < n - 1; i++) {
      b[i] = sc.nextInt();
    }
    int ans = b[0] + b[n - 2];
    for(int i = 0; i < n - 2; i++) {
      ans += Math.min(b[i], b[i + 1]);
    }
    System.out.println(ans);
  }
}