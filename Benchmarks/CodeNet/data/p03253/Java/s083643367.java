import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] divisor = new int[M];
    int tmp_M = M;
    long diff = 1000000007;
    Queue<Integer> queue = new ArrayDeque<Integer>();

    for (int i = 1; i < M; i++) {
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
      Integer a = queue.poll();
      if (a == null) break;

      ans = ans * recursion((long)(N+a-1), (long)(N-1)) / recursion((long)(a), (long)1);
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
