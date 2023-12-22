import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    int ans = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      l[cnt] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        for (int k = 0; k < j; k++) {
          if (l[i] == l[j])
            continue;
          if (l[j] == l[k])
            continue;
          if (l[k] == l[i])
            continue;
          int[] ll = { l[i], l[j], l[k] };
          Arrays.sort(ll);
          if (ll[2] < ll[1] + ll[0]) {
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
    sc.close();
  }
}