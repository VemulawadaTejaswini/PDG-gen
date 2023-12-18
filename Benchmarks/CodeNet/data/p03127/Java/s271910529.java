import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] A = new int[N];

      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt();
      }

      int gcd = gcd (A[0], A[1]);
      for (int i = 2; i < A.length; ++i) {
        gcd = gcd(gcd, A[i]);
      }

      System.out.println(gcd);
    }
  }

  private static int gcd (int a, int b) {
    return b == 0 ? a : gcd (b, a % b);
  }
}