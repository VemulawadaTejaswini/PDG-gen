import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i < 6) {
        System.out.println(0);
      } else {
        System.out.println(calc(i));
      }
    }
  }

  private static int calc(int n) {
    int ret = 0;
    for (int i = 1; i <= 105; i++) {
      for (int j = 1; j <= 105; j++) {
        for (int k = 1; k <= 105; k++) {
          int multiply = i * (i + j + k) + j * (j + k) + k * k;
          if (multiply == n) {
            ret++;
          }
        }
      }
    }
    return ret;
  }
}
