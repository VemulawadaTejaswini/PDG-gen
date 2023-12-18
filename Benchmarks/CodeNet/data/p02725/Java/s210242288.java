import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
      A[i] = sc.nextInt();
    sc.close();

    int[] d = new int[N];
    d[0] = A[0] + K - A[N - 1];
    for (int i = 1; i < N; i++)
      d[i] = A[i] - A[i - 1];
    Arrays.sort(d);

    long ans = 0;
    for (int i = 0; i < N - 1; i++)
      ans += d[i];
    System.out.println(ans);
  }
}
