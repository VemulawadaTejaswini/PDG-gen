import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    new Main().c();

  }

  private void c() {
    try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {

      int n = in.nextInt();
      int x = in.nextInt();

      int eat = 0;
      int from = 0;
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        int an = in.nextInt();
        a[i] = an;
        if (an == 0) {
          eat += solve(x, a, from, i - 1);
          from = i + 1;
        }
      }

      eat += solve(x, a, from, n - 1);
      System.out.println(eat);
    }
  }

  private int solve(int x, int[] a, int from, int to) {
    int n = a.length;

    if (from < 0 || n <= to) {
      return 0;
    }

    int[] aCopy = Arrays.copyOf(a, a.length);

    int eatFw = 0;
    for (int i = 0; i <= n - 2; i++) {
      int diff = a[i] + a[i + 1] - x;
      if (diff > 0) {
        eatFw += diff;

        if (diff <= a[i + 1]) {
          a[i + 1] -= diff;
        } else {
          a[i] -= (diff - a[i + 1]);
          a[i + 1] = 0;
        }
      }
    }

    int eatBw = 0;
    for (int i = n - 1; 0 < i; i--) {
      int diff = aCopy[i] + aCopy[i - 1] - x;
      if (diff > 0) {
        eatBw += diff;

        if (diff <= aCopy[i - 1]) {
          aCopy[i - 1] -= diff;
        } else {
          aCopy[i] -= (diff - aCopy[i - 1]);
          aCopy[i - 1] = 0;
        }
      }
    }

    return Math.min(eatFw, eatBw);
  }
}
