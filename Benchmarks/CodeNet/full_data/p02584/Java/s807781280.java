import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();
    for (long i = 0; i < k; i++) {
      if (Math.abs(x + d) > Math.abs(x) && Math.abs(x - d) > Math.abs(x)) {
        break;
      }
      if (Math.abs(Math.abs(x) - d) == 0) break;
      x = Math.abs(Math.abs(x) - d);
    }
    System.out.println(x);
  }
}
