import java.math.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long D = sc.nextLong();
    long A = sc.nextLong();
    long[][] XH = new long[N][2];
    for (int i = 0; i < N; i++) {
      XH[i][0] = sc.nextLong();
      XH[i][1] = sc.nextLong();
    }
    sc.close();

    Arrays.sort(XH, (a, b) -> Long.compare(a[0], b[0]));
    Queue<long[]> q = new ArrayDeque<>();
    long d2 = D * 2;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      long hi = XH[i][1];
      if (hi <= 0) continue;

      long xi = XH[i][0];
      int qs = q.size();
      for (int j = 0; j < qs; j++) {
        long[] p = q.poll();
        if (xi <= p[0]) {
          hi -= p[1];
          q.add(p);
        }
      }
      hi = Math.max(0, hi);
      if (0 < hi) {
        long c = (hi + A - 1) / A;
        long ac = A * c;
        q.add(new long[] {xi + d2, ac});
        ans += c;
        hi -= ac;
      }
      XH[i][1] = Math.max(0, hi);
    }
    System.out.println(ans);
  }
}