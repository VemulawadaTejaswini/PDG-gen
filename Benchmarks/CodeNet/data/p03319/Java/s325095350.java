import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int p = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(a == 1) {
        p = i;
        break;
      }
    }
    int ans = 0;
    if(p == 0) {
      for(int i = 0; i < 100000; i++) {
        ans++;
        p += (k - 1);
        if(p >= (n - 1)) break;
      } 
    } else {
      int p1 = p;
      if(p >= (k - 1)) {
        for(int i = 0; i < 100000; i++) {
          ans++;
          p += (k - 1);
          if(p >= (n - 1)) break;
        }
        for(int i = 0; i < 100000; i++) {
          ans++;
          p1 -= (k - 1);
          if(p1 <= 0) break;
        }
      } else {
        ans++;
        p = k;
        if(p == (n - 1)) break;
        for(int i = 0; i < 100000; i++) {
          ans++;
          p += (k - 1);
          if(p >= (n - 1)) break;
        }
      }
    }
    System.out.println(ans);
  }
}