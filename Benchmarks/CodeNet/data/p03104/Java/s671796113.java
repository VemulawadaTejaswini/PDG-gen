import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = func(b);
    if(a > 0) ans = func(b) ^ func(a - 1);
    System.out.println(ans);
  }

  public static long func(long x) {
    if(x == 0) return 0;
    if(x == 1) return 1;
    long t = x;
    long p = 0;
    for(int i = 0; i < 100; i++) {
      t /= 2;
      if(t == 0) {
        p = i;
        break;
      }
    }
    long x1 = x - (long)Math.pow(2, p);
    long x2 = func(x1);
    if((x1 % 2) == 0) x2 += (long)Math.pow(2, p);
    if(p == 1) x2 = (x2 ^ 1);
    return x2;
  }
}