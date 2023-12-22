import java.util.*;

public class Main {
  // constant

  static final long MOD = 1000000007;
  static final int MAX_N = 100000;

  // global variables

  static long[] facts = new long[MAX_N];

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      facts[0] = 1;
      for (int k = 1; k < n; k++)
        facts[k] = ((long)k * facts[k - 1]) % MOD;

      long[] words = new long[n];
      ArrayList<Long> base = new ArrayList<Long>(n);

      for (int i = 0; i < n; i++) {
        words[i] = (long)i;
        base.add((long)i);
      }

      int r = sc.nextInt();

      for (int i = 0; i < r; i++) {
        int si = sc.nextInt() - 1;
        int ti = sc.nextInt() - 1;

        long tmp = words[si]; words[si] = words[ti]; words[ti] = tmp;
      }

      long count = 0;

      for (int i = 0; i < n; i++) {
        long w = words[i];
        int j = base.indexOf(w);
        base.remove(j);

        count = (count + j * facts[n - 1 - i]) % MOD;
      }

      System.out.println(count);
    }
  }
}