import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    long a1 = solve(true, a);
    long a2 = solve(false, a);
    
    System.out.println(Math.min(a1, a2));
  }
  
  private static long solve(boolean evenPlus, int[] a) {
    
    long ans = 0;
    long sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      if (((evenPlus && i%2 == 0)
          || (!evenPlus && i%2 == 1))
          && sum <= 0) {
        long diff = 1 - sum;
        sum += diff;
        ans += diff;
      } else if (((evenPlus && i%2 == 1)
                  || (!evenPlus && i%2 == 0))
                  && sum >= 0) {
        long diff = sum + 1;
        sum -= diff;
        ans += diff;
      }
    }
    return ans;
  }
}