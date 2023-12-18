import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long N = sc.nextLong();
    long A = sc.nextLong();
    long ans = N;
    for (int i = 1; i < 63; i++) {
      long width = (long) Math.ceil(Math.pow(N, 1.0 / (i + 1)));
      long time = 0;
      long cur = 1;
      for (int j = 0; j < i; j++) {
        time += width + A;
        cur *= width;
      }
      for (int j = 0; j < i; j++) {
        long t = time + (N + cur - 1) / cur - j;
//        System.out.println(i + " " + width + " " + t);
        ans = Math.min(ans, t);
        cur = cur / width * (width - 1);
      }
      if (width == 1) break;
    }
    System.out.println(ans);
  }
}
