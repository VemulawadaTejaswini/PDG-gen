import java.util.*;

public class Main {

  private static void solve(int k) {
    Set<Long> set = new HashSet<>();
    long num = 7;
    long cnt = 1;
    while (set.add(num % k)) {
      if (num % k == 0) {
        System.out.println(cnt);
        return;
      }
      num = (num % k) * 10 + 7;
      cnt++;
    }
    System.out.println(-1);
  }

  public static void main(String[] args) {
    int k = scanner.nextInt();
    solve(k);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
