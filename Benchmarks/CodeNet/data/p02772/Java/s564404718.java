import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; ++i) {
      a[i] = Integer.parseInt(sc.next());
    }
    sc.close();

    int cnt = 0;
    for (int i = 0; i < n; ++i) {
      if (a[i] % 2 == 0) {
        if (a[i] % 3 != 0 || a[i] % 5 != 0 ) {
          ++cnt;
        }
      }
    }
    if (cnt > 0) {
      System.out.println("DENIED");
    } else {
      System.out.println("APPROVED");
    }
  }
}