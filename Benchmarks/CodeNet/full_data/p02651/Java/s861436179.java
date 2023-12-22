import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0; i < t; i++) {
      int n = sc.nextInt();
      long[] a = new long[n];
      for(int j = 0; j < n; j++) {
        a[j] = sc.nextLong();
      }
      String s = sc.next();
      int ans = 0;
      for(int j = n - 1; j >= 0; j--) {
        if(s.charAt(j) == '0') {
          
        } else {
          if(list[j + 1].contains(a[j])) {
          } else {
            ans = 1;
          }
        }
      }
      System.out.println(ans);
    }
  }
}