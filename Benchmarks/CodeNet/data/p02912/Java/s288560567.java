import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    Integer[] A = new Integer[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(A, Comparator.reverseOrder());

    while (0 < M) {

      A[0] = A[0] / 2;

      for (int i = 1; i < N; i++) {
        if (A[0] < A[i]) {
          int d_ = A[0];
          A[0] = A[i];
          A[i] = d_;
          break;
        }
      }

      M--;

    }

    long sum = 0;

    for (int i = 0; i < N; i++) {
      sum += A[i];
    }

    System.out.println(sum);

  }

}