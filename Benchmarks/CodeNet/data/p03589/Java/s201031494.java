import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    for (int h = 1; h <= 3500; h++) {
      for (int n = 1; n <= 3500; n++) {
        if (4 * h * n - N * n - N * h == 0) {
          continue;
        }
        long w = (N * h * n) / (4 * h * n - N * n - N * h);
        long mod = (N * h * n) % (4 * h * n - N * n - N * h);
        if (1 <= w && w <= 3500 && mod == 0) {
          System.out.println(h + " " + n + " " + w);
          return;
        }
      }
    }
  }
}