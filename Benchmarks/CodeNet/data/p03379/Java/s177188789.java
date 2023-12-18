import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int max = 0;
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      if (x[i] > max) max = x[i];
    }
    for (int i = 0; i < n; i++) {
      int[] xx = new int [max + 1];
      for (int ii = 0; ii < n; ii++) {
        if (i != ii) xx[x[ii]] += 1;
      }
      int nn = n / 2;
      for (int ii = 0; ii <= max; ii++) {
        nn -= xx[ii];
        if (0 >= nn) {
          System.out.println(ii);
          break;
        }
      }
    }
  }
}
