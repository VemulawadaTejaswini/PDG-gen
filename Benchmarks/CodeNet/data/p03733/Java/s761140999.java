import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      long N = scanner.nextLong();
      long T = scanner.nextLong();
      long pre = -10000000000L;
      long ans = 0;
      for (int i = 0; i < N; i++) {
        long now = scanner.nextLong();
        long t = now - pre;
        if (T < t) {
          ans += T;
        } else {
          ans += t;
        }
        pre = now;
      }
      System.out.println(ans);
    }
    finally {
      scanner.close();
    }
  }
}