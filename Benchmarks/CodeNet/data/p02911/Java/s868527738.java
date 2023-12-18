import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int q = sc.nextInt();
    if (q < k) {
      for (int i = 0; i < n; i++) {
        System.out.println("Yes");
      }
      return;
    }
    Map<Integer, Integer> collectMap = new HashMap<>();
    for (int i = 0; i < q; i++) {
      int a = sc.nextInt();
      Integer collect = collectMap.computeIfAbsent(a, hoge -> 0);
      collectMap.put(a, collect + 1);
    }
    for (int i = 0; i < n; i++) {
      Integer integer = collectMap.get(i + 1);
      if (integer == null || k <= q - integer) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }
  }
}
