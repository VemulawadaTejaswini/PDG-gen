import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }
    int f = 0;
    int[] ans = new int[n];
    for(int i = n - 1; i >= 0; i--) {
      int p = 0;
      int t = 0;
      for(int j = n - 1; j >= 0; j--) {
        if(a[j] == (j + 1)) {
          p = 1;
          ans[i] = (j + 1);
          t = j;
          break;
        }
      }
      if(p == 0) {
        f = 1;
        System.out.println(-1);
        break;
      } else {
        for(int j = t; j < n; j++) {
          if(j < n - 1) a[j] = a[j + 1];
          if(j == n - 1) a[j] = 0;
        }
      }
    }
    if(f == 0) {
      for(int i = 0; i < n; i++) {
        System.out.println(ans[i]);
      }
    }
  }
}