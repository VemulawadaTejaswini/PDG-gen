import java.util.*;

public class Main {
  static long[] f;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    f = new long[n + 1];
    f[0] = 1;
    for(int i = 1; i <= n; i++) {
      f[i] = 2 * f[i - 1] + 3;
    }
    System.out.println(func(n, x));
  }

  public static long func(int m, long y) {
    if(m == 0) {
      if(y == 0) return 0;
      return 1;
    } else {
      if(y == 0) {
        return 0;
      } else if(y <= (1 + f[m - 1])) {
        return func(m - 1, y - 1);
      } else if(y == (2 + f[m - 1])) {
        return func(m - 1, f[m - 1]) + 1;
      } else if(y < f[m]) {
        return func(m - 1, f[m - 1]) + 1 + func(m - 1, y - 2 - f[m - 1]);
      } else {
        return (2 * func(m - 1, f[m - 1]) + 1); 
      }      
    }
  }
}