
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int cnt = 0;

    for (int i = 0; i <= A; i++) {
      for (int j = 0; j <= B; j++) {
        for (int k = 0; k <= C; k++) {
          int total = 500 * i + 100 * j + 50 * k;
          cnt = (X == total) ? cnt + 1 : cnt;
        }
      }
    }
    System.out.println(cnt);
  }
}
