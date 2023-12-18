import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int s = scanner.nextInt();
    Set<Integer> set = new HashSet<>();
    set.add(s);
    for (int i = 2; i <= 1000000; i++) {
      s = f(s);
      if (set.contains(s)) {
        System.out.println(i);
        return;
      }
      set.add(s);
    }
  }

  private static int f(int n) {
    if (n % 2 == 0) return n/2;
    return 3 * n + 1;
  }
}
