import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] t = new int[n];
    int m = 0;
    for(int i = 0; i < n; i++) {
      int p = 0;
      int s = i;
      for(int j = 0; j < 30; j++) {
        if(s >= k) break;
        s *= 2;
        p++;
      }
      t[i] = p;
      m = Math.max(m, p);
    }
    int q1 = 3 * (int)Math.pow(2, m);
    int q2 = 0;
    for(int i = 0; i < n; i++) {
      q2 += ((int)Math.pow(2, m - t[i]));
    }
    double ans = (double)q2 / (double)q1;
    System.out.println(ans);
  }
}