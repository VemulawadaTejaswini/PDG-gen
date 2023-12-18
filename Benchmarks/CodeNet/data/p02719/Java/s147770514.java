import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long previous = N;
    long ans = 0;
    if (K == 1) {
      System.out.println(0);
    } else {
      while (true) {
        long AA = Math.abs(previous - K);
        if (AA == N) {
          ans = Math.min(previous, N);
          break;
        }
        N -= K;
        N = Math.abs(N);
        previous = Math.abs(N - K);
      }
    }
    System.out.println(ans);
  }
}
