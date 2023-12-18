import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String L = sc.next();
    int[] p = new int[100002];
    if(L.charAt(0) == '1') p[0] = 1;
    for(int i = 1; i < L.length(); i++) {
      if(L.charAt(i) == '1') {
        p[i] = p[i - 1] + 1;
      } else {
        p[i] = p[i - 1];
      }
    }
    int n = L.length();
    long MOD = (long)Math.pow(10, 9) + 7;
    long a = 1;
    for(int i = 0; i < n - 1; i++) {
      a = (3 * a) % MOD;
    }
    long b = 1;
    long c = 1;
    if(n >= 2) {
      for(int i = 0; i < p[n - 2]; i++) {
        b = (2 * b) % MOD;
      }
    } else {
   //    b = 0;
    }
    if(n >= 3) {
      for(int i = 0; i < p[n - 3]; i++) {
        c = (2 * c) % MOD;
      }
    } else {
  //    c = 0;
    }
    long ans = 0;
    ans = (a + b) % MOD;
    ans = (ans + c) % MOD;
    System.out.println(ans);
  }
}