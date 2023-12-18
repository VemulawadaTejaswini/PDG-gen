import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int Q = sc.nextInt();
    int[] a = new int[Q];
    int[] b = new int[Q];
    int[] c = new int[Q];
    int[] d = new int[Q];
    for (int i = 0; i < Q; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }
    sc.close();

    int[] A = new int[N];
    Arrays.fill(A, 1);

    boolean ok = false;
    long ans = 0;

    while (!ok) {
      long sum = 0;
      for (int i = 0; i < Q; i++)
        if (A[b[i] - 1] - A[a[i] - 1] == c[i]) sum += d[i];

      ans = Long.max(ans,  sum);

      for (int i = N - 1; -1 < i; i--) {
        A[i]++;
        if (A[i] <= M) break;
        if (i == 0) ok = true;
        else A[i] = A[i - 1];
      }
    }
    System.out.println(ans);
  }
}
