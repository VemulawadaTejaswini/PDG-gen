import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long[] w = new long[n];
    long[] d = new long[n];
    for(int i = 0; i < n; i++) {
      w[i] = sc.nextLong();
      d[i] = sc.nextLong();
    }
    long ans = Long.MAX_VALUE;
    long left = 0;
    long right = Long.MAX_VALUE;
    while(left < right) {
      long med = (left + right) / 2;
      long t = 0;
      for(int i = 0; i < n; i++) {
        if(w[i] <= med) {
          t += ((med - w[i]) / d[i] + 1);
        }
      }
      if(t >= k) {
        ans = med;
        right = med;
      } else {
        left = med + 1;
      }
    }
    System.out.println(ans);
  }
}