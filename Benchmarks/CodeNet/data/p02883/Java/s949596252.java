// https://www.hamayanhamayan.com/entry/2019/10/27/233431_2
// http://atriasoft.work/compe-programming/861

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] A = new int[N]; // cost digest
    int[] F = new int[N]; // uneasiness
    long sumA = 0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      sumA += A[i];
    }
    if (sumA >= K) {
      System.out.println(0);
      return;
    }
    for (int i = 0; i < N; i++) {
      F[i] = sc.nextInt();
    }

    A =
        Arrays.stream(A)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
    Arrays.sort(F);

    // binary-search
    long l = 0, r = Long.MAX_VALUE;
    while (l < r) {
      long m = (l + r) / 2;
      if (isPossible(m, A, F, K)) {
        r = m;
      } else {
        l = m + 1;
      }
    }
    System.out.println(l);
  }

  static boolean isPossible(long af, int[] A, int[] F, long K) {
    long prep = 0;
    for (int i = 0; i < A.length; i++) {
      long need = af / F[i];
      prep += Math.max(0, A[i] - need);
    }
    return prep <= K;
  }
}
