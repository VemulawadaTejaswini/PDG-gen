import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();
    if ((X+Y)%3 != 0) {
      System.out.println(0);
      return;
    }
    int a = X - (X+Y)/3, b = Y - (X+Y)/3;
    long out = 1;
    long modv = (long)Math.pow(10, 9) + 7;
    for (int i = a+1; i <= a+b; i++) {
      out *= i;
      out = out % modv;
    }

    long div = 1;
    for (int i = 1; i <= b; i++) {
      div *= i;
      div %= modv;
    }

    long invDiv = inv(div, modv);
    System.out.println(out*invDiv % modv);
  }

  private static long inv(long a, long p) {
    if (a == 1) return 1;
    return (p - p/a) * inv(p % a, p) % p;
  }
}
