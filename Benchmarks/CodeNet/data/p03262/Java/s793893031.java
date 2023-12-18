import java.util.*;
import java.io.*;

class Main {
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int X = sc.nextInt();
      int pre = sc.nextInt();
      int min1 = Math.abs(X - pre);
      int min2 = Integer.MAX_VALUE;
      for (int i = 0; i < N-1; i++) {
        int now = sc.nextInt();
        int tmp = Math.abs(X - now);
        if (tmp < min1) {
          min1 = tmp;
        }
        tmp = Math.abs(pre - now);
        if (tmp < min2) {
          min2 = tmp;
        }
        pre = now;
      }
      System.out.println(gcd((long)min1, (long)min2));
    }
  }
}
