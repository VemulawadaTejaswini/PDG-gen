import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      int[] xx = new int[n - 1];
      int ii = 0;
      for (int iii = 0; iii < n; iii++) {
        if (i != iii) {
          xx[ii] = x[iii];
          ii++;
        }
      }
      Arrays.sort(xx);
      System.out.println(xx[n / 2 - 1]);
    }
  }
}
