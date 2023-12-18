import java.math.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int A = sc.nextInt();
    int[][] XH = new int[N][2];
    for (int i = 0; i < N; i++) {
      XH[i][0] = sc.nextInt();
      XH[i][1] = sc.nextInt();
    }
    sc.close();

    Arrays.sort(XH, (a, b) -> Integer.compare(a[0], b[0]));
    long d2 = D * 2;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      if (XH[i][1] == 0) continue;
      long c = (long) Math.ceil(XH[i][1] / A);
      long ac = A * c;
      for (int j = i; j < N && XH[j][0] <= XH[i][0] + d2; j++) {
        XH[j][1] -= Math.min(XH[j][1], ac);
      }
      ans += c;
    }
    System.out.println(ans);
  }
}