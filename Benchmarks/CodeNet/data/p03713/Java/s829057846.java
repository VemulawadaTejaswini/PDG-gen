import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();
    
    long ans = Long.MAX_VALUE;
    ans = Math.min(ans, solve1(H, W));
    ans = Math.min(ans, solve1(W, H));
    ans = Math.min(ans, solve2(H, W));
    ans = Math.min(ans, solve2(W, H));
    
    System.out.println(ans);
  }
  
  private static long solve2(int x, int y) {
    return x%3 != 0 ? y : 0;
  }
    
  private static long solve1(int x, int y) {
    
    long ret = Long.MAX_VALUE;
    for (int i = 1; i <= x-1; i++) {
      long b = y * i; // 10 5*2
      long a = (x-i) * (y/2); // 6 3*2
      long c = (x-i) * ((y+1)/2); // 9 3*3
      long max = Math.max(Math.max(a,b),c);
      long min = Math.min(Math.min(a,b),c);
      long diff = Math.abs(max-min);
      ret = Math.min(ret, diff);
    }

    return ret;
  }
}