import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] imos = new int[n];
    for(int i = 0; i < m; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      imos[l - 1]++;
      if(r < n) imos[r]--;
    }
    for(int i = 1; i < n; i++) {
      imos[i] = imos[i] + imos[i - 1];
    }
    int ans = 0;
    for(int i = 0; i < n; i++) {
      if(imos[i] == m) ans++;
    }
    System.out.println(ans);
  }
}