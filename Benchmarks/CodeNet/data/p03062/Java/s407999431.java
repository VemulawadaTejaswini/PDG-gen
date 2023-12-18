import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N];
    int cnt = 0;
    boolean zero = false;
    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
      if (A[i] < 0) {
        cnt++;
      }
      if (A[i] == 0) {
        zero = true;
      }
    }

    long ans = 0;
    for (int i = 0; i < N; i++) {
      ans += Math.abs(A[i]);
    }
    if (cnt % 2 == 0 || zero) {
      System.out.println(ans);
    } else {
      Arrays.sort(A);
      int pos = 0;
      while (A[pos] < 0) {
        pos++;
      }
      System.out.println(ans - Math.abs(A[pos]) * 2L);
    }
  }
}
