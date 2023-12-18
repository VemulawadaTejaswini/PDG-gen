import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int ans = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      sum += a;
      if((a == 0) || (i == (n - 1))) {
        ans += (sum / 2);
        sum = 0;
      }
    }
    System.out.println(ans);
  }
}