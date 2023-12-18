import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int[] p = new int[A];
    int[] q = new int[B];
    int[] r = new int[C];
    for (int i = 0; i < A; i++) p[i] = sc.nextInt();
    for (int i = 0; i < B; i++) q[i] = sc.nextInt();
    for (int i = 0; i < C; i++) r[i] = sc.nextInt();
    sc.close();

    Arrays.sort(p);
    Arrays.sort(q);

    int[] xyc = new int[X + Y + C];
    for (int i = 0; i < X; i++) xyc[i] = p[A - i - 1];
    for (int i = 0; i < Y; i++) xyc[X + i] = q[B - i - 1];
    for (int i = 0; i < C; i++) xyc[X + Y + i] = r[i];
    Arrays.sort(xyc);

    long ans = 0;
    for (int i = 0; i < X + Y; i++)
      ans += xyc[X + Y + C - 1 - i];

    System.out.println(ans);
  }
}
