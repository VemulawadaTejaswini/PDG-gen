import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[100];
    int[] y = new int[100];
    Long[] h = new Long[100];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      h[i] = sc.nextLong();
    }
    for (int cx = 0; cx <= 100; cx++) {
      for (int cy = 0; cy <= 100; cy++) {
        long h1 = 0;
        for (int i = 0; i < N; i++) {
          if (h[i] > 0) {
            h1 = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
          }
        }
        boolean same = true;
        for (int i = 0; i < N; i++) {
          long h2 = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
          if (h[i] > 0 && h1 != h2) {
            same = false;
          }
        }
        if (same) {
          System.out.println(cx + " " + cy + " " + h1);
          return;
        }
      }
    }
  }
}