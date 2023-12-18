import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long N = in.nextLong();

    int ans = digit(N);
    for (long i = 1; i <= Math.sqrt(N); i++) {
      if (N % i == 0) {
        ans = Math.min(ans, digit(N / i));
      }
    }

    System.out.println(ans);
  }

  public static int digit(long l) {
    return String.format("%d", l).length();
  }
}