import java.util.*;

public class Main {
  public static class Pair {
    int a, b;

    public Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long K = Long.parseLong(sc.next());
    Pair[] p = new Pair[N];
    for (int i = 0; i < N; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      p[i] = new Pair(a, b);
    }
    Arrays.sort(p, (x, y) -> x.a - y.a);
    long length = 0L;
    for (int i = 0; i < N; i++) {
      length += p[i].b;
      if (K <= length) {
        System.out.println(p[i].a);
        return;
      }
    }
  }
}
