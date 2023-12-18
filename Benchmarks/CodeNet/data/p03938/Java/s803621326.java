import java.util.*;
import java.math.*;

public class Main {
  private static final int BASE = 30000;
  private static final int MAX_N = 20000;

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = s.nextInt();
    }
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = BASE * i + p[i];
      b[i] = BASE * (n - i);
    }

    System.out.print(a[0]);
    for (int i = 1; i < n; i++) {
      System.out.print(" ");
      System.out.print(a[i]);
    }
    System.out.println();

    System.out.print(b[0]);
    for (int i = 1; i < n; i++) {
      System.out.print(" ");
      System.out.print(b[i]);
    }
    System.out.println();
  }
}
