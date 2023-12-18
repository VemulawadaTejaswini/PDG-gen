import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int h = 1; h <= 3500; h++) {
      for (int n = 1; n <= 3500; n++) {
        if (4 * h * n - N * n - N * h != 0) {
          int w = (N * h * n) / (4 * h * n - N * n - N * h);
          int mod = (N * h * n) % (4 * h * n - N * n - N * h);
          if (mod == 0 && 0 < w) {
            System.out.println(h + " " + n + " " + w);
            return;
          }
        }
      }
    }
  }
}