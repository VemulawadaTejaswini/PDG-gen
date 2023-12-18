import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int[] ap = new int[a];
    int[] bp = new int[b];
    int res = Integer.MAX_VALUE;
    int mid = res;
    for(int i = 0; i < a; ++i) {
      ap[i] = sc.nextInt();
      mid = Math.min(mid, ap[i]);
    }
    int now = res;
    for(int i = 0; i < b; ++i) {
      bp[i] = sc.nextInt();
      now = Math.min(now, bp[i]);
    }
    res = mid + now;
    
    for(int i = 0; i < m; ++i) {
      int an = sc.nextInt();
      int bn = sc.nextInt();
      int cp = sc.nextInt();
      res = Math.min(res, ap[an - 1] + bp[bn - 1] - cp);
    }
    System.out.println(res);
  }
}
