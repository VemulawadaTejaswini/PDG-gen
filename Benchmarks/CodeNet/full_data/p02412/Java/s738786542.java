import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x, sum;
    int num = 0;

    while(true) {
      n = sc.nextInt();
      x = sc.nextInt();

      if (n == 0 && x == 0) break;

      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          if (i == j) continue;
          for (int k = 1; k <= n; k++) {
            if (i == k || j == k) continue;
            sum = i + j + k;
            if (sum == x) num++;
          }
        }
      }
      num /= 3 * 2 * 1;
      System.out.println(num);
    }
  }
}