import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long[] vehicles = new long[5];
    long n = 0L;
    
    long N = sc.nextLong();
    for (int i = 0; i < vehicles.length; i++) {
      vehicles[i] = sc.nextLong();
      n = Math.max(n, maxtime(N, vehicles[i]));
    }
    System.out.println(n + 4);
  }
  
  //最も使われる乗り物の乗車回数を求める
  public static long maxtime(long x, long y) {
    if ((x % y) == 0) {
      return x / y;
    } else {
      return x / y + 1;
    }
  }
}