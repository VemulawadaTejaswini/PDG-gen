import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Solution
public class Main {
  private static Scanner in;
  private static PrintWriter out;
  private static final String INPUT = ""; // input file name

  /**
   * Interactive get next command
   */
  static int get(int pos) {
    out.println(pos + 1);
    out.flush();
    return ni();
  }

  static void solve() {
    int items = ni();
    int capacity = ni();
    int[][] arr = new int[items][2];

    int totalValue = 0;

    for (int i = 0; i < items; i++) {
      for (int j = 0; j < 2; j++) {
        arr[i][j] = ni();

        if (j == 1)
          totalValue += arr[i][j];
      }
    }

    long[] dp = new long[totalValue + 1];
    Arrays.fill(dp, (long) 1E18 + 5);
    dp[0] = 0;

    for (int i = 0; i < items; i++) {
      for (int j = totalValue; j >= 0; j--) {
        int[] currentElement = arr[i];

        if (0 <= j - currentElement[1]) {
          dp[j] = Math.min(dp[j], dp[j - currentElement[1]] + currentElement[0]);
        }
      }
    }

    long ans = 0;
    // maximum index of i greater than capacity
    for (int i = 0; i <= totalValue; i++) {
      if (dp[i] <= capacity)
        ans = Math.max(i, ans);
    }

    out.println(ans);
  }

  public static void main(String[] args) throws Exception {
    long S = System.currentTimeMillis();
    in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
    out = new PrintWriter(System.out);

    solve();
    out.flush();
    long G = System.currentTimeMillis();
    tr(G - S + "ms");
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      int t = b;
      b = a % b;
      a = t;
    }

    return a;
  }

  private static int ni() {
    return Integer.parseInt(in.next());
  }

  private static long nl() {
    return Long.parseLong(in.next());
  }

  // Math Utils
  private static int pi(int num, int pow) {
    int result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        result *= num;
      }

      num *= num;
      pow /= 2;
    }

    return result;
  }

  private static int pim(int num, int pow, int mod) {
    int result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        // keep collecting `odd` num in result
        result = (result * num) % mod;
      }

      num = (num * num) % mod;
      pow /= 2;
    }

    return result;
  }

  private static long pl(long num, long pow) {
    long result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        result *= num;
      }

      num *= num;
      pow /= 2;
    }

    return result;
  }

  private static long plm(long num, long pow, long mod) {
    long result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        // keep collecting `odd` num in result
        result = (result * num) % mod;
      }

      num = (num * num) % mod;
      pow /= 2;
    }

    return result;
  }

  static void tr(Object... o) {
    if (!INPUT.isEmpty())
      out.println(Arrays.deepToString(o));
  }
}
