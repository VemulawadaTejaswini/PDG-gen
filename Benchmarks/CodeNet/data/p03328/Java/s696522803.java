
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(sovle(a, b));
  }

  private static long sovle(int a, int b) {
    Set<Integer> set = new HashSet<>();
    int res = 0;
    int count = 0;
    for (int i = 1; i <= 999; i++) {
      res += i;
      set.add(res);
    }
    for (; true; count++) {
      if (set.contains(a + count) && set.contains(b + count)) {
        return count > 0 ? count : 1;
      }
    }
  }

}