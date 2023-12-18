import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    for(int k = 0; k < (n - 1); k++) {
      int t = 0;
      int[] a = new int[26];
      int[] b = new int[26];
      for(int i = 0; i <= k; i++) {
        a[s.charAt(i) - 'a']++;
      }
      for(int i = k + 1; i < n; i++) {
        b[s.charAt(i) - 'a']++;
      }
      for(int i = 0; i < 26; i++) {
        if((a[i] > 0) && (b[i] > 0)) t++;
      }
      ans = Math.max(ans, t);
    }
    System.out.println(ans);
  }
}