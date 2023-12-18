import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int Q = sc.nextInt();
    long[] A = new long[N];
    int[] P = new int[Q];
    for (int i = 0; i < Q; i++) {
      P[i] = sc.nextInt();
    }
    if (K > Q) {
      for (int i = 0; i < N; i++) {
        System.out.println("Yes");
      }
    } else {
      Arrays.fill(A, K - Q);
      System.out.println(A.length);
      for (int i = 0; i < Q; i++) {
        A[P[i] - 1] += 1;
      }
      for (int i = 0; i < N; i++) {
        if (A[i] > 0) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
    }
  }
}
