import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int q = sc.nextInt();
    long[] s = new long[a + 1];
    long[] t = new long[b + 1];
    for(int i = 0; i < a; i++) {
      s[i] = sc.nextLong();
    }
    s[a] = Long.MAX_VALUE;
    for(int i = 0; i < b; i++) {
      t[i] = sc.nextLong();
    }
    t[b] = Long.MAX_VALUE;
    for(int i = 0; i < q; i++) {
      long x = sc.nextLong();
      int sx = -1;
      int tx = -1;
      int left = 0;
      int right = a;
      while(left < right) {
        int med = (left + right) / 2;
        if(s[med] <= x) {
          sx = med;
          left = med + 1;
        } else {
          right = med;
        }
      }
      left = 0;
      right = b;
      while(left < right) {
        int med = (left + right) / 2;
        if(t[med] <= x) {
          tx = med;
          left = med + 1;
        } else {
          right = med;
        }        
      }
      long ans = 0;
      if(sx == -1) {
        if(tx == -1) {
          ans = Math.max(s[0] - x, t[0] - x);
        } else {
          ans = Math.min(s[0] - x + s[0] - t[tx], x - t[tx] + s[0] - t[tx]);
          ans = Math.min(ans, Math.max(s[0] - x, t[tx + 1] - x));
        }
      } else {
        if(tx == -1) {
          ans = Math.max(t[0] - x, s[sx + 1] - x);
          ans = Math.min(ans, t[0] - s[sx] + Math.min(t[0] - x, x - s[sx]));
        } else {
          ans = Math.max(x - s[sx], x - t[tx]);
          ans = Math.min(ans, Math.max(s[sx + 1] - x, t[tx + 1] - x));
          ans = Math.min(ans, s[sx + 1] - t[tx] + Math.min(s[sx + 1] - x, x - t[tx]));
          ans = Math.min(ans, t[tx + 1] - s[sx] + Math.min(t[tx + 1] - x, x - s[sx]));
        }        
      }
      System.out.println(ans);
    }
  }
}