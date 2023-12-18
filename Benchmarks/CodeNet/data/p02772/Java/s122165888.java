import java.util.*;

public final class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      int t = in.nextInt();
      if (n % 2 == 0 && !(n % 3 == 0 || n % 5 == 0)) {
        System.out.println("NO");
      }
    }
    System.out.println("YES");
  }
}
