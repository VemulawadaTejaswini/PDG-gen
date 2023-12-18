import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] a = new int[m];
    int[] b = new int[m];

    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int[] c = new int[n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (a[j] == i+1 || b[j] == i+1) {
          c[i]++;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.println(c[i]);
    }

  }

}
