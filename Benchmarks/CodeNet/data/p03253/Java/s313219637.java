import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long N = sc.nextInt();
    long M = sc.nextLong();
    long[] divisor = new long[M];
    long tmp_M = M;
    long diff = 1000000007;
    Queue<Long> queue = new ArrayDeque<Long>();

    for (long i = 1; i < M; i++) {
      while(tmp_M % (i+1) == 0) {
        divisor[i]++;
        tmp_M /= (i+1);
      }

      if (divisor[i] > 0) {
        queue.add(divisor[i]);
      }
    }

    long ans = 1;

    while(true) {
      Long a = queue.poll();
      if (a == null) break;

      ans = ans * recursion(N+a-1, N-1) / recursion((a, 1);
    }

    System.out.println(ans % diff);
  }

  public static long recursion(long i, long stop) {
    if (i <= stop) {
      return 1;
    } else {
      return i * recursion(i-1, stop);
    }
  }
}
