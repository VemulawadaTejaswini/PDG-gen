import java.util.*;

class Cookie {
  long[] c = new long[2];
  public Cookie(long a, long b) {
    c[0] = a;
    c[1] = b;
  }

  public void eat() {
    if (c[0] % 2 == 1) c[0]--;
    c[0] /= 2;
    c[1] += c[0];
  }

  public void swap() {
    c[0] ^= c[1];
    c[1] ^= c[0];
    c[0] ^= c[1];
  }

  public long getA() {
    return c[0];
  }

  public long getB() {
    return c[1];
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      long a = sc.nextLong();
      long b = sc.nextLong();
      Cookie c = new Cookie(a, b);
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        c.eat();
        c.swap();
      }
      if (n % 2 == 1) c.swap();
      System.out.printf("%d %d\n", c.getA(), c.getB());
    } finally {
      sc.close();
    }
  }
}
