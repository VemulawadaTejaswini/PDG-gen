import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int ans = 1000;
    int tic = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < (n - 1); i++) {
      if (a[i] < a[i + 1]) {
        while (ans >= a[i]) {
          tic++;
          ans -= a[i];
        }
      } else if (a[i] > a[i + 1]) {
        ans += tic * a[i];
        tic = 0;
      }
    }

    ans += tic * a[n - 1];

    System.out.println(Math.max(ans, 1000));

  }
}