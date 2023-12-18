import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] sum = new long[n];
    sum[0] = sc.nextLong();
    for(int i = 1; i < n; i++) {
      sum[i] = sum[i - 1] + sc.nextLong();
    }
    long xm = 0;
    for(int i = 0; i < 41; i++) {
      long t = xm + (long)Math.pow(2, i);
      int p = 0;
      for(int j = 0; j < n; j++) {
        for(int l = j; l < n; l++) {
          long y = 0;
          if(j == 0) {
            y = sum[l];
          } else {
            y = sum[l] - sum[j - 1];
          }
          if((t & y) == t) p++;
        }
      }
      if(p >= k) xm = t;
    }
    System.out.println(xm);
  }
}