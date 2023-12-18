import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    HashMap<Integer, Integer> freq = new HashMap<>();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      int aa = scanner.nextInt();
      freq.put(aa, freq.getOrDefault(aa, 0) + 1);
      a[i] = aa;
    }
    long res = 0;
    for (int f : freq.values()) {
      res += comb2(f);
    }
    res += 1 - freq.get(a[0]);
    System.out.println(res);
    for (int i = 1; i < N; i++) {
      res += 1 - freq.get(a[i]);
      res += freq.get(a[i - 1]) - 1;
      System.out.println(res);
    }
  }

  private static long comb2(long n) {
    if (n < 2) return 0;
    return n * (n - 1) / 2;
  }
}
