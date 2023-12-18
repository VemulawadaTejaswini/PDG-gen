import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    Pair[] p = new Pair[N];
    for (int i = 0; i < N; i++) {
      p[i] = new Pair(in.nextInt(), in.nextInt());
    }
    Arrays.sort(p, (s, t) -> s.a - t.a);
    long ans = 0;
    for (int i = 0; i < N; i++) {
      long cnt = Math.min(M, p[i].b);
      ans += (long) p[i].a * cnt;
      M -= (int) cnt;
      if (M == 0) {
        break;
      }
    }
    System.out.println(ans);
  }
}

class Pair {
  int a, b;

  public Pair(int a, int b) {
    this.a = a;
    this.b = b;
  }
}