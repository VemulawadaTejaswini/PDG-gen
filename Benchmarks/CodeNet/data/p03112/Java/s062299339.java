import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int q = sc.nextInt();
    long[] s = new long[a];
    long[] t = new long[b];
    for(int i = 0; i < a; i++) {
      s[i] = sc.nextLong();
    }
    for(int i = 0; i < b; i++) {
      t[i] = sc.nextLong();
    }
    for(int i = 0; i < q; i++) {
      long ans = Long.MAX_VALUE;
      long x = sc.nextLong();
      int left = 0;
      int right = a;
      int a1 = a;
      while(left < right) {
        int med = (left + right) / 2;
        if(s[med] >= x) {
          a1 = med;
          right = med;
        } else {
          left = med + 1;
        }
      }
      left = 0;
      right = b;
      int b1 = b;
      while(left < right) {
        int med = (left + right) / 2;
        if(t[med] >= x) {
          b1 = med;
          right = med;
        } else {
          left = med + 1;
        }
      }
      if(a1 == a) {
        if(b1 == b) {
          ans = Math.min(ans, Math.max(x - s[a - 1], x - t[b - 1]));
        } else {
          if(b1 > 0) ans = Math.min(ans, Math.max(x - s[a - 1], x - t[b1 - 1]));
          ans = Math.min(ans, 2 * (x - s[a - 1]) + t[b1] - x);
          ans = Math.min(ans, 2 * (t[b1] - x) + x - s[a - 1]);
        }
      } else {
        if(b1 == b) {
          if(a1 > 0) ans = Math.min(ans, Math.max(x - s[a1 - 1], x - t[b - 1]));
          ans = Math.min(ans, 2 * (s[a1] - x) + x - t[b - 1]);
          ans = Math.min(ans, 2 * (x - t[b - 1]) + s[a1] - x);          
        } else {
          if((a1 > 0) && (b1 > 0)) ans = Math.min(ans, Math.max(x - s[a1 - 1], x - t[b1 - 1]));
          ans = Math.min(ans, Math.max(s[a1] - x, t[b1] - x));

          if(b1 > 0) ans = Math.min(ans, 2 * (s[a1] - x) + x - t[b1 - 1]);
          if(b1 > 0) ans = Math.min(ans, 2 * (x - t[b1 - 1]) + s[a1] - x);

          if(a1 > 0) ans = Math.min(ans, 2 * (x - s[a1 - 1]) + t[b1] - x);
          if(a1 > 0) ans = Math.min(ans, 2 * (t[b1] - x) + x - s[a1 - 1]);         
        }
      }
      System.out.println(ans);      
    }
  }
}