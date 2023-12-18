import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextLong();
    }
    long[] S = new long[N + 1];
    S[0] = 0L;
    for (int i = 1; i <= N; i++) {
      S[i] = S[i - 1] + A[i];
    }
    Arrays.sort(S);
    long ans = 0L;
    long before = S[0];
    long count = 1L;
    for (int i = 1; i <= N; i++) {
      if (before == S[i]) {
        count++;
      } else {
        ans += count * (count - 1) / 2;
        before = S[i];
        count = 1L;
      }
    }
    ans += count * (count - 1) / 2;
    System.out.println(ans);
  }
}