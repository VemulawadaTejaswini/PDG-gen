import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long T = Long.parseLong(sc.next());
    long[] t = new long[N];
    for (int i = 0; i < N; i++) {
      t[i] = Long.parseLong(sc.next());
    }
    long ans = N * T;
    for (int i = 0; i < N - 1; i++) {
      ans -= Math.max(0L, t[i] + T - t[i + 1]);
    }
    System.out.println(ans);
  }
}