import java.util.HashMap;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int[] A = new int[N];
    HashMap<Long, Integer> map = new HashMap<>();
    map.put(0L, 1);
    long ans = 0;
    long sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      sum += A[i];
      if (map.containsKey(sum)) {
        ans += map.get(sum);
        map.put(sum, map.get(sum) + 1);
      } else {
        map.put(sum, 1);
      }
    }
    System.out.println(ans);
  }

}
