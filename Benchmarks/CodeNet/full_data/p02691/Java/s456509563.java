import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    
    long ans = 0;
    for (int i = 0; i < n; i++) {
      int v = input.nextInt();
      ans += map.getOrDefault(i - v, 0);
      map.merge(v + i, 1, Integer::sum);
    }
    
    System.out.println(ans);
  }
}