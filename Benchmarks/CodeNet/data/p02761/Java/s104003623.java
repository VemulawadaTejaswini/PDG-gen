import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int p = 0;
    for(int i = 0; i < n; i++) {
      a[i] = 10;
    }
    for(int i = 0; i < m; i++) {
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(a[s - 1] == 10) {
        a[s - 1] = c;
      } else {
        if(a[s - 1] == c) {
        } else {
          p++;
        }
      }
    }
    int ans = -1;
    if(p == 0) {
      ans = 0;
      for(int i = 0; i < n; i++) {
        int j = (int)Math.pow(10, n - 1 - i);
        int d = a[i];
        if(a[i] == 10) {
          if(i == 0) {
            d = 1;
          } else {
            d = 0;
          }
        }
        ans += (d * j);
      }
    }
    if(a[0] == 0) {
      if(n == 1) {
        ans = 0;
      } else {
        ans = -1;
      }
    }
    System.out.println(ans);
  }
}