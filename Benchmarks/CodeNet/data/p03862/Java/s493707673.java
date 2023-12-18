import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    
    long ans = 0;
    int prev = 0;
    for (int i = 1; i <= N; i++) {
      int a = sc.nextInt();
      int diff = Math.max(prev+a - x, 0);
      ans += diff;
      prev = a - diff;
    }
    
    System.out.println(ans);
  }
}