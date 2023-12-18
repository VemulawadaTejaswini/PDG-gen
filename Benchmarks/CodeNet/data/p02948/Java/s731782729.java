import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(), M = in.nextInt();
    Pair[] pair = new Pair[N];
    for (int i = 0; i < N; i++) {
      pair[i] = new Pair(in.nextInt(), in.nextInt());
    }
    Arrays.sort(pair, (x, y) -> x.B == y.B ? y.A - x.A : y.B - x.B);
    int pos = 0;
    long ans = 0;
    while (M >= 0) {
      while (pos < N && pair[pos].A > M) {
        pos++;
      }
      if (pos == N) {
        break;
      }
      ans += pair[pos++].B;
      M--;
    }
    System.out.println(ans);
  }
}

class Pair {
  int A, B;

  public Pair(int A, int B) {
    this.A = A;
    this.B = B;
  }
}
