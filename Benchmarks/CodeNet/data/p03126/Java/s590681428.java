import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] k = new int[n];
    BitSet all = new BitSet(m);
    all.flip(0, m);
    for (int i = 1; i <= n; i++) {
      k[i - 1] = scanner.nextInt();
      BitSet a = new BitSet();
      for (int j = 1; j <= k[i - 1]; j++) {
        a.set(scanner.nextInt() - 1);
      }
      all.and(a);
    }
    System.out.println(all.cardinality());
  }
}