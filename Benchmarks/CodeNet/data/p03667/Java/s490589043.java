import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] x = new int[n];
    int[] a = new int[n];
    int[] k = new int[n + 1];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      k[a[i]]++;
      if(a[i] >= k[a[i]]) x[a[i] - k[a[i]]]++;
    }
    int ans = 0;
    for(int i = 0; i < n; i++) {
      if(x[i] == 0) ans++;
    }
    for(int i = 0; i < m; i++) {
      int X = sc.nextInt() - 1;
      int Y = sc.nextInt();
      int t = a[X];
      a[X] = Y;
      if(t >= k[t]) {
        x[t - k[t]]--;
        if(x[t - k[t]] == 0) ans--;
      }
      k[t]--;
      if((Y - k[Y]) >= 1) {
        x[Y - k[Y] - 1]++;
        if(x[Y - k[Y] - 1] == 1) ans++;
      }
      k[Y]++;
      System.out.println(ans);
    }
  }
}