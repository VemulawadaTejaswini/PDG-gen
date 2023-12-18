import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
      A[i] = sc.nextInt();
    sc.close();

    long[] A1 = new long[N];
    long[] A2 = new long[N];
    for (int i = 0; i < N; i++) {
      if (i + A[i] < N) A1[i + A[i]]++;
      if (-1 < i - A[i]) A2[i - A[i]]++;
    }

    long ans = 0;
    for (int i = 0; i < N; i++)
      ans += A1[i] * A2[i];

    System.out.println(ans);
  }
}
