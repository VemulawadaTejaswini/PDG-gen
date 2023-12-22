import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      if (n == 0 && x == 0) {
        break;
      } else {
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++) {
            if (x - j - i > j && x - j - i <= n) {
              count++;
            }
          }
        }
        System.out.println(count);
      }
    }
    sc.close();
  }
}
