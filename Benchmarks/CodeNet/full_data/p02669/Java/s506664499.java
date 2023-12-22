import java.lang.reflect.Array;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();
    long[] results = new long[tests];
    for (int t = 0; t < tests; t++) {
      long N = sc.nextLong();
      long A = sc.nextLong();
      long B = sc.nextLong();
      long C = sc.nextLong();
      long D = sc.nextLong();
      long x = 1;
      long currPrice = D;
      results[t] = coinHelper(N, A, B, C, D, x, currPrice);
    }
    for (int t = 0; t < tests; t++) {
      System.out.println(results[t]);
    }
  }


  static long coinHelper(long N, long A, long B, long C, long D, long x, long currPrice) {


    if (x >= N) {
      return Math.min(Long.MAX_VALUE, currPrice + (x - N) * D);
    }

    long copyPrice = Math.min(Long.MAX_VALUE, currPrice);
    long cx = Math.min(Long.MAX_VALUE, x);
    long m2 = coinHelper(N, A, B, C, D, Math.min(cx * 2, Long.MAX_VALUE), Math.min(copyPrice + A, Long.MAX_VALUE));
    long m3 = coinHelper(N, A, B, C, D, Math.min(cx * 3, Long.MAX_VALUE), Math.min(copyPrice + B, Long.MAX_VALUE));
    long m5 = coinHelper(N, A, B, C, D, Math.min(cx * 5, Long.MAX_VALUE), Math.min(copyPrice + C, Long.MAX_VALUE));
    long i1 = coinHelper(N, A, B, C, D, Math.min(cx + 1, Long.MAX_VALUE), Math.min(copyPrice + D, Long.MAX_VALUE));
    long[] arr = {m2, m3, m5, i1};
    Arrays.sort(arr);
    return arr[0];
  }
}
