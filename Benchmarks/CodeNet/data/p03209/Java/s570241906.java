import java.util.*;

public class Main {
  public static long[] p;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    p = new long[n + 1];
    p[0] = 1;
    for(int i = 1; i <= n; i++) {
      p[i] = 2 * p[i - 1] + 3;
    }
    System.out.println(func(n, x));
  }

  public static long func(int s, long t) {
    if(s == 0) return 1;
    if(t == 1) {
      return 0;
    } else if(t <= (1 + p[s - 1])) {
      return func(s - 1, t - 1);
    } else if(t == (2 + p[s - 1])) {
      return (1 + func(s - 1, p[s - 1]));
    } else if(t < (3 + (2 * p[s - 1]))) {
      return (1 + func(s - 1, p[s - 1]) + func(s - 1, t - (2 + p[s - 1])));   
    } else {
      return (2 * func(s - 1, p[s - 1]) + 1);  
    }
  }
}
