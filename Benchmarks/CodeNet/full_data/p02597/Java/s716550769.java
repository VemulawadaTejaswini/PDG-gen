
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rk = 0;
    int wk = 0;
    String s = sc.next();
    for(int i = 0; i < n; i++) {
      if(s.charAt(i) == 'W') {
        wk++;
      } else {
        rk++;
      }
    }
    int[] rui = new int[n];
    if(s.charAt(0) == 'W') rui[0] = 1;
    for(int i = 1; i < n; i++) {
      if(s.charAt(i) == 'W') {
        rui[i] = rui[i - 1] + 1;
      } else {
        rui[i] = rui[i - 1];
      }
    }
    int ans = n;
    for(int k = 0; k <= n; k++) {
      int t = Math.abs(rk - k);
      if(k > 0) {
        if(rk <= k) {
          t += (rui[k - 1] - Math.abs(rk - k));
        } else {
          t += rui[k - 1];
        }
      }
      ans = Math.min(ans, t);
    }
    System.out.println(ans);
  }
}