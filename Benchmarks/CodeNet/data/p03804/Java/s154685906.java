import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    String[] a = new String[n];
    String b = "";

    for (int i = 0; i < n; i++) {
      a[i] = sc.next();
    }

    for (int i = 0; i < m; i++) {
      b += sc.next();
    }

    for (int i = 0; i < n-m; i++) {
      if (solve(i,a,b,n,m)) {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");

  }

  public static boolean solve (int i, String[] a, String b, int n, int m) {
    String k = "";
    for (int j = 0; j < m; j++) {
      k += a[i+j].substring(i,i+m);
    }

    if (b.equals(k)) {
      return true;
    }

    return false;

  }

}
