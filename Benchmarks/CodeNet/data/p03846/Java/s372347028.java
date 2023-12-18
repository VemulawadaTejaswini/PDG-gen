import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[100010];

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      A[a]++;
    }

    sc.close();

    int mod = 1000000007;

    if (N % 2 != 0) {

      if (A[0] != 1) {
        System.out.println(0);
        return;
      }

      for (int i = 1; i < A.length; i++) {
        if (i % 2 == 0) {
          if (A[i] % 2 != 0) {
            System.out.println(0);
            return;
          }
        } else {
          if (A[i] != 0) {
            System.out.println(0);
            return;
          }
        }
      }

    } else {

      for (int i = 0; i < A.length; i++) {
        if (i % 2 != 0) {
          if (A[i] % 2 != 0) {
            System.out.println(0);
            return;
          }
        } else {
          if (A[i] != 0) {
            System.out.println(0);
            return;
          }
        }
      }

    }

    long l = (long) N / 2;

    long result = (long) Math.pow(2, l) % mod;

    System.out.println(result);

  }

}