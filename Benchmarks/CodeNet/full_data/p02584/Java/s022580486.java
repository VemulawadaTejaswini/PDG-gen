import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long k = sc.nextLong();
    long d = sc.nextLong();
    for (long i = 0; i < k; i++) {
      if (x > 0) {
        x = x - d;
      } else {
        x = x + d;
      }
    }
    System.out.println(Math.abs(x));
  }
}