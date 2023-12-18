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
    long d = 0;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      long hi = XH[i][1];
      if (hi <= 0) continue;

      long xi = XH[i][0];
      if (!q.isEmpty() && q.peek()[0] < xi) {
        d -= q.poll()[1];
      }
      hi -= d;
      XH[i][1] = Math.max(0, hi);
      if (hi <= 0) continue;

      long c = (hi + A - 1) / A;
      long ac = A * c;
      ans += c;
      hi -= ac;
      d += ac;
      q.add(new long[] {xi + d2, ac});
      XH[i][1] = Math.max(0, hi);
    }
    System.out.println(ans);
  }
}