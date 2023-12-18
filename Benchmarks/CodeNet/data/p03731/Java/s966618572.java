import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    
    long ans = 0;
    int prev = sc.nextInt();
    for (int i = 1; i < N; i++) {
      int t = sc.nextInt();
      if (t - prev <= T) {
        ans += t-prev;
      } else {
        ans += T;
      }
      prev = t;
    }
    ans += T;
    
    System.out.println(ans);
  }
}